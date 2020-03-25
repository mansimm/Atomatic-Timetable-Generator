package com.example.mansi.loginpage;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class sample4 extends AppCompatActivity {
    DatacbaseHelper mydb3 = new DatacbaseHelper(this);

    TextView Mon1B,Mon2B,Mon3B,Mon4B,Mon5B,Mon6B,Mon7B;
    TextView Tue1B,Tue2B,Tue3B,Tue4B,Tue5B,Tue6B,Tue7B;
    TextView Wed1B,Wed2B,Wed3B,Wed4B,Wed5B,Wed6B,Wed7B;
    TextView Thus1B,Thus2B,Thus3B,Thus4B,Thus5B,Thus6B,Thus7B;
    TextView Fri1B,Fri2B,Fri3B,Fri4B,Fri5B,Fri6B,Fri7B;
    TextView Sat1B,Sat2B,Sat3B,Sat4B,Sat5B,Sat6B,Sat7B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample4);

        Mon1B=(TextView)findViewById(R.id.mon1B);
        Tue1B=(TextView)findViewById(R.id.tue1B);
        Wed1B=(TextView)findViewById(R.id.wed1B);
        Thus1B=(TextView)findViewById(R.id.thus1B);
        Fri1B=(TextView)findViewById(R.id.fri1B);
        Sat1B=(TextView)findViewById(R.id.sat1B);


        Mon2B=(TextView)findViewById(R.id.mon2B);
        Tue2B=(TextView)findViewById(R.id.tue2B);
        Wed2B=(TextView)findViewById(R.id.wed2B);
        Thus2B=(TextView)findViewById(R.id.thus2B);
        Fri2B=(TextView)findViewById(R.id.fri2B);
        Sat2B=(TextView)findViewById(R.id.sat2B);


        Mon3B=(TextView)findViewById(R.id.mon3B);
        Tue3B=(TextView)findViewById(R.id.tue3B);
        Wed3B=(TextView)findViewById(R.id.wed3B);
        Thus3B=(TextView)findViewById(R.id.thus3B);
        Fri3B=(TextView)findViewById(R.id.fri3B);
        Sat3B=(TextView)findViewById(R.id.sat3B);

        Mon4B=(TextView)findViewById(R.id.mon4B);
        Tue4B=(TextView)findViewById(R.id.tue4B);
        Wed4B=(TextView)findViewById(R.id.wed4B);
        Thus4B=(TextView)findViewById(R.id.thus4B);
        Fri4B=(TextView)findViewById(R.id.fri4B);
        Sat4B=(TextView)findViewById(R.id.sat4B);

        Mon5B=(TextView)findViewById(R.id.mon5B);
        Tue5B=(TextView)findViewById(R.id.tue5B);
        Wed5B=(TextView)findViewById(R.id.wed5B);
        Thus5B=(TextView)findViewById(R.id.thus5B);
        Fri5B=(TextView)findViewById(R.id.fri5B);
        Sat5B=(TextView)findViewById(R.id.sat5B);

        Mon6B=(TextView)findViewById(R.id.mon6B);
        Tue6B=(TextView)findViewById(R.id.tue6B);
        Wed6B=(TextView)findViewById(R.id.wed6B);
        Thus6B=(TextView)findViewById(R.id.thus6B);
        Fri6B=(TextView)findViewById(R.id.fri6B);
        Sat6B=(TextView)findViewById(R.id.sat6B);

        Mon7B=(TextView)findViewById(R.id.mon7B);
        Tue7B=(TextView)findViewById(R.id.tue7B);
        Wed7B=(TextView)findViewById(R.id.wed7B);
        Thus7B=(TextView)findViewById(R.id.thus7B);
        Fri7B=(TextView)findViewById(R.id.fri7B);
        Sat7B=(TextView)findViewById(R.id.sat7B);
        set4();



    }

    public void set4()
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
        Cursor cursor = mydb3.getCursor4();
        if(cursor.getCount()==0){
            //show msg
            Toast.makeText(sample4.this,"ERROR: cursor is empty",Toast.LENGTH_LONG).show();
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
                    Sat7B.setText(list1.get(5));

                }

                p++;
            } while (cursor.moveToNext());
        }
    }
}
