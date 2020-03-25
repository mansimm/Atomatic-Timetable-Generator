package com.example.mansi.loginpage;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class time_table extends AppCompatActivity {

    public Button Master,Se,Te,Be;

    //databaseHelper mydb1;
    databaseHelper mydb1 = new databaseHelper(this);
    databaseHelper mydb2 = new databaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);


        Master=(Button)findViewById(R.id.master);
        Se=(Button)findViewById(R.id.se);
        Te=(Button)findViewById(R.id.te);
        Be=(Button)findViewById(R.id.be);

        show_master();


        //view_all_2();
        view_SE();
        view_TE();
        view_BE();



    }

    public void show_master(){
        Master.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(time_table.this,Master.class));


                //view_all_2();
            }
        });
    }





   /* public void view_all_2(){
        Master.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=mydb1.get_alldata_2();
                if(res.getCount()==0){
                    //show msg
                    showMsg_2("Error","Nothing Found");
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
                showMsg_2("Timetable",buffer1.toString());


            }
        });
    }*/




    public void showMsg_2(String title,String msg){
        AlertDialog.Builder builder1=new AlertDialog.Builder(this);
        builder1.setCancelable(true);
        builder1.setTitle(title);
        builder1.setMessage(msg);
        builder1.show();

    }


    public void view_SE(){
        Se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(time_table.this,sample2.class));

            }
        });
    }

    public void view_TE(){
        Te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(time_table.this,sample3.class));

            }
        });
    }
    public void view_BE(){
        Be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(time_table.this,sample4.class));

            }
        });
    }






}
