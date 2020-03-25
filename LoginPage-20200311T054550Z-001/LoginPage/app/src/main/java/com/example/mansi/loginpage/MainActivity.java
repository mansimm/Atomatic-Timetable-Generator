package com.example.mansi.loginpage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.mbms.DownloadProgressListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter=5;
    private TextView userRegistration;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.name);
        Password=(EditText)findViewById(R.id.password);
        Info=(TextView)findViewById(R.id.info);
        Login=(Button)findViewById(R.id.login);
       // userRegistration=(TextView)findViewById(R.id.signup);//add admin

        Info.setText("No. of attempts remaining: 5");

        firebaseAuth=firebaseAuth.getInstance();
        //for firebase connection

        progressDialog=new ProgressDialog(this);

        FirebaseUser user=firebaseAuth.getCurrentUser();
        if(user!=null) {
            finish();
            startActivity(new Intent(MainActivity.this,activity_3.class));
        }

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());
               // Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
            }
        });


        /*userRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));

            }
        });*/

    }

    private void validate(String userName,String userPassword){
        progressDialog.setMessage("Processing...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(userName,userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                     if(task.isSuccessful()){

                         progressDialog.dismiss();
                         Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                         startActivity(new Intent(MainActivity.this,activity_3.class));



                     }else{
                         Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                         counter--;
                         Info.setText("No of attempts remaining : "+counter);
                         progressDialog.dismiss();
                         if(counter==0)
                         {
                             Login.setEnabled(false);
                         }
                     }
                }
        }
        );



    }
}
