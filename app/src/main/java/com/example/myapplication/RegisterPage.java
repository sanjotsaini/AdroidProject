package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);
        Button registerbutton = (Button) findViewById(R.id.registerButton);
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstName = (EditText) (findViewById(R.id.fisrtNamePlainText));
                TextView message = (TextView) findViewById(R.id.messageTextRegister);
                String messageForRegister = firstName.getText().toString();
                message.setText("Hi" + messageForRegister +" thank you for registering !");
                message.setVisibility(View.VISIBLE);

            }
        });
    }
}