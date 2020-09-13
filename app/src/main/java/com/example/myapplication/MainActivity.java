package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginbutton = (Button) findViewById(R.id.loginButton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText emailaddress = (EditText) (findViewById(R.id.loginEmailAddress));
                EditText password = (EditText) findViewById(R.id.editTextNumberPassword);
                TextView message1 = (TextView) findViewById(R.id.alertMessage);


                if (emailaddress.getText().toString().equals("sainisanjot26@gmail.com") && password.getText().toString().equals("123456")){
                   Intent intent = new Intent(MainActivity.this, HomePage.class);
                   startActivity(intent);

                }
                else {
                    message1.setText("Invalid Credential");
                    message1.setVisibility(View.VISIBLE);

                }


            }
        });

        TextView newUser = (TextView) findViewById(R.id.newUser);
        TextView forgotText = (TextView) findViewById(R.id.iForgotPasswordText);

        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RegisterPage.class);
                startActivity(intent);

            }
        });

        forgotText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ForgotPassword.class);
                startActivity(intent);
            }
        });

    }


}