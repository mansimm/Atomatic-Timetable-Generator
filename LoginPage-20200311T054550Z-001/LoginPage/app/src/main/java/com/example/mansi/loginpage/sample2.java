package com.example.mansi.loginpage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class sample2 extends AppCompatActivity {

   DatacbaseHelper mydb3 = new DatacbaseHelper(this);

    TextView Mon1,Mon2,Mon3,Mon4,Mon5,Mon6,Mon7;
    TextView Tue1,Tue2,Tue3,Tue4,Tue5,Tue6,Tue7;
    TextView Wed1,Wed2,Wed3,Wed4,Wed5,Wed6,Wed7;
    TextView Thus1,Thus2,Thus3,Thus4,Thus5,Thus6,Thus7;
    TextView Fri1,Fri2,Fri3,Fri4,Fri5,Fri6,Fri7;
    TextView Sat1,Sat2,Sat3,Sat4,Sat5,Sat6,Sat7;



    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2);

        Mon1= findViewById(R.id.mon1);
        Tue1= findViewById(R.id.tue1);
        Wed1= findViewById(R.id.wed1);
        Thus1= findViewById(R.id.thus1);
        Fri1= findViewById(R.id.fri1);
        Sat1= findViewById(R.id.sat1);


        Mon2= findViewById(R.id.mon2);
        Tue2= findViewById(R.id.tue2);
        Wed2= findViewById(R.id.wed2);
        Thus2= findViewById(R.id.thus2);
        Fri2= findViewById(R.id.fri2);
        Sat2= findViewById(R.id.sat2);


        Mon3= findViewById(R.id.mon3);
        Tue3= findViewById(R.id.tue3);
        Wed3= findViewById(R.id.wed3);
        Thus3= findViewById(R.id.thus3);
        Fri3= findViewById(R.id.fri3);
        Sat3= findViewById(R.id.sat3);

        Mon4= findViewById(R.id.mon4);
        Tue4= findViewById(R.id.tue4);
        Wed4= findViewById(R.id.wed4);
        Thus4= findViewById(R.id.thus4);
        Fri4= findViewById(R.id.fri4);
        Sat4= findViewById(R.id.sat4);

        Mon5= findViewById(R.id.mon5);
        Tue5= findViewById(R.id.tue5);
        Wed5= findViewById(R.id.wed5);
        Thus5= findViewById(R.id.thus5);
        Fri5= findViewById(R.id.fri5);
        Sat5= findViewById(R.id.sat5);

        Mon6= findViewById(R.id.mon6);
        Tue6= findViewById(R.id.tue6);
        Wed6= findViewById(R.id.wed6);
        Thus6= findViewById(R.id.thus6);
        Fri6= findViewById(R.id.fri6);
        Sat6= findViewById(R.id.sat6);

        Mon7= findViewById(R.id.mon7);
        Tue7= findViewById(R.id.tue7);
        Wed7= findViewById(R.id.wed7);
        Thus7= findViewById(R.id.thus7);
        Fri7= findViewById(R.id.fri7);
        Sat7= findViewById(R.id.sat7);
        set();

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void set()
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
        Cursor cursor = mydb3.getCursor2();
        if(cursor.getCount()==0){
            //show msg
            Toast.makeText(sample2.this,"ERROR: cursor is empty",Toast.LENGTH_LONG).show();
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
                    Mon1.setText(list1.get(0));
                    Tue1.setText(list1.get(1));
                    Wed1.setText(list1.get(2));
                    Thus1.setText(list1.get(3));
                    Fri1.setText(list1.get(4));
                    Sat1.setText(list1.get(5));
                }
                else if(p==2){
                    Mon2.setText(list1.get(0));
                    Tue2.setText(list1.get(1));
                    Wed2.setText(list1.get(2));
                    Thus2.setText(list1.get(3));
                    Fri2.setText(list1.get(4));
                    Sat2.setText(list1.get(5));

                }else if(p==3){
                    Mon3.setText(list1.get(0));
                    Tue3.setText(list1.get(1));
                    Wed3.setText(list1.get(2));
                    Thus3.setText(list1.get(3));
                    Fri3.setText(list1.get(4));
                    Sat3.setText(list1.get(5));

                }else if(p==4){
                    Mon4.setText(list1.get(0));
                    Tue4.setText(list1.get(1));
                    Wed4.setText(list1.get(2));
                    Thus4.setText(list1.get(3));
                    Fri4.setText(list1.get(4));
                    Sat4.setText(list1.get(5));

                }else if(p==5){
                    Mon5.setText(list1.get(0));
                    Tue5.setText(list1.get(1));
                    Wed5.setText(list1.get(2));
                    Thus5.setText(list1.get(3));
                    Fri5.setText(list1.get(4));
                    Sat5.setText(list1.get(5));

                }else if(p==6){
                Mon6.setText("S1:"+list1.get(0)+" S2:"+list2.get(0)+" S3:"+list3.get(0)+" S4:"+list4.get(0));
                Tue6.setText("S1:"+list1.get(1)+" S2:"+list2.get(1)+" S3:"+list3.get(1)+" S4:"+list4.get(1));
                Wed6.setText("S1:"+list1.get(2)+" S2:"+list2.get(2)+" S3:"+list3.get(2)+" S4:"+list4.get(2));
                Thus6.setText("S1:"+list1.get(3)+" S2:"+list2.get(3)+" S3:"+list3.get(3)+" S4:"+list4.get(3));
                Fri6.setText("S1:"+list1.get(4)+" S2:"+list2.get(4)+" S3:"+list3.get(4)+" S4:"+list4.get(4));
                Sat6.setText("S1:"+list1.get(5)+" S2:"+list2.get(5)+" S3:"+list3.get(5)+" S4:"+list4.get(5));

                }else if(p==7){
                    Mon7.setText("S1:"+list1.get(0)+" S2:"+list2.get(0)+" S3:"+list3.get(0)+" S4:"+list4.get(0));
                    Tue7.setText("S1:"+list1.get(1)+" S2:"+list2.get(1)+" S3:"+list3.get(1)+" S4:"+list4.get(1));
                    Wed7.setText("S1:"+list1.get(2)+" S2:"+list2.get(2)+" S3:"+list3.get(2)+" S4:"+list4.get(2));
                    Thus7.setText("S1:"+list1.get(3)+" S2:"+list2.get(3)+" S3:"+list3.get(3)+" S4:"+list4.get(3));
                    Fri7.setText("S1:"+list1.get(4)+" S2:"+list2.get(4)+" S3:"+list3.get(4)+" S4:"+list4.get(4));
                    Sat7.setText("S1:"+list1.get(5)+" S2:"+list2.get(5)+" S3:"+list3.get(5)+" S4:"+list4.get(5));

                }

                p++;
            } while (cursor.moveToNext());
        }
    }
}
/*

<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout
    xmnls:android="http://schemas.android.com/apk/res/android"
    xmlns:xmnls="http://schemas.android.com/apk/res-auto"
    xmlns:xmnls="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmnls:layout_width="match_parent"
    xmnls:layout_height="match_parent"
    tools:context=".MainActivity"
    >



</android.support.constraint.ConstraintLayout>
 */