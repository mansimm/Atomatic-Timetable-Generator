package com.example.mansi.loginpage;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class sample3 extends AppCompatActivity {

    DatacbaseHelper mydb3 = new DatacbaseHelper(this);

    TextView Mon1T,Mon2T,Mon3T,Mon4T,Mon5T,Mon6T,Mon7T;
    TextView Tue1T,Tue2T,Tue3T,Tue4T,Tue5T,Tue6T,Tue7T;
    TextView Wed1T,Wed2T,Wed3T,Wed4T,Wed5T,Wed6T,Wed7T;
    TextView Thus1T,Thus2T,Thus3T,Thus4T,Thus5T,Thus6T,Thus7T;
    TextView Fri1T,Fri2T,Fri3T,Fri4T,Fri5T,Fri6T,Fri7T;
    TextView Sat1T,Sat2T,Sat3T,Sat4T,Sat5T,Sat6T,Sat7T;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample3);

        Mon1T=(TextView)findViewById(R.id.mon1T);
        Tue1T=(TextView)findViewById(R.id.tue1T);
        Wed1T=(TextView)findViewById(R.id.wed1T);
        Thus1T=(TextView)findViewById(R.id.thus1T);
        Fri1T=(TextView)findViewById(R.id.fri1T);
        Sat1T=(TextView)findViewById(R.id.sat1T);


        Mon2T=(TextView)findViewById(R.id.mon2T);
        Tue2T=(TextView)findViewById(R.id.tue2T);
        Wed2T=(TextView)findViewById(R.id.wed2T);
        Thus2T=(TextView)findViewById(R.id.thus2T);
        Fri2T=(TextView)findViewById(R.id.fri2T);
        Sat2T=(TextView)findViewById(R.id.sat2T);


        Mon3T=(TextView)findViewById(R.id.mon3T);
        Tue3T=(TextView)findViewById(R.id.tue3T);
        Wed3T=(TextView)findViewById(R.id.wed3T);
        Thus3T=(TextView)findViewById(R.id.thus3T);
        Fri3T=(TextView)findViewById(R.id.fri3T);
        Sat3T=(TextView)findViewById(R.id.sat3T);

        Mon4T=(TextView)findViewById(R.id.mon4T);
        Tue4T=(TextView)findViewById(R.id.tue4T);
        Wed4T=(TextView)findViewById(R.id.wed4T);
        Thus4T=(TextView)findViewById(R.id.thus4T);
        Fri4T=(TextView)findViewById(R.id.fri4T);
        Sat4T=(TextView)findViewById(R.id.sat4T);

        Mon5T=(TextView)findViewById(R.id.mon5T);
        Tue5T=(TextView)findViewById(R.id.tue5T);
        Wed5T=(TextView)findViewById(R.id.wed5T);
        Thus5T=(TextView)findViewById(R.id.thus5T);
        Fri5T=(TextView)findViewById(R.id.fri5T);
        Sat5T=(TextView)findViewById(R.id.sat5T);

        Mon6T=(TextView)findViewById(R.id.mon6T);
        Tue6T=(TextView)findViewById(R.id.tue6T);
        Wed6T=(TextView)findViewById(R.id.wed6T);
        Thus6T=(TextView)findViewById(R.id.thus6T);
        Fri6T=(TextView)findViewById(R.id.fri6T);
        Sat6T=(TextView)findViewById(R.id.sat6T);

        Mon7T=(TextView)findViewById(R.id.mon7T);
        Tue7T=(TextView)findViewById(R.id.tue7T);
        Wed7T=(TextView)findViewById(R.id.wed7T);
        Thus7T=(TextView)findViewById(R.id.thus7T);
        Fri7T=(TextView)findViewById(R.id.fri7T);
        Sat7T=(TextView)findViewById(R.id.sat7T);
        set3();

    }

    public void set3()
    {
        int i=1,j=1,p=1;
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();
        List<String> list4 = new ArrayList<String>();

        for(int k=0;k<6;k++){
            list1.add("off");
            list2.add("off");
            list3.add("off");
            list4.add("off");

        }
        Cursor cursor = mydb3.getCursor3();
        if(cursor.getCount()==0){
            //show msg
            Toast.makeText(sample3.this,"ERROR: cursor is empty",Toast.LENGTH_LONG).show();
            return;
        }
        if (cursor.moveToFirst()) {
            do {
                String id=cursor.getString(0);
                i=Integer.valueOf(id);

                list1.set(0,cursor.getString(4));
                list1.set(1,cursor.getString(7));
                list1.set(2,cursor.getString(10));
                list1.set(3,cursor.getString(13));
                list1.set(4,cursor.getString(16));
                list1.set(5,cursor.getString(19));

                cursor.moveToNext();
                list2.set(0,cursor.getString(4));
                list2.set(1,cursor.getString(7));
                list2.set(2,cursor.getString(10));
                list2.set(3,cursor.getString(13));
                list2.set(4,cursor.getString(16));
                list2.set(5,cursor.getString(19));

                cursor.moveToNext();
                list3.set(0,cursor.getString(4));
                list3.set(1,cursor.getString(7));
                list3.set(2,cursor.getString(10));
                list3.set(3,cursor.getString(13));
                list3.set(4,cursor.getString(16));
                list3.set(5,cursor.getString(19));

                cursor.moveToNext();
                list4.set(0,cursor.getString(4));
                list4.set(1,cursor.getString(7));
                list4.set(2,cursor.getString(10));
                list4.set(3,cursor.getString(13));
                list4.set(4,cursor.getString(16));
                list4.set(5,cursor.getString(19));

                if(p==1){
                    Mon1T.setText(list1.get(0));
                    Tue1T.setText(list1.get(1));
                    Wed1T.setText(list1.get(2));
                    Thus1T.setText(list1.get(3));
                    Fri1T.setText(list1.get(4));
                    Sat1T.setText(list1.get(5));
                }
                else if(p==2){
                    Mon2T.setText(list1.get(0));
                    Tue2T.setText(list1.get(1));
                    Wed2T.setText(list1.get(2));
                    Thus2T.setText(list1.get(3));
                    Fri2T.setText(list1.get(4));
                    Sat2T.setText(list1.get(5));

                }else if(p==3){
                    Mon3T.setText(list1.get(0));
                    Tue3T.setText(list1.get(1));
                    Wed3T.setText(list1.get(2));
                    Thus3T.setText(list1.get(3));
                    Fri3T.setText(list1.get(4));
                    Sat3T.setText(list1.get(5));

                }else if(p==4){
                    Mon4T.setText("T1:"+list1.get(0)+" T2:"+list2.get(0)+" T3:"+list3.get(0)+" T4:"+list4.get(0));
                    Tue4T.setText("T1:"+list1.get(1)+" T2:"+list2.get(1)+" T3:"+list3.get(1)+" T4:"+list4.get(1));
                    Wed4T.setText("T1:"+list1.get(2)+" T2:"+list2.get(2)+" T3:"+list3.get(2)+" T4:"+list4.get(2));
                    Thus4T.setText("T1:"+list1.get(3)+" T2:"+list2.get(3)+" T3:"+list3.get(3)+" T4:"+list4.get(3));
                    Fri4T.setText("T1:"+list1.get(4)+" T2:"+list2.get(4)+" T3:"+list3.get(4)+" T4:"+list4.get(4));
                    Sat4T.setText("T1:"+list1.get(5)+" T2:"+list2.get(5)+" T3:"+list3.get(5)+" T4:"+list4.get(5));


                }else if(p==5){
                    Mon5T.setText("T1:"+list1.get(0)+" T2:"+list2.get(0)+" T3:"+list3.get(0)+" T4:"+list4.get(0));
                    Tue5T.setText("T1:"+list1.get(1)+" T2:"+list2.get(1)+" T3:"+list3.get(1)+" T4:"+list4.get(1));
                    Wed5T.setText("T1:"+list1.get(2)+" T2:"+list2.get(2)+" T3:"+list3.get(2)+" T4:"+list4.get(2));
                    Thus5T.setText("T1:"+list1.get(3)+" T2:"+list2.get(3)+" T3:"+list3.get(3)+" T4:"+list4.get(3));
                    Fri5T.setText("T1:"+list1.get(4)+" T2:"+list2.get(4)+" T3:"+list3.get(4)+" T4:"+list4.get(4));
                    Sat5T.setText("T1:"+list1.get(5)+" T2:"+list2.get(5)+" T3:"+list3.get(5)+" T4:"+list4.get(5));



                }else if(p==6){
                    Mon6T.setText(list1.get(0));
                    Tue6T.setText(list1.get(1));
                    Wed6T.setText(list1.get(2));
                    Thus6T.setText(list1.get(3));
                    Fri6T.setText(list1.get(4));
                    Sat6T.setText(list1.get(5));



                }else if(p==7){

                    Mon7T.setText(list1.get(0));
                    Tue7T.setText(list1.get(1));
                    Wed7T.setText(list1.get(2));
                    Thus7T.setText(list1.get(3));
                    Fri7T.setText(list1.get(4));
                    Sat7T.setText(list1.get(5));
                }

                p++;
            } while (cursor.moveToNext());
        }
    }
}
