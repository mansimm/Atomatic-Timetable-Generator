package com.example.mansi.loginpage;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {

    private EditText username,userpassword,usermail;
    private Button regButton;
    private TextView userlogin;
    private FirebaseAuth firebaseAuth;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setupUIViews();

        firebaseAuth= FirebaseAuth.getInstance();

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){
                    //upload data to database
                    String user_email=usermail.getText().toString().trim();
                    String user_password=userpassword.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()) {
                                Toast.makeText(SecondActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SecondActivity.this,MainActivity.class));
                            }else{
                                Toast.makeText(SecondActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                            }
                        }
                    });
                }
            }
        });

        userlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,MainActivity.class));
            }
        });
    }


    private void setupUIViews(){
        username=(EditText)findViewById(R.id.username1);
        usermail=(EditText)findViewById(R.id.email1);
        userpassword=(EditText)findViewById(R.id.password1);
        regButton=(Button)findViewById(R.id.register1);
        userlogin=(TextView)findViewById(R.id.back1);

    }

    private Boolean validate(){
        Boolean result=false;

        String name=username.getText().toString();
        String password=userpassword.getText().toString();
        String email=usermail.getText().toString();

        if(name.isEmpty() || password.isEmpty() || email.isEmpty()){
            Toast.makeText(this,"Please enter all the details ", Toast.LENGTH_SHORT).show();
        }else{
            result=true;
        }
        return result;
    }
}
