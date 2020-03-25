package com.example.mansi.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class faculty_class extends AppCompatActivity {
    List<faculty_card> productList;

    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_class);

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new faculty_card(
                        1,
                        "Dr. S. U. Ghumbre",
                        " Professor, Head of Department",
                        "shashi.gumre@gmail.com",
                        "02133-230414",
                        R.drawable.hod));

        productList.add(
                new faculty_card(
                        2,
                        "Dr. P. K. Deshmukh",
                        "Associate Professor",
                        "pkdeshmukh9@gmail.com",
                        "02133-230416",
                        R.drawable.deshsir));

        productList.add(
                new faculty_card(
                        3,
                        "Sri. D. J. Pareira",
                        "Assistant Professor",
                        "danny_pareira@rediffmail.com",
                        "02133-230414",
                        R.drawable.pareira));

        productList.add(
                new faculty_card(
                        4,
                        "Smt. P. R. Deshmukh",
                        "Assistant Professor",
                        "patu_pawar@yahoo.co.in",
                        "02133-230430",
                        R.drawable.deshmukhmam));

        productList.add(
                new faculty_card(
                        5,
                        "Shri. V. D. Waghmare",
                        "Instructor (T. L. A.)",
                        "---",
                        "---",/*12345*/

                        R.drawable.cr));
        productList.add(
                new faculty_card(
                        6,
                        "Shri. Y. J. Shinde",
                        "Instructor (T. L. A.)",
                        "---",
                        "---",
                        R.drawable.cr));

        //creating recyclerview adapter
        card_adapter adapter = new card_adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }


}
