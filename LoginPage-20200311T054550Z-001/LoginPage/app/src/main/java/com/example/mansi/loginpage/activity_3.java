package com.example.mansi.loginpage;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class activity_3 extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

      DatacbaseHelper mydb;

      EditText Year,Subject,Teacher,Type,Hours,Classroom,Id;

      Button AddData,View_all,Update_data,del,Create,new1;

    //Button add;
    //EditText Id1,Year1,Batch1;

    Button add1,View_tt,m;
    EditText col_id,col_name,col_type;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        firebaseAuth=FirebaseAuth.getInstance();//open this activity after successful login




        mydb=new DatacbaseHelper(this);//call constuctor of databachelper class

        Id=(EditText)findViewById(R.id.id1);
        Year=(EditText)findViewById(R.id.which_year);
        Subject=(EditText)findViewById(R.id.subject);
        Teacher=(EditText)findViewById(R.id.teacher_name);
        Type=(EditText)findViewById(R.id.type);
        Hours=(EditText)findViewById(R.id.hours);
        Classroom=(EditText)findViewById(R.id.classroom);

        AddData=(Button) findViewById(R.id.add1);
        View_all=(Button) findViewById(R.id.view);
        Update_data=(Button) findViewById(R.id.update);
        del=(Button) findViewById(R.id.delete);
        Create=(Button) findViewById(R.id.create);
        new1=(Button) findViewById(R.id.new_1);


        // Id1=(EditText)findViewById(R.id.tv1);
        //Year1=(EditText)findViewById(R.id.tv2);
        //Batch1=(EditText)findViewById(R.id.tv3);
        //add=(Button) findViewById(R.id.bb1);

       // col_id=(EditText)findViewById(R.id.ctv1);
       // col_name=(EditText)findViewById(R.id.ctv2);
        //col_type=(EditText)findViewById(R.id.ctv3);


        //add1=(Button)findViewById(R.id.insert);
        View_tt=(Button)findViewById(R.id.view_tt);






         AddData();
         view_all();
         UpdateData();
         DeleteData();
         create_timetable();
        //add_pract();
         view_all_1();
        create_new();





    }
    public void create_new(){
        new1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydb.clear_tt();
            }
        });

    }

   public void create_timetable(){

        Create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //mydb.clear_tt();


                //raw code
               int c=1,i=1,p;
                String year, type,batch,col_sub,col_tea,sub,scol_name,scol_name1,status1;
                Cursor res2=mydb.get_count("TEACHER");
                if(res2.getCount()==0){
                    //show msg
                    Toast.makeText(activity_3.this,"ERROR: count not working..",Toast.LENGTH_LONG).show();
                    return;
                }
                res2.moveToNext();
                int  count=res2.getInt(0);
                if(count<1){
                    Toast.makeText(activity_3.this,"Insufficient no of teachers cannot make tt",Toast.LENGTH_LONG).show();
                    return;
                }

                    //else make timetable
                Cursor res1=mydb.selectData();

                if(res1.getCount()==0){
                    //show msg
                    Toast.makeText(activity_3.this,"Nothing found....",Toast.LENGTH_LONG).show();
                    return;

                }
                //for first period
                int j=3,counter=0,x=1,y=13;
                p=1;
                String status;
                /*for(int w=2;w<7;w++) {
                    if(w==1){
                        x=1;
                        y=13;
                        counter=0;
                    }else if(w==2){
                        x=13;
                        y=25;
                        counter=12;
                    }else if(w==3){
                        x=25;
                        y=37;
                        counter=24;
                    }else if(w==4){
                        x=37;
                        y=49;
                        counter=36;
                    }else if(w==5){
                        x=49;
                        y=61;
                        counter=48;
                    }else  if(w==6){
                        x=61;
                        y=73;
                        counter=60;
                    }else if(w==7){
                        x=73;
                        y=85;
                        counter=72;
                    }*/
                    int k=0;
                Toast.makeText(activity_3.this, "first period", Toast.LENGTH_LONG).show();
                    for (int id = x; id < y; id++) {

                      //  mydb.for_pract_keep_busy(j, p);

                        //Toast.makeText(activity_3.this, "for loop", Toast.LENGTH_LONG).show();

                        if (counter == id) {
                            res1.moveToNext();
                        } else if(counter<id){
                            while (counter < id) {
                                counter++;
                                res1.moveToNext();
                            }
                        }else if(counter>id){
                            while(counter>id){
                                counter--;
                                res1.moveToPrevious();
                            }
                        }
                        year = res1.getString(1);
                        batch = res1.getString(2);
                        type = res1.getString(j);     //.........for monday
                        col_sub = res1.getColumnName(j + 1);
                        col_tea = res1.getColumnName(j + 2);
                        scol_name=res1.getColumnName(j + 18-2*k);
                        status = res1.getString(j + 18-2*k);

                        //check status
                        if(status.equals("F")){
                            continue;
                        }


                        if (type.equals("PRACT")) {
                            id = mydb.select_pract(year, id, j, col_sub, col_tea,batch);
                           // Toast.makeText(activity_3.this, "type pract", Toast.LENGTH_LONG).show();

                        } else if (type.equals("TUT")) {

                            id = mydb.select_tut(year, id, j, col_sub, col_tea,batch);
                            //Toast.makeText(activity_3.this, "type tut "+id , Toast.LENGTH_LONG).show();

                        } else if (type.equals("LECT")) {

                            //select lecture
                            // Toast.makeText(activity_3.this, "id  "+id+" year"+year, Toast.LENGTH_LONG).show();

                            id = mydb.select_lect(year, id, j, col_sub, col_tea,scol_name);
                            // Toast.makeText(activity_3.this, "type lect  "+id, Toast.LENGTH_LONG).show();
                            //mydb.insert_lect(sub, id, j);
                        }


                        //j = j + 3;
                        if (id % 12 == 0) {
                            j = j + 3;
                            id = x-1;
                            k++;
                            mydb.update_Status(p,type);




                        }


                        if (j == 18) {
                                j = 3;
                                k=0;

                            break;

                        }

                    }

                 //for second period
                Toast.makeText(activity_3.this, "2 period", Toast.LENGTH_LONG).show();
                p=2;
                x=13;y=25;
                for (int id = x; id < y; id++) {
                   // mydb.for_pract_keep_busy(j, p);


                    //Toast.makeText(activity_3.this, "for loop", Toast.LENGTH_LONG).show();

                    if (counter == id) {
                        res1.moveToNext();
                    } else if(counter<id){
                        while (counter < id) {
                            counter++;

                            res1.moveToNext();
                        }
                    }else if(counter>id){
                        while(counter>id){
                            counter--;
                            res1.moveToPrevious();
                        }
                    }
                    year = res1.getString(1);
                    batch = res1.getString(2);
                    type = res1.getString(j);     //.........for monday
                    scol_name=res1.getColumnName(j+18-2*k);
                    col_sub = res1.getColumnName(j + 1);
                    col_tea = res1.getColumnName(j + 2);
                    status = res1.getString(j + 18-2*k);
                    //check status
                    if(status.equals("F")){
                        continue;
                    }


                    if (type.equals("PRACT")) {
                        id = mydb.select_pract(year, id, j, col_sub, col_tea,batch);
                        //Toast.makeText(activity_3.this, "type pract", Toast.LENGTH_LONG).show();

                    } else if (type.equals("TUT")) {
                        id = mydb.select_tut(year, id, j, col_sub, col_tea,batch);
                        //Toast.makeText(activity_3.this, "type tut "+id, Toast.LENGTH_LONG).show();

                    } else if (type.equals("LECT")) {

                        //select lecture
                        // Toast.makeText(activity_3.this, "id  "+id+" year"+year, Toast.LENGTH_LONG).show();

                        id = mydb.select_lect(year, id, j, col_sub, col_tea,scol_name);
                        // Toast.makeText(activity_3.this, "type lect  "+id, Toast.LENGTH_LONG).show();
                        //mydb.insert_lect(sub, id, j);
                    }


                    //j = j + 3;
                    if (id % 12 == 0) {
                        j = j + 3;
                        id = x-1;
                        k++;
                        mydb.update_Status(p,type);



                    }


                    if (j == 18) {
                        j = 3;
                        k=0;
                        break;

                    }

                }
                Toast.makeText(activity_3.this, "3 period", Toast.LENGTH_LONG).show();

                //for third period
                x=25;y=37;
                p=3;
                for (int id = x; id < y; id++) {
                   // mydb.for_pract_keep_busy(j, p);


                    //Toast.makeText(activity_3.this, "for loop", Toast.LENGTH_LONG).show();

                    if (counter == id) {
                        res1.moveToNext();
                    } else if(counter<id){
                        while (counter < id) {
                            counter++;
                            res1.moveToNext();
                        }
                    }else if(counter>id){
                        while(counter>id){
                            counter--;
                            res1.moveToPrevious();
                        }
                    }
                    year = res1.getString(1);
                    batch = res1.getString(2);
                    type = res1.getString(j);     //.........for monday
                    scol_name=res1.getColumnName(j+18-2*k);
                    col_sub = res1.getColumnName(j + 1);
                    col_tea = res1.getColumnName(j + 2);
                    status = res1.getString(j + 18-2*k);
                    //check status

                    if(status.equals("F")){
                        continue;
                    }


                    if (type.equals("PRACT")) {
                       // id = mydb.select_pract(year, id, j, col_sub, col_tea,batch);
                        id=id+3;
                       // Toast.makeText(activity_3.this, "type pract "+id, Toast.LENGTH_LONG).show();

                    } else if (type.equals("TUT")) {
                        id = mydb.select_tut(year, id, j, col_sub, col_tea,batch);
                        //Toast.makeText(activity_3.this, "type tut "+id, Toast.LENGTH_LONG).show();

                    } else if (type.equals("LECT")) {

                        //select lecture
                        // Toast.makeText(activity_3.this, "id  "+id+" year"+year, Toast.LENGTH_LONG).show();

                        id = mydb.select_lect(year, id, j, col_sub, col_tea,scol_name);
                        // Toast.makeText(activity_3.this, "type lect  "+id, Toast.LENGTH_LONG).show();
                        //mydb.insert_lect(sub, id, j);
                    }


                    //j = j + 3;
                    if (id % 12 == 0) {
                        j = j + 3;
                        id = x-1;
                        k++;
                        mydb.update_Status(p,type);



                    }


                    if (j == 18) {
                        j = 3;
                        k=0;
                        break;

                    }

                }

                //for forth period
                Toast.makeText(activity_3.this, "4 period", Toast.LENGTH_LONG).show();

                x=37;y=49;
                p=4;
                for (int id = x; id < y; id++) {
                    //mydb.for_pract_keep_busy(j, p);


                    //Toast.makeText(activity_3.this, "for loop", Toast.LENGTH_LONG).show();

                    if (counter == id) {
                        res1.moveToNext();
                    } else if(counter<id){
                        while (counter < id) {
                            counter++;
                            res1.moveToNext();
                        }
                    }else if(counter>id){
                        while(counter>id){
                            counter--;
                            res1.moveToPrevious();
                        }
                    }
                    year = res1.getString(1);
                    batch = res1.getString(2);
                    type = res1.getString(j);     //.........for monday
                    scol_name=res1.getColumnName(j+18-2*k);
                    col_sub = res1.getColumnName(j + 1);
                    col_tea = res1.getColumnName(j + 2);
                    status = res1.getString(j + 18-2*k);
                    //check status
                    if(status.equals("F")){
                        continue;
                    }


                    if (type.equals("PRACT")) {
                        id = mydb.select_pract(year, id, j, col_sub, col_tea,batch);

                       // Toast.makeText(activity_3.this, "type pract "+id, Toast.LENGTH_LONG).show();

                    } else if (type.equals("TUT")) {
                        id = mydb.select_tut(year, id, j, col_sub, col_tea,batch);
                       // Toast.makeText(activity_3.this, "type tut "+id, Toast.LENGTH_LONG).show();

                    } else if (type.equals("LECT")) {

                        //select lecture
                        // Toast.makeText(activity_3.this, "id  "+id+" year"+year, Toast.LENGTH_LONG).show();

                        id = mydb.select_lect(year, id, j, col_sub, col_tea,scol_name);
                        // Toast.makeText(activity_3.this, "type lect  "+id, Toast.LENGTH_LONG).show();
                        //mydb.insert_lect(sub, id, j);
                    }


                    //j = j + 3;
                    if (id % 12 == 0) {
                        j = j + 3;
                        id = x-1;
                        k++;
                        mydb.update_Status(p,type);


                    }


                    if (j == 18) {
                        j = 3;
                        k=0;

                        break;

                    }

                }//for fifth period
                Toast.makeText(activity_3.this, "5 period", Toast.LENGTH_LONG).show();

                x=49;y=61;
                p=5;
                for (int id = x; id < y; id++) {
                    //mydb.for_pract_keep_busy(j, p);

                    //Toast.makeText(activity_3.this, "for loop", Toast.LENGTH_LONG).show();

                    if (counter == id) {
                        res1.moveToNext();
                    } else if(counter<id){
                        while (counter < id) {
                            counter++;
                            res1.moveToNext();
                        }
                    }else if(counter>id){
                        while(counter>id){
                            counter--;
                            res1.moveToPrevious();
                        }
                    }
                    year = res1.getString(1);
                    batch = res1.getString(2);
                    type = res1.getString(j);     //.........for monday
                    scol_name=res1.getColumnName(j+18-2*k);
                    col_sub = res1.getColumnName(j + 1);
                    col_tea = res1.getColumnName(j + 2);
                    status = res1.getString(j + 18-2*k);
                    //check status
                    if(status.equals("F")){
                        continue;
                    }


                    if (type.equals("PRACT")) {
                      //  id = mydb.select_pract(year, id, j, col_sub, col_tea,batch);
                        id=id+3;
                       // Toast.makeText(activity_3.this, "type pract", Toast.LENGTH_LONG).show();

                    } else if (type.equals("TUT")) {
                        id = mydb.select_tut(year, id, j, col_sub, col_tea,batch);
                        //Toast.makeText(activity_3.this, "type tut "+id, Toast.LENGTH_LONG).show();

                    } else if (type.equals("LECT")) {

                        //select lecture
                        // Toast.makeText(activity_3.this, "id  "+id+" year"+year, Toast.LENGTH_LONG).show();

                        id = mydb.select_lect(year, id, j, col_sub, col_tea,scol_name);
                        // Toast.makeText(activity_3.this, "type lect  "+id, Toast.LENGTH_LONG).show();
                        //mydb.insert_lect(sub, id, j);
                    }


                    //j = j + 3;
                    if (id % 12 == 0) {
                        j = j + 3;
                        id = x-1;
                        k++;
                        mydb.update_Status(p,type);


                    }


                    if (j == 18) {
                        j = 3;
                        k=0;

                        break;

                    }

                }
                //for sixth period
                p=6;
                Toast.makeText(activity_3.this, "6 period", Toast.LENGTH_LONG).show();

                x=61;y=73;
                for (int id = x; id < y; id++) {
                    //mydb.for_pract_keep_busy(j, p);


                    //Toast.makeText(activity_3.this, "for loop", Toast.LENGTH_LONG).show();

                    if (counter == id) {
                        res1.moveToNext();
                    } else if(counter<id){
                        while (counter < id) {
                            counter++;
                            res1.moveToNext();
                        }
                    }else if(counter>id){
                        while(counter>id){
                            counter--;
                            res1.moveToPrevious();
                        }
                    }
                    year = res1.getString(1);
                    batch = res1.getString(2);
                    type = res1.getString(j);     //.........for monday
                    scol_name=res1.getColumnName(j+18-2*k);
                    col_sub = res1.getColumnName(j + 1);
                    col_tea = res1.getColumnName(j + 2);
                    status = res1.getString(j + 18-2*k);
                    //check status
                    if(status.equals("F")){
                        continue;
                    }


                    if (type.equals("PRACT")) {
                        id = mydb.select_pract(year, id, j, col_sub, col_tea,batch);

                        //Toast.makeText(activity_3.this, "type pract", Toast.LENGTH_LONG).show();

                    } else if (type.equals("TUT")) {
                        id = mydb.select_tut(year, id, j, col_sub, col_tea,batch);
                        //Toast.makeText(activity_3.this, "type tut "+id, Toast.LENGTH_LONG).show();

                    } else if (type.equals("LECT")) {

                        //select lecture
                        // Toast.makeText(activity_3.this, "id  "+id+" year"+year, Toast.LENGTH_LONG).show();

                        id = mydb.select_lect(year, id, j, col_sub, col_tea,scol_name);
                        // Toast.makeText(activity_3.this, "type lect  "+id, Toast.LENGTH_LONG).show();
                        //mydb.insert_lect(sub, id, j);
                    }


                    //j = j + 3;
                    if (id % 12 == 0) {
                        j = j + 3;
                        id = x-1;
                        k++;
                        mydb.update_Status(p,type);



                    }


                    if (j == 18) {
                        j = 3;
                        k=0;
                        break;

                    }

                }
                //for seventh period
                Toast.makeText(activity_3.this, "7 period", Toast.LENGTH_LONG).show();

                x=73;y=85;
                p=7;
                for (int id = x; id < y; id++) {
                    //mydb.for_pract_keep_busy(j, p);

                    //Toast.makeText(activity_3.this, "for loop", Toast.LENGTH_LONG).show();

                    if (counter == id) {
                        res1.moveToNext();
                    } else if(counter<id){
                        while (counter < id) {
                            counter++;
                            res1.moveToNext();
                        }
                    }else if(counter>id){
                        while(counter>id){
                            counter--;
                            res1.moveToPrevious();
                        }
                    }
                    year = res1.getString(1);
                    batch = res1.getString(2);
                    type = res1.getString(j);     //.........for monday
                    scol_name=res1.getColumnName(j+18-2*k);
                    col_sub = res1.getColumnName(j + 1);
                    col_tea = res1.getColumnName(j + 2);
                    status = res1.getString(j + 18-2*k);
                    //check status
                    if(status.equals("F")){
                        continue;
                    }


                    if (type.equals("PRACT")) {
                        //id = mydb.select_pract(year, id, j, col_sub, col_tea,batch);
                        id=id+3;
                       // Toast.makeText(activity_3.this, "type pract", Toast.LENGTH_LONG).show();

                    } else if (type.equals("TUT")) {
                        id = mydb.select_tut(year, id, j, col_sub, col_tea,batch);
                       // Toast.makeText(activity_3.this, "type tut "+id, Toast.LENGTH_LONG).show();

                    } else if (type.equals("LECT")) {

                        //select lecture
                        // Toast.makeText(activity_3.this, "id  "+id+" year"+year, Toast.LENGTH_LONG).show();

                        id = mydb.select_lect(year, id, j, col_sub, col_tea,scol_name);
                        // Toast.makeText(activity_3.this, "type lect  "+id, Toast.LENGTH_LONG).show();
                        //mydb.insert_lect(sub, id, j);
                    }


                    //j = j + 3;
                    if (id % 12 == 0) {
                        j = j + 3;
                        id = x-1;
                        k++;
                        mydb.update_Status(p,type);


                    }


                    if (j == 18) {
                        j = 3;
                        k=0;
                        break;

                    }

                }

            }
        });
    }





    public void DeleteData(){
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Integer deletedRows=mydb.deleteData(Id.getText().toString());
                if(deletedRows>0)
                    Toast.makeText(activity_3.this,"data deleted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(activity_3.this,"data not deleted",Toast.LENGTH_LONG).show();


            }
        });
    }



   public void UpdateData(){
        Update_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdated=mydb.updateData(Id.getText().toString(),
                        Year.getText().toString(),Subject.getText().toString(),
                        Teacher.getText().toString(),Type.getText().toString(),
                        Hours.getText().toString(),Classroom.getText().toString());
                if(isUpdated==true)
                    Toast.makeText(activity_3.this,"data updated",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(activity_3.this,"data not updated",Toast.LENGTH_LONG).show();


            }
        });

    }
   /* public void add_pract(){
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdated=mydb.updateData1(col_id.getText().toString(),
                        col_name.getText().toString(),col_type.getText().toString());
                if(isUpdated==true)
                    Toast.makeText(activity_3.this,"data updated",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(activity_3.this,"data not updated",Toast.LENGTH_LONG).show();

            }
        });
    }*/





    public void view_all(){
        View_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.get_alldata();
                if(res.getCount()==0){
                    //show msg
                    showMsg("Error","Nothing Found");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("ID : "+res.getString(0)+"\n");
                    buffer.append("Year : "+res.getString(1)+"\n");
                    buffer.append("Subject : "+res.getString(2)+"\n");
                    buffer.append("Teacher : "+res.getString(3)+"\n");
                    buffer.append("Type : "+res.getString(4)+"\n");
                    buffer.append("Hours per week : "+res.getString(5)+"\n");
                    buffer.append("Classroom Room : "+res.getString(6)+"\n\n");

                }
                //show all data
                showMsg("Data",buffer.toString());


            }
        });
    }



    public void showMsg(String title,String msg){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.show();

    }

    public void AddData(){
        AddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted=mydb.insertData(Id.getText().toString(),
                        Year.getText().toString(),
                        Subject.getText().toString(),
                        Teacher.getText().toString(),
                        Type.getText().toString(),
                        Hours.getText().toString(),
                        Classroom.getText().toString());
                if(isInserted==true)
                    Toast.makeText(activity_3.this,"data inserted",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(activity_3.this,"data not inserted",Toast.LENGTH_LONG).show();

            }
        });
    }

    public void view_all_1(){
        View_tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb.get_alldata_1();
                if(res.getCount()==0){
                    //show msg
                    showMsg_1("Error","Nothing Found");
                    return;
                }
                StringBuffer buffer1=new StringBuffer();
                int i=0,j=1;
                while(res.moveToNext()){
                    if(i%12==0){
                        buffer1.append("\n\n******************************");
                        buffer1.append("\n\n                    Period no. : "+j);
                        j++;

                    }

                    buffer1.append("\n\n        *  ID : "+res.getString(0)+"\n");

                    buffer1.append("          Year : "+res.getString(1)+"\n");
                    buffer1.append("          Batch : "+res.getString(2)+"\n");
                    buffer1.append("\n   Monday\nType : "+res.getString(3)+"\n");
                    buffer1.append("Subject : "+res.getString(4)+"\n");

                    buffer1.append("\n   Tuesday\nType : "+res.getString(6)+"\n");
                    buffer1.append("Subject : "+res.getString(7)+"\n");

                    buffer1.append("\n   Wednesday\nType : "+res.getString(9)+"\n");
                    buffer1.append("Subject : "+res.getString(10)+"\n");

                    buffer1.append("\n   Thusday\nType : "+res.getString(12)+"\n");
                    buffer1.append("Subject : "+res.getString(13)+"\n");

                    buffer1.append("\n   Friday\nType : "+res.getString(15)+"\n");
                    buffer1.append("Subject : "+res.getString(16)+"\n");

                    buffer1.append("\n   Saturday\nType : "+res.getString(18)+"\n");
                    buffer1.append("Subject : "+res.getString(19)+"\n");

                    i++;

                }
                //show all data
                showMsg_1("Timetable",buffer1.toString());


            }
        });
    }

    public void showMsg_1(String title,String msg){
        AlertDialog.Builder builder1=new AlertDialog.Builder(this);
        builder1.setCancelable(true);
        builder1.setTitle(title);
        builder1.setMessage(msg);
        builder1.show();

    }


    /*public void AddData1(){
        add.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Toast.makeText(activity_3.this,"listener call",Toast.LENGTH_LONG).show();

                boolean isInserted=mydb.insertData(Id1.getText().toString(),
                        Year1.getText().toString(),
                        Batch1.getText().toString());
                if(isInserted==true)
                    Toast.makeText(activity_3.this,"data inserted into timetable",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(activity_3.this,"data not inserted not inserted into timetable",Toast.LENGTH_LONG).show();

            }
        });
    }*/





    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(activity_3.this,navigation.class));

    }
    private void Add_Admin(){
        //finish();
        startActivity(new Intent(activity_3.this,SecondActivity.class));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.logoutMenu:{
                Logout();
                break;
            }case R.id.add_admin:{
                Add_Admin();
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }
}
