package com.example.mansi.loginpage;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Master extends AppCompatActivity {

    DatacbaseHelper mydb4 = new DatacbaseHelper(this);
    TextView Mon1, Mon2, Mon3, Mon4, Mon5, Mon6, Mon7;
    TextView Tue1, Tue2, Tue3, Tue4, Tue5, Tue6, Tue7;
    TextView Wed1, Wed2, Wed3, Wed4, Wed5, Wed6, Wed7;
    TextView Thus1, Thus2, Thus3, Thus4, Thus5, Thus6, Thus7;
    TextView Fri1, Fri2, Fri3, Fri4, Fri5, Fri6, Fri7;
    TextView Sat1, Sat2, Sat3, Sat4, Sat5, Sat6, Sat7;


    TextView Mon1T,Mon2T,Mon3T,Mon4T,Mon5T,Mon6T,Mon7T;
    TextView Tue1T,Tue2T,Tue3T,Tue4T,Tue5T,Tue6T,Tue7T;
    TextView Wed1T,Wed2T,Wed3T,Wed4T,Wed5T,Wed6T,Wed7T;
    TextView Thus1T,Thus2T,Thus3T,Thus4T,Thus5T,Thus6T,Thus7T;
    TextView Fri1T,Fri2T,Fri3T,Fri4T,Fri5T,Fri6T,Fri7T;
    TextView Sat1T,Sat2T,Sat3T,Sat4T,Sat5T,Sat6T,Sat7T;

    TextView Mon1B,Mon2B,Mon3B,Mon4B,Mon5B,Mon6B,Mon7B;
    TextView Tue1B,Tue2B,Tue3B,Tue4B,Tue5B,Tue6B,Tue7B;
    TextView Wed1B,Wed2B,Wed3B,Wed4B,Wed5B,Wed6B,Wed7B;
    TextView Thus1B,Thus2B,Thus3B,Thus4B,Thus5B,Thus6B,Thus7B;
    TextView Fri1B,Fri2B,Fri3B,Fri4B,Fri5B,Fri6B,Fri7B;
    TextView Sat1B,Sat2B,Sat3B,Sat4B,Sat5B,Sat6B,Sat7B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        Mon1 = findViewById(R.id.mon1_1);
        Tue1 = findViewById(R.id.tue1_1);
        Wed1 = findViewById(R.id.wed1_1);
        Thus1 = findViewById(R.id.thus1_1);
        Fri1 = findViewById(R.id.fri1_1);
        Sat1 = findViewById(R.id.sat1_1);


        Mon2 = findViewById(R.id.mon2_1);
        Tue2 = findViewById(R.id.tue2_1);
        Wed2 = findViewById(R.id.wed2_1);
        Thus2 = findViewById(R.id.thus2_1);
        Fri2 = findViewById(R.id.fri2_1);
        Sat2 = findViewById(R.id.sat2_1);


        Mon3 = findViewById(R.id.mon3_1);
        Tue3 = findViewById(R.id.tue3_1);
        Wed3 = findViewById(R.id.wed3_1);
        Thus3 = findViewById(R.id.thus3_1);
        Fri3 = findViewById(R.id.fri3_1);
        Sat3 = findViewById(R.id.sat3_1);

        Mon4 = findViewById(R.id.mon4_1);
        Tue4 = findViewById(R.id.tue4_1);
        Wed4 = findViewById(R.id.wed4_1);
        Thus4 = findViewById(R.id.thus4_1);
        Fri4 = findViewById(R.id.fri4_1);
        Sat4 = findViewById(R.id.sat4_1);

        Mon5 = findViewById(R.id.mon5_1);
        Tue5 = findViewById(R.id.tue5_1);
        Wed5 = findViewById(R.id.wed5_1);
        Thus5 = findViewById(R.id.thus5_1);
        Fri5 = findViewById(R.id.fri5_1);
        Sat5 = findViewById(R.id.sat5_1);

        Mon6 = findViewById(R.id.mon6_1);
        Tue6 = findViewById(R.id.tue6_1);
        Wed6 = findViewById(R.id.wed6_1);
        Thus6 = findViewById(R.id.thus6_1);
        Fri6 = findViewById(R.id.fri6_1);
        Sat6 = findViewById(R.id.sat6_1);

        Mon7 = findViewById(R.id.mon7_1);
        Tue7 = findViewById(R.id.tue7_1);
        Wed7 = findViewById(R.id.wed7_1);
        Thus7 = findViewById(R.id.thus7_1);
        Fri7 = findViewById(R.id.fri7_1);
        Sat7 = findViewById(R.id.sat7_1);
        set_se();




        Mon1T=(TextView)findViewById(R.id.mon1_2);
        Tue1T=(TextView)findViewById(R.id.tue1_2);
        Wed1T=(TextView)findViewById(R.id.wed1_2);
        Thus1T=(TextView)findViewById(R.id.thus1_2);
        Fri1T=(TextView)findViewById(R.id.fri1_2);
        Sat1T=(TextView)findViewById(R.id.sat1_2);


        Mon2T=(TextView)findViewById(R.id.mon2_2);
        Tue2T=(TextView)findViewById(R.id.tue2_2);
        Wed2T=(TextView)findViewById(R.id.wed2_2);
        Thus2T=(TextView)findViewById(R.id.thus2_2);
        Fri2T=(TextView)findViewById(R.id.fri2_2);
        Sat2T=(TextView)findViewById(R.id.sat2_2);


        Mon3T=(TextView)findViewById(R.id.mon3_2);
        Tue3T=(TextView)findViewById(R.id.tue3_2);
        Wed3T=(TextView)findViewById(R.id.wed3_2);
        Thus3T=(TextView)findViewById(R.id.thus3_2);
        Fri3T=(TextView)findViewById(R.id.fri3_2);
        Sat3T=(TextView)findViewById(R.id.sat3_2);

        Mon4T=(TextView)findViewById(R.id.mon4_2);
        Tue4T=(TextView)findViewById(R.id.tue4_2);
        Wed4T=(TextView)findViewById(R.id.wed4_2);
        Thus4T=(TextView)findViewById(R.id.thus4_2);
        Fri4T=(TextView)findViewById(R.id.fri4_2);
        Sat4T=(TextView)findViewById(R.id.sat4_2);

        Mon5T=(TextView)findViewById(R.id.mon5_2);
        Tue5T=(TextView)findViewById(R.id.tue5_2);
        Wed5T=(TextView)findViewById(R.id.wed5_2);
        Thus5T=(TextView)findViewById(R.id.thus5_2);
        Fri5T=(TextView)findViewById(R.id.fri5_2);
        Sat5T=(TextView)findViewById(R.id.sat5_2);

        Mon6T=(TextView)findViewById(R.id.mon6_2);
        Tue6T=(TextView)findViewById(R.id.tue6_2);
        Wed6T=(TextView)findViewById(R.id.wed6_2);
        Thus6T=(TextView)findViewById(R.id.thus6_2);
        Fri6T=(TextView)findViewById(R.id.fri6_2);
        Sat6T=(TextView)findViewById(R.id.sat6_2);

        Mon7T=(TextView)findViewById(R.id.mon7_2);
        Tue7T=(TextView)findViewById(R.id.tue7_2);
        Wed7T=(TextView)findViewById(R.id.wed7_2);
        Thus7T=(TextView)findViewById(R.id.thus7_2);
        Fri7T=(TextView)findViewById(R.id.fri7_2);
        Sat7T=(TextView)findViewById(R.id.sat7_2);
        set_te();

        Mon1B=(TextView)findViewById(R.id.mon1_3);
        Tue1B=(TextView)findViewById(R.id.tue1_3);
        Wed1B=(TextView)findViewById(R.id.wed1_3);
        Thus1B=(TextView)findViewById(R.id.thus1_3);
        Fri1B=(TextView)findViewById(R.id.fri1_3);
        Sat1B=(TextView)findViewById(R.id.sat1_3);


        Mon2B=(TextView)findViewById(R.id.mon2_3);
        Tue2B=(TextView)findViewById(R.id.tue2_3);
        Wed2B=(TextView)findViewById(R.id.wed2_3);
        Thus2B=(TextView)findViewById(R.id.thus2_3);
        Fri2B=(TextView)findViewById(R.id.fri2_3);
        Sat2B=(TextView)findViewById(R.id.sat2_3);


        Mon3B=(TextView)findViewById(R.id.mon3_3);
        Tue3B=(TextView)findViewById(R.id.tue3_3);
        Wed3B=(TextView)findViewById(R.id.wed3_3);
        Thus3B=(TextView)findViewById(R.id.thus3_3);
        Fri3B=(TextView)findViewById(R.id.fri3_3);
        Sat3B=(TextView)findViewById(R.id.sat3_3);

        Mon4B=(TextView)findViewById(R.id.mon4_3);
        Tue4B=(TextView)findViewById(R.id.tue4_3);
        Wed4B=(TextView)findViewById(R.id.wed4_3);
        Thus4B=(TextView)findViewById(R.id.thus4_3);
        Fri4B=(TextView)findViewById(R.id.fri4_3);
        Sat4B=(TextView)findViewById(R.id.sat4_3);

        Mon5B=(TextView)findViewById(R.id.mon5_3);
        Tue5B=(TextView)findViewById(R.id.tue5_3);
        Wed5B=(TextView)findViewById(R.id.wed5_3);
        Thus5B=(TextView)findViewById(R.id.thus5_3);
        Fri5B=(TextView)findViewById(R.id.fri5_3);
        Sat5B=(TextView)findViewById(R.id.sat5_3);

        Mon6B=(TextView)findViewById(R.id.mon6_3);
        Tue6B=(TextView)findViewById(R.id.tue6_3);
        Wed6B=(TextView)findViewById(R.id.wed6_3);
        Thus6B=(TextView)findViewById(R.id.thus6_3);
        Fri6B=(TextView)findViewById(R.id.fri6_3);
        Sat6B=(TextView)findViewById(R.id.sat6_3);

        Mon7B=(TextView)findViewById(R.id.mon7_3);
        Tue7B=(TextView)findViewById(R.id.tue7_3);
        Wed7B=(TextView)findViewById(R.id.wed7_3);
        Thus7B=(TextView)findViewById(R.id.thus7_3);
        Fri7B=(TextView)findViewById(R.id.fri7_3);
        Sat7B=(TextView)findViewById(R.id.sat7_3);
        set_be();



    }

    public void set_se() {
        int i = 1, j = 1, p = 1;
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();
        List<String> list4 = new ArrayList<String>();

        for (int k = 0; k < 6; k++) {
            list1.add("off");
            list2.add("off");
            list3.add("off");
            list4.add("off");

        }
        Cursor cursor = mydb4.getCursor2();
        if (cursor.getCount() == 0) {
            //show msg
            Toast.makeText(Master.this, "ERROR: cursor is empty", Toast.LENGTH_LONG).show();
            return;
        }
        if (cursor.moveToFirst()) {
            do {
                String id = cursor.getString(0);
                i = Integer.valueOf(id);

                list1.set(0, cursor.getString(4));
                list1.set(1, cursor.getString(7));
                list1.set(2, cursor.getString(10));
                list1.set(3, cursor.getString(13));
                list1.set(4, cursor.getString(16));
                list1.set(5, cursor.getString(19));

                cursor.moveToNext();
                list2.set(0, cursor.getString(4));
                list2.set(1, cursor.getString(7));
                list2.set(2, cursor.getString(10));
                list2.set(3, cursor.getString(13));
                list2.set(4, cursor.getString(16));
                list2.set(5, cursor.getString(19));

                cursor.moveToNext();
                list3.set(0, cursor.getString(4));
                list3.set(1, cursor.getString(7));
                list3.set(2, cursor.getString(10));
                list3.set(3, cursor.getString(13));
                list3.set(4, cursor.getString(16));
                list3.set(5, cursor.getString(19));

                cursor.moveToNext();
                list4.set(0, cursor.getString(4));
                list4.set(1, cursor.getString(7));
                list4.set(2, cursor.getString(10));
                list4.set(3, cursor.getString(13));
                list4.set(4, cursor.getString(16));
                list4.set(5, cursor.getString(19));

                if (p == 1) {
                    Mon1.setText(list1.get(0));
                    Tue1.setText(list1.get(1));
                    Wed1.setText(list1.get(2));
                    Thus1.setText(list1.get(3));
                    Fri1.setText(list1.get(4));
                    Sat1.setText(list1.get(5));
                } else if (p == 2) {
                    Mon2.setText(list1.get(0));
                    Tue2.setText(list1.get(1));
                    Wed2.setText(list1.get(2));
                    Thus2.setText(list1.get(3));
                    Fri2.setText(list1.get(4));
                    Sat2.setText(list1.get(5));

                } else if (p == 3) {
                    Mon3.setText(list1.get(0));
                    Tue3.setText(list1.get(1));
                    Wed3.setText(list1.get(2));
                    Thus3.setText(list1.get(3));
                    Fri3.setText(list1.get(4));
                    Sat3.setText(list1.get(5));

                } else if (p == 4) {
                    Mon4.setText(list1.get(0));
                    Tue4.setText(list1.get(1));
                    Wed4.setText(list1.get(2));
                    Thus4.setText(list1.get(3));
                    Fri4.setText(list1.get(4));
                    Sat4.setText(list1.get(5));

                } else if (p == 5) {
                    Mon5.setText(list1.get(0));
                    Tue5.setText(list1.get(1));
                    Wed5.setText(list1.get(2));
                    Thus5.setText(list1.get(3));
                    Fri5.setText(list1.get(4));
                    Sat5.setText(list1.get(5));

                } else if (p == 6) {
                    Mon6.setText("S1:" + list1.get(0) + " S2:" + list2.get(0) + " S3:" + list3.get(0) + " S4:" + list4.get(0));
                    Tue6.setText("S1:" + list1.get(1) + " S2:" + list2.get(1) + " S3:" + list3.get(1) + " S4:" + list4.get(1));
                    Wed6.setText("S1:" + list1.get(2) + " S2:" + list2.get(2) + " S3:" + list3.get(2) + " S4:" + list4.get(2));
                    Thus6.setText("S1:" + list1.get(3) + " S2:" + list2.get(3) + " S3:" + list3.get(3) + " S4:" + list4.get(3));
                    Fri6.setText("S1:" + list1.get(4) + " S2:" + list2.get(4) + " S3:" + list3.get(4) + " S4:" + list4.get(4));
                    Sat6.setText("S1:" + list1.get(5) + " S2:" + list2.get(5) + " S3:" + list3.get(5) + " S4:" + list4.get(5));

                } else if (p == 7) {
                    Mon7.setText("S1:" + list1.get(0) + " S2:" + list2.get(0) + " S3:" + list3.get(0) + " S4:" + list4.get(0));
                    Tue7.setText("S1:" + list1.get(1) + " S2:" + list2.get(1) + " S3:" + list3.get(1) + " S4:" + list4.get(1));
                    Wed7.setText("S1:" + list1.get(2) + " S2:" + list2.get(2) + " S3:" + list3.get(2) + " S4:" + list4.get(2));
                    Thus7.setText("S1:" + list1.get(3) + " S2:" + list2.get(3) + " S3:" + list3.get(3) + " S4:" + list4.get(3));
                    Fri7.setText("S1:" + list1.get(4) + " S2:" + list2.get(4) + " S3:" + list3.get(4) + " S4:" + list4.get(4));
                    Sat7.setText("S1:" + list1.get(5) + " S2:" + list2.get(5) + " S3:" + list3.get(5) + " S4:" + list4.get(5));

                }

                p++;
            } while (cursor.moveToNext());
        }
    }

    public void set_te()
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
        Cursor cursor = mydb4.getCursor3();
        if(cursor.getCount()==0){
            //show msg
            Toast.makeText(Master.this,"ERROR: cursor is empty",Toast.LENGTH_LONG).show();
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


    public void set_be()
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
        Cursor cursor = mydb4.getCursor4();
        if(cursor.getCount()==0){
            //show msg
            Toast.makeText(Master.this,"ERROR: cursor is empty",Toast.LENGTH_LONG).show();
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
                    Mon1B.setText(list1.get(0));
                    Tue1B.setText(list1.get(1));
                    Wed1B.setText(list1.get(2));
                    Thus1B.setText(list1.get(3));
                    Fri1B.setText(list1.get(4));
                    Sat1B.setText(list1.get(5));
                }
                else if(p==2){
                    Mon2B.setText("B1:"+list1.get(0)+" B2:"+list2.get(0)+" B3:"+list3.get(0)+" B4:"+list4.get(0));
                    Tue2B.setText("B1:"+list1.get(1)+" B2:"+list2.get(1)+" B3:"+list3.get(1)+" B4:"+list4.get(1));
                    Wed2B.setText("B1:"+list1.get(2)+" B2:"+list2.get(2)+" B3:"+list3.get(2)+" B4:"+list4.get(2));
                    Thus2B.setText("B1:"+list1.get(3)+" B2:"+list2.get(3)+" B3:"+list3.get(3)+" B4:"+list4.get(3));
                    Fri2B.setText("B1:"+list1.get(4)+" B2:"+list2.get(4)+" B3:"+list3.get(4)+" B4:"+list4.get(4));
                    Sat2B.setText("B1:"+list1.get(5)+" B2:"+list2.get(5)+" B3:"+list3.get(5)+" B4:"+list4.get(5));


                }else if(p==3){
                    Mon3B.setText("B1:"+list1.get(0)+" B2:"+list2.get(0)+" B3:"+list3.get(0)+" B4:"+list4.get(0));
                    Tue3B.setText("B1:"+list1.get(1)+" B2:"+list2.get(1)+" B3:"+list3.get(1)+" B4:"+list4.get(1));
                    Wed3B.setText("B1:"+list1.get(2)+" B2:"+list2.get(2)+" B3:"+list3.get(2)+" B4:"+list4.get(2));
                    Thus3B.setText("B1:"+list1.get(3)+" B2:"+list2.get(3)+" B3:"+list3.get(3)+" B4:"+list4.get(3));
                    Fri3B.setText("B1:"+list1.get(4)+" B2:"+list2.get(4)+" B3:"+list3.get(4)+" B4:"+list4.get(4));
                    Sat3B.setText("B1:"+list1.get(5)+" B2:"+list2.get(5)+" B3:"+list3.get(5)+" B4:"+list4.get(5));

                }else if(p==4){
                    Mon4B.setText(list1.get(0));
                    Tue4B.setText(list1.get(1));
                    Wed4B.setText(list1.get(2));
                    Thus4B.setText(list1.get(3));
                    Fri4B.setText(list1.get(4));
                    Sat4B.setText(list1.get(5));

                }else if(p==5){
                    Mon5B.setText(list1.get(0));
                    Tue5B.setText(list1.get(1));
                    Wed5B.setText(list1.get(2));
                    Thus5B.setText(list1.get(3));
                    Fri5B.setText(list1.get(4));
                    Sat5B.setText(list1.get(5));

                }else if(p==6){

                    Mon6B.setText(list1.get(0));
                    Tue6B.setText(list1.get(1));
                    Wed6B.setText(list1.get(2));
                    Thus6B.setText(list1.get(3));
                    Fri6B.setText(list1.get(4));
                    Sat6B.setText(list1.get(5));


                }else if(p==7){
                    Mon7B.setText(list1.get(0));
                    Tue7B.setText(list1.get(1));
                    Wed7B.setText(list1.get(2));
                    Thus7B.setText(list1.get(3));
                    Fri7B.setText(list1.get(4));
                    Sat7B.setText(list1.get(5));                }

                p++;
            } while (cursor.moveToNext());
        }
    }
}
