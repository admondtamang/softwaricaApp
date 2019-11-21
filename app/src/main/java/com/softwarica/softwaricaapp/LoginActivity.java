package com.softwarica.softwaricaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText name,password;
    Button login;
    private int counter = 5;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=findViewById(R.id.txtName);
        password=findViewById(R.id.txtPassword);

        login=findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });
    }
    public void validate(String name,String password){

        if(name.equals("") || password.equals("")){
            Toast.makeText(LoginActivity.this,"Enter user name and password",Toast.LENGTH_SHORT).show();
            return;
        }

        if(name.equals("admin") && password.equals("admin")){
            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
        }else {
            counter--;
            error.setText("No of attempts remaining: " + String.valueOf(counter));

            if (counter == 0) {
                login.setEnabled(false);
            }
        }

    }
}
