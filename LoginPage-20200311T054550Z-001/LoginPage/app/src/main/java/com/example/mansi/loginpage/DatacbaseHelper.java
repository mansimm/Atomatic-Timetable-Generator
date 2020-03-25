package com.example.mansi.loginpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.IntegerRes;
import android.widget.Toast;

import org.w3c.dom.Text;

public class DatacbaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "timetable.db";
    public static final String TABLE_NAME = "data_table";
    public static final String TABLE_NAME_1 = "time_table";


    public static final String col_1 = "ID";
    public static final String col_2 = "YEAR";
    public static final String col_3 = "SUBJECT";
    public static final String col_4 = "TEACHER";
    public static final String col_5 = "TYPE";
    public static final String col_6 = "HOURS_WEEK";
    public static final String col_7 = "CLASSROOM";
    public static final String col_8 = "T_STATUS";
    public static final String col_9 = "C_STATUS";
    public static final String col_10 = "BATCH1";
    public static final String col_11 = "BATCH2";
    public static final String col_12 = "BATCH3";
    public static final String col_13 = "BATCH4";


    public static final String Col_1 = "ID1";
    public static final String Col_2 = "YEAR1";
    public static final String Col_3 = "BATCH";

    public static final String Col_4 = "MON_TYPE";
    public static final String Col_5 = "MON_SUB";
    public static final String Col_6 = "MON_TEACHER";

    public static final String Col_7 = "TUE_TYPE";
    public static final String Col_8 = "TUE_SUB";
    public static final String Col_9 = "TUE_TEACHER";

    public static final String Col_10 = "WED_TYPE";
    public static final String Col_11 = "WED_SUB";
    public static final String Col_12 = "WED_TEACHER";

    public static final String Col_13 = "THUS_TYPE";
    public static final String Col_14 = "THUS_SUB";
    public static final String Col_15 = "THUS_TEACHER";

    public static final String Col_16 = "FRI_TYPE";
    public static final String Col_17 = "FRI_SUB";
    public static final String Col_18 = "FRI_TEACHER";

    public static final String Col_19 = "SAT_TYPE";
    public static final String Col_20 = "SAT_SUB";
    public static final String Col_21 = "SAT_TEACHER";

    public static final String Col_22 = "mon";
    public static final String Col_23 = "tue";
    public static final String Col_24 = "wed";
    public static final String Col_25 = "thus";
    public static final String Col_26 = "fri";
    public static final String Col_27 = "sat";








    public static final String col1_1 = "ID1";
    public static final String col1_2 = "YEAR1";
    public static final String col1_3 = "BATCH";


    public DatacbaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + "(ID INTEGER unique,YEAR INTEGER,SUBJECT TEXT unique," +
                "TEACHER TEXT,TYPE TEXT,HOURS_WEEK INTEGER,CLASSROOM INTEGER,T_STATUS CHAR DEFAULT 'F'," +
                "C_STATUS CHAR DEFAULT 'F',BATCH1 INTEGER DEFAULT 0,BATCH2 INTEGER DEFAULT 0," +
                "BATCH3 INTEGER DEFAULT 0,BATCH4 INTEGER DEFAULT 0)");


        db.execSQL("create table " + TABLE_NAME_1 + "(ID1 INTEGER unique,YEAR1 INTEGER ,BATCH TEXT," +
                "MON_TYPE TEXT DEFAULT 'LECT', MON_SUB TEXT DEFAULT 'OFF',MON_TEACHER TEXT," +
                "TUE_TYPE TEXT DEFAULT 'LECT', TUE_SUB TEXT DEFAULT 'OFF', TUE_TEACHER TEXT," +
                "WED_TYPE TEXT DEFAULT 'LECT', WED_SUB TEXT DEFAULT 'OFF', WED_TEACHER TEXT," +
                "THUS_TYPE TEXT DEFAULT 'LECT', THUS_SUB TEXT DEFAULT 'OFF', THUS_TEACHER TEXT," +
                "FRI_TYPE TEXT DEFAULT 'LECT', FRI_SUB TEXT DEFAULT 'OFF', FRI_TEACHER TEXT," +
                "SAT_TYPE TEXT DEFAULT 'LECT', SAT_SUB TEXT DEFAULT 'OFF', SAT_TEACHER TEXT," +
                "mon char default 'E',tue char default 'E',wed char default 'E',thus char default 'E'," +
                "fri char default 'E',sat char default 'E')");

        //CREATE TABLE


    }

    public void create_table(){
        SQLiteDatabase db = this.getWritableDatabase();

        for(int i=1;i<85;i++) {

            if(i%12==1) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'2','s1')");
            }if(i%12==2) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'2','s2')");
            }if(i%12==3) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'2','s3')");
            }if(i%12==4) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'2','s4')");
            }if(i%12==5) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'3','t1')");
            }if(i%12==6) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'3','t2')");
            }if(i%12==7) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'3','t3')");
            }if(i%12==8) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'3','t4')");
            }if(i%12==9) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'4','b1')");
            }if(i%12==10) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'4','b2')");
            }if(i%12==11) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'4','b3')");
            }if(i%12==0) {
                db.execSQL("insert into " + TABLE_NAME_1 + " (ID1,YEAR1,BATCH)values(" + i + ",'4','b4')");
            }
        }

        //set be
        String id1;

        for(int i=0;i<85;i++){
            if(i>20 && i<25||i>32 && i<37){
                id1=Integer.toString(i);
                updateData1(id1,"MON_TYPE","PRACT");
                updateData1(id1,"TUE_TYPE","PRACT");
                updateData1(id1,"WED_TYPE","PRACT");
                updateData1(id1,"THUS_TYPE","PRACT");
                updateData1(id1,"FRI_TYPE","TUT");

            }
            if(i>40 && i<45||i>52 && i<57){
                id1=Integer.toString(i);
                updateData1(id1,"MON_TYPE","PRACT");
                updateData1(id1,"TUE_TYPE","PRACT");
                updateData1(id1,"WED_TYPE","PRACT");
                updateData1(id1,"THUS_TYPE","PRACT");
                updateData1(id1,"FRI_TYPE","PRACT");

            }
            if(i>60 && i<65||i>72 && i<77){
                id1=Integer.toString(i);
                updateData1(id1,"MON_TYPE","PRACT");
                updateData1(id1,"TUE_TYPE","PRACT");
                updateData1(id1,"WED_TYPE","PRACT");
                updateData1(id1,"THUS_TYPE","PRACT");
                updateData1(id1,"FRI_TYPE","PRACT");

            }




        }
        updateData1("61","THUS_TYPE","TUT");//S1
        updateData1("62","FRI_TYPE","TUT");//S2
        updateData1("63","MON_TYPE","TUT");//S3
        updateData1("64","TUE_TYPE","TUT");//S4

        updateData1("73","THUS_TYPE","TUT");//S1
        updateData1("74","FRI_TYPE","TUT");//S2
        updateData1("75","MON_TYPE","TUT");//S3
        updateData1("76","TUE_TYPE","TUT");//S4

        updateData1("65","MON_TYPE","TUT");//t1
        updateData1("66","MON_TYPE","TUT");//t2
        updateData1("67","MON_TYPE","TUT");//t3
        updateData1("68","MON_TYPE","TUT");//t4

        updateData1("77","MON_TYPE","TUT");//t1
        updateData1("78","MON_TYPE","TUT");//t2
        updateData1("79","MON_TYPE","TUT");//t3
        updateData1("80","MON_TYPE","TUT");//t4






    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


    public boolean insertData(String id, String year, String subject, String teacher, String type, String hours, String classroom) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_1, id);
        contentValues.put(col_2, year);
        contentValues.put(col_3, subject);
        contentValues.put(col_4, teacher);
        contentValues.put(col_5, type);
        contentValues.put(col_6, hours);
        contentValues.put(col_7, classroom);
        contentValues.put(col_10, hours);
        contentValues.put(col_11, hours);
        contentValues.put(col_12, hours);
        contentValues.put(col_13, hours);

        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }


    public Cursor get_alldata() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;

    }

    public Cursor get_alldata_1() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME_1, null);
        return res;

    }

    public Cursor get_count(String col_name) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res2 = db.rawQuery("select count(DISTINCT " + col_name + ") from " + TABLE_NAME, null);
        return res2;

    }


    public boolean updateData(String id, String year, String sub, String teacher, String type, String hours, String classroom) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_1, id);
        contentValues.put(col_2, year);
        contentValues.put(col_3, sub);
        contentValues.put(col_4, teacher);
        contentValues.put(col_5, type);
        contentValues.put(col_6, hours);
        contentValues.put(col_7, classroom);
        contentValues.put(col_10, hours);
        contentValues.put(col_11, hours);
        contentValues.put(col_12, hours);
        contentValues.put(col_13, hours);
        db.update(TABLE_NAME, contentValues, "ID=?", new String[]{id});
        return true;


    }

    public boolean updateData1(String col_id, String col_name, String col_type) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_name, col_type);

        db.update(TABLE_NAME_1, contentValues, "ID1=?", new String[]{col_id});
        return true;

    }

    public Integer deleteData(String id) {
        SQLiteDatabase db = this.getWritableDatabase();

        return db.delete(TABLE_NAME, "ID=?", new String[]{id});

    }

    //for selecting year from tt
    public Cursor selectData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res1 = db.rawQuery("select * from " + TABLE_NAME_1, null);
        return res1;

    }


    public int select_lect(String year,int id,int j,String col_sub,String col_tea,String scol_name) {


        String x1 = "off", y1 = "not_alloted",id1,type="LECT",F="F",zero="0";
        String z1 = "0";
        String HOURS="-";

        if (year.equals("2")) {

            SQLiteDatabase db = this.getWritableDatabase();

            Cursor res1=db.rawQuery("select * from "+TABLE_NAME+
                    " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not HOURS_WEEK=? ",new String[]{year,type,F,F,zero});
            if(res1.getCount()==0){
                //show msg
                return id;
            }
            res1.moveToNext();
            //.......first row
            x1=res1.getString(2);//sub
            y1=res1.getString(3);//teacher
            z1=res1.getString(6);//classroom
            HOURS=res1.getString(5);

        } else if (year.equals("3")) {SQLiteDatabase db = this.getWritableDatabase();

            Cursor res1=db.rawQuery("select * from "+TABLE_NAME+
                    " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not HOURS_WEEK=? ",new String[]{year,type,F,F,zero});
            if(res1.getCount()==0){
                //show msg
                return id;
            }
            res1.moveToNext();
            //.......first row
            x1=res1.getString(2);//sub
            y1=res1.getString(3);//teacher
            z1=res1.getString(6);//classroom
            HOURS=res1.getString(5);



        } else if (year.equals("4")) {
            SQLiteDatabase db = this.getWritableDatabase();

            Cursor res1=db.rawQuery("select * from "+TABLE_NAME+
                    " where YEAR=? and TYPE=? and T_STATUS=? AND C_STATUS=? and not HOURS_WEEK=? ",new String[]{year,type,F,F,zero});
            if(res1.getCount()==0){
                //show msg
                return id;//..............temprary
            }

            res1.moveToNext();
            //.......first row
            x1=res1.getString(2);//sub
            y1=res1.getString(3);//teacher
            z1=res1.getString(6);//classroom
            HOURS=res1.getString(5);


        }

        if(HOURS.equals("4")){HOURS="3";}
        else if(HOURS.equals("3")){HOURS="2";}
        else if(HOURS.equals("2")){HOURS="1";}
        else if(HOURS.equals("1")){HOURS="0";}




        updateDataTable_lect("B",x1,y1,z1,HOURS);

        id1=Integer.toString(id);
        insert_lect(x1,y1,id1,col_sub,col_tea,j,scol_name);
        id=id+1;
        id1=Integer.toString(id);
        insert_lect(x1,y1,id1,col_sub,col_tea,j,scol_name);
        id=id+1;
        id1=Integer.toString(id);
        insert_lect(x1,y1,id1,col_sub,col_tea,j,scol_name);
        id=id+1;
        id1=Integer.toString(id);
        insert_lect(x1,y1,id1,col_sub,col_tea,j,scol_name);

        return id;

    }

    //updating status in input table
    public void updateDataTable_lect(String  busy,String x1,String y1,String z1,String HOURS){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues1 = new ContentValues();
        contentValues1.put(col_8, busy);

        db.update(TABLE_NAME, contentValues1, "TEACHER=? ", new String[]{y1});

//.........ADDED NOW

        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(col_9, busy);
        db.update(TABLE_NAME, contentValues2, "CLASSROOM=?", new String[]{z1});

        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(col_6, HOURS);
        contentValues3.put(col_10, HOURS);
        contentValues3.put(col_11, HOURS);
        contentValues3.put(col_12, HOURS);
        contentValues3.put(col_13, HOURS);
        db.update(TABLE_NAME, contentValues3, "SUBJECT=?", new String[]{x1});


    }

    public void insert_lect(String sub,String tea,String id,String col_sub,String col_tea,int j,String scol_name) {

        String fill = "F";
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(col_sub, sub);
        contentValues.put(col_tea, tea);
        contentValues.put(scol_name, fill);

        if (j == 3) {
            db.update(TABLE_NAME_1, contentValues, "ID1=? and MON_TYPE=?", new String[]{id, "LECT"});
        } else if (j == 6) {
            db.update(TABLE_NAME_1, contentValues, "ID1=? and TUE_TYPE=?", new String[]{id, "LECT"});
        } else if (j == 9) {
            db.update(TABLE_NAME_1, contentValues, "ID1=? and WED_TYPE=?", new String[]{id, "LECT"});
        } else if (j == 12) {
            db.update(TABLE_NAME_1, contentValues, "ID1=? and THUS_TYPE=?", new String[]{id, "LECT"});
        } else if (j == 15) {
            db.update(TABLE_NAME_1, contentValues, "ID1=? and FRI_TYPE=?", new String[]{id, "LECT"});
        } else if (j == 18) {
            db.update(TABLE_NAME_1, contentValues, "ID1=? and SAT_TYPE=?", new String[]{id, "LECT"});
        }


    }

    public void update_Status(int p,String type){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        String free="F",lect="LECT",tut="TUT",pract="PRACT";

            contentValues.put(col_8, free);
            contentValues.put(col_9, free);
            db.update(TABLE_NAME, contentValues, "TYPE=?", new String[]{lect});
            db.update(TABLE_NAME, contentValues, "TYPE=?", new String[]{tut});

        if(p==3 && p==5 && p==7) {
            db.update(TABLE_NAME, contentValues, "TYPE=?", new String[]{pract});
        }

    }



    public int select_tut(String year,int id,int j,String col_sub,String col_tea,String batch){

        String x1 = "off", y1 = "not_alloted",id1,type="TUT",F="F",zero="0",batch_name="HOURS_WEEK";
        String z1 = "0",id2;
        String HOURS="-";
        int index=5;
        int k=0;

        if (year.equals("2")) {

            SQLiteDatabase db = this.getWritableDatabase();
            if(batch.equals("s1")){
                batch_name="BATCH1";index=9;

                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH1=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(9);

            }
            else if(batch.equals("s2")){
                batch_name="BATCH2";index=10;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH2=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(10);
            }
            else if(batch.equals("s3")){
                batch_name="BATCH3";index=11;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH3=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(11);
            }
            else if(batch.equals("s4")){
                batch_name="BATCH4";index=12;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH4=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(12);

            }





        }
        else if (year.equals("3")) {

            SQLiteDatabase db = this.getWritableDatabase();

            Cursor res1=db.rawQuery("select * from "+TABLE_NAME+
                    " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not HOURS_WEEK=? ",new String[]{year,type,F,F,zero});
            if(res1.getCount()==0){
                //show msg
                return id;
            }
            res1.moveToNext();
            //.......first row
            x1=res1.getString(2);//sub
            y1=res1.getString(3);//teacher
            z1=res1.getString(6);//classroom
            HOURS=res1.getString(5);





        } else if (year.equals("4")) {
            SQLiteDatabase db = this.getWritableDatabase();

            Cursor res1=db.rawQuery("select * from "+TABLE_NAME+
                    " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not HOURS_WEEK=? ",new String[]{year,type,F,F,zero});
            if(res1.getCount()==0){
                //show msg
                return id;//..............temprary
            }

            res1.moveToNext();
            //.......first row
            x1=res1.getString(2);//sub
            y1=res1.getString(3);//teacher
            z1=res1.getString(6);//classr5oom
            HOURS=res1.getString(5);



        }
        if(year.equals("2")){
            if (HOURS.equals("4")) {
                HOURS = "2";
            } else if (HOURS.equals("2")) {
                HOURS = "0";
            }

        }else {
            if (HOURS.equals("4")) {
                HOURS = "3";
            } else if (HOURS.equals("3")) {
                HOURS = "2";
            } else if (HOURS.equals("2")) {
                HOURS = "1";
            } else if (HOURS.equals("1")) {
                HOURS = "0";
            }
        }




        updateDataTable_tut("B",x1,y1,z1,HOURS,batch_name,year);

        id1=Integer.toString(id);
        insert_tut(x1,y1,id1,col_sub,col_tea,j,batch);
       // int x;
        //x=id+12;
        if(year.equals("2")){
            k=id+12;
            id1=Integer.toString(k);
            insert_tut(x1,y1,id1,col_sub,col_tea,j,batch);
        }
        if(year.equals("3")||year.equals("4")){

            id=id+1;
            id1=Integer.toString(id);
            insert_tut(x1,y1,id1,col_sub,col_tea,j,batch);

            id=id+1;
            id1=Integer.toString(id);
            insert_tut(x1,y1,id1,col_sub,col_tea,j,batch);

            id=id+1;
            id1=Integer.toString(id);
            insert_tut(x1,y1,id1,col_sub,col_tea,j,batch);
        }

        return id;

    }
    public void updateDataTable_tut(String  busy,String x1,String y1,String z1,String HOURS,String batch_name,String year){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues1 = new ContentValues();
        contentValues1.put(col_8, busy);
        db.update(TABLE_NAME, contentValues1, "TEACHER=?", new String[]{y1});

        ContentValues contentValues2 = new ContentValues();

        if(batch_name.equals("HOURS_WEEK")){
            contentValues2.put(col_6, HOURS);
        }else if(batch_name.equals("BATCH1")){
            contentValues2.put(col_10, HOURS);
        }else if(batch_name.equals("BATCH2")){
            contentValues2.put(col_11, HOURS);
        }else if(batch_name.equals("BATCH3")){
            contentValues2.put(col_12, HOURS);
        }else if(batch_name.equals("BATCH4")){
            contentValues2.put(col_13, HOURS);
        }
        db.update(TABLE_NAME, contentValues2, "SUBJECT=?", new String[]{x1});



    }
    public void insert_tut(String sub,String tea,String id,String col_sub,String col_tea,int j,String batch){


        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(col_sub, sub);
        contentValues.put(col_tea, tea);

        if(j==3){ db.update(TABLE_NAME_1, contentValues, "ID1=? and MON_TYPE=?", new String[]{id,"TUT"});}
        else if(j==6){ db.update(TABLE_NAME_1, contentValues, "ID1=? and TUE_TYPE=?", new String[]{id,"TUT"});}
        else if(j==9){ db.update(TABLE_NAME_1, contentValues, "ID1=? and WED_TYPE=?", new String[]{id,"TUT"});}
        else if(j==12){ db.update(TABLE_NAME_1, contentValues, "ID1=? and THUS_TYPE=?", new String[]{id,"TUT"});}
        else if(j==15){ db.update(TABLE_NAME_1, contentValues, "ID1=? and FRI_TYPE=?", new String[]{id,"TUT"});}
        else if(j==18){ db.update(TABLE_NAME_1, contentValues, "ID1=? and SAT_TYPE=?", new String[]{id,"TUT"});}





    }

    public int select_pract(String year,int id,int j,String col_sub,String col_tea,String batch){

        String x1 = "off", y1 = "not_alloted",id1,type="PRACT",F="F",zero="0",batch_name="HOURS_WEEK";
        String z1 = "-",id2;
        String HOURS="-";
        int index=5;
        int k=0;

        if (year.equals("2")) {

            SQLiteDatabase db = this.getWritableDatabase();
            if(batch.equals("s1")){
                batch_name="BATCH1";index=9;

                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH1=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(9);



            }
            else if(batch.equals("s2")){
                batch_name="BATCH2";index=10;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH2=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(10);


            }
            else if(batch.equals("s3")){
                batch_name="BATCH3";index=11;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH3=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(11);


            }
            else if(batch.equals("s4")){
                batch_name="BATCH4";index=12;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH4=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(12);


            }





        }
        else if (year.equals("3")) {
            SQLiteDatabase db = this.getWritableDatabase();
            if(batch.equals("t1")){
                batch_name="BATCH1";index=9;

                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH1=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(9);

            }
            else if(batch.equals("t2")){
                batch_name="BATCH2";index=10;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH2=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(10);
            }
            else if(batch.equals("t3")){
                batch_name="BATCH3";index=11;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH3=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(11);
            }
            else if(batch.equals("t4")) {
                batch_name = "BATCH4";
                index = 12;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH4=? ", new String[]{year, type, F, F, zero});

                if (res1.getCount() == 0) {
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1 = res1.getString(2);//sub
                y1 = res1.getString(3);//teacher
                z1 = res1.getString(6);//classroom
                HOURS = res1.getString(12);
            }





            } else if (year.equals("4")) {

            SQLiteDatabase db = this.getWritableDatabase();
            if(batch.equals("b1")){
                batch_name="BATCH1";index=9;

                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH1=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(9);

            }
            else if(batch.equals("b2")){
                batch_name="BATCH2";index=10;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH2=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(10);
            }
            else if(batch.equals("b3")){
                batch_name="BATCH3";index=11;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH3=? ", new String[]{year, type, F,F, zero});

                if(res1.getCount()==0){
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1=res1.getString(2);//sub
                y1=res1.getString(3);//teacher
                z1=res1.getString(6);//classroom
                HOURS=res1.getString(11);
            }
            else if(batch.equals("b4")) {
                batch_name = "BATCH4";
                index = 12;
                Cursor res1 = db.rawQuery("select * from " + TABLE_NAME +
                        " where YEAR=? and TYPE=? and T_STATUS=? and C_STATUS=? and not BATCH4=? ", new String[]{year, type, F, F, zero});

                if (res1.getCount() == 0) {
                    //show msg
                    return id;
                }
                res1.moveToNext();
                //.......first row
                x1 = res1.getString(2);//sub
                y1 = res1.getString(3);//teacher
                z1 = res1.getString(6);//classroom
                HOURS = res1.getString(12);
            }


            }

            if (HOURS.equals("4")) {
                HOURS = "2";
            } else if (HOURS.equals("2")) {
                HOURS = "0";
            }


        updateDataTable_pract("B",x1,y1,z1,HOURS,batch_name,year);

        id1=Integer.toString(id);
        insert_pract(x1,y1,id1,col_sub,col_tea,j,batch);

        k=id+12;
        id1=Integer.toString(k);
        insert_pract(x1,y1,id1,col_sub,col_tea,j,batch);


        return id;
    }

    public void updateDataTable_pract(String  busy,String x1,String y1,String z1,String HOURS,String batch_name,String year){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues1 = new ContentValues();
        contentValues1.put(col_8, busy);
        db.update(TABLE_NAME, contentValues1, "TEACHER=?", new String[]{y1});

        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(col_9, busy);
        db.update(TABLE_NAME, contentValues3, "CLASSROOM=?", new String[]{z1});


        ContentValues contentValues2 = new ContentValues();
        if(batch_name.equals("BATCH1")){
            contentValues2.put(col_10, HOURS);
        }else if(batch_name.equals("BATCH2")){
            contentValues2.put(col_11, HOURS);
        }else if(batch_name.equals("BATCH3")){
            contentValues2.put(col_12, HOURS);
        }else if(batch_name.equals("BATCH4")){
            contentValues2.put(col_13, HOURS);
        }
        db.update(TABLE_NAME, contentValues2, "SUBJECT=?", new String[]{x1});


    }


        public void insert_pract(String sub,String tea,String id,String col_sub,String col_tea,int j,String batch){



            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();

            contentValues.put(col_sub, sub);
            contentValues.put(col_tea, tea);

            if(j==3){ db.update(TABLE_NAME_1, contentValues, "ID1=? and MON_TYPE=? and BATCH=?", new String[]{id,"PRACT",batch});}
            else if(j==6){ db.update(TABLE_NAME_1, contentValues, "ID1=? and TUE_TYPE=? and BATCH=?", new String[]{id,"PRACT",batch});}
            else if(j==9){ db.update(TABLE_NAME_1, contentValues, "ID1=? and WED_TYPE=? and BATCH=?", new String[]{id,"PRACT",batch});}
            else if(j==12){ db.update(TABLE_NAME_1, contentValues, "ID1=? and THUS_TYPE=? and BATCH=?", new String[]{id,"PRACT",batch});}
            else if(j==15){ db.update(TABLE_NAME_1, contentValues, "ID1=? and FRI_TYPE=? and BATCH=?", new String[]{id,"PRACT",batch});}
            else if(j==18){ db.update(TABLE_NAME_1, contentValues, "ID1=? and SAT_TYPE=? and BATCH=?", new String[]{id,"PRACT",batch});}


        }




        // public void add_query() {
       // SQLiteDatabase db = this.getWritableDatabase();
       // db.execSQL("alter table "+TABLE_NAME_1+" add mon char ");
        //db.execSQL("alter table "+TABLE_NAME_1+" add tue char ");
      //db.execSQL("alter table "+TABLE_NAME_1+" add wed char ");
      //  db.execSQL("alter table "+TABLE_NAME_1+" add thus char");
       // db.execSQL("alter table "+TABLE_NAME_1+" add fri char ");
        //db.execSQL("insert into "+TABLE_NAME_1+"(mon,tue,wed,thus,fri,sat)values('E','E','E','E','E','E') ");





    //}

    public void clear_tt() {
        //SQLiteDatabase db = this.getWritableDatabase();
        //db.execSQL("insert into " + TABLE_NAME_1 + "(MON_SUB,TUE_SUB,WED_SUB,THUS_SUB,WED_SUB,FRI_SUB,SAT_SUB)values('off','off','off','off','off','off')");
        //db.execSQL("insert into " + TABLE_NAME_1 + "(MON_TEACHER,TUE_TEACHER,WED_TEACHER,THUS_TEACHER,WED_TEACHER,FRI_TEACHER,SAT_TEACHER)values('n.a.','n.a.','n.a.','n.a.','n.a.','n.a.')");
        String sub="--",na="--",empty="E";
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Col_5, sub);
        contentValues.put(Col_6, na);
        contentValues.put(Col_8, sub);
        contentValues.put(Col_9, na);
        contentValues.put(Col_11, sub);
        contentValues.put(Col_12, na);
        contentValues.put(Col_14, sub);
        contentValues.put(Col_15, na);
        contentValues.put(Col_17, sub);
        contentValues.put(Col_18, na);
        contentValues.put(Col_20, sub);
        contentValues.put(Col_21, na);

        contentValues.put(Col_22, empty);
        contentValues.put(Col_23, empty);
        contentValues.put(Col_24, empty);
        contentValues.put(Col_25, empty);
        contentValues.put(Col_26, empty);
        contentValues.put(Col_27, empty);


        db.update(TABLE_NAME_1, contentValues, null,null);
        db.delete(TABLE_NAME, null, null);
    }



    //for displaying tt
    public Cursor getCursor2() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res1 = db.rawQuery("select * from " + TABLE_NAME_1+" where YEAR1=?", new String[]{"2"});
        return res1;

    }
    public Cursor getCursor3() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res1 = db.rawQuery("select * from " + TABLE_NAME_1+" where YEAR1=?", new String[]{"3"});
        return res1;

    }
    public Cursor getCursor4() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res1 = db.rawQuery("select * from " + TABLE_NAME_1+" where YEAR1=?", new String[]{"4"});
        return res1;

    }

   /* public boolean insertData(String id1, String year1, String batch1) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col1_1,id1);
        contentValues.put(col1_2,year1);
        contentValues.put(col1_3,batch1);

        long result=db.insert(TABLE_NAME_1,null,contentValues);
        if(result==-1)
            return false;
        else
            return true;




    }*/

}