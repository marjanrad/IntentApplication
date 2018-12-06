package com.example.marjanraad.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name , age , phone , email;
    Button btnSend , btnReset ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.Main_name);
        age=findViewById(R.id.Main_age);
        phone=findViewById(R.id.Main_phone);
        email=findViewById(R.id.Main_email);
        btnSend=findViewById(R.id.btn_send);
        btnReset=findViewById(R.id.btn_reset);

        final String yourName = name.getText().toString().trim();
        final String yourAge= age.getText().toString().trim();
        final String yourPhone= phone.getText().toString().trim();
        final String yourEmail= email.getText().toString().trim();


        // send info to ShowInfoActivity
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this , ShowInfoActivity.class);
                intent.putExtra("NAME" , yourName);
                intent.putExtra("AGE" , yourAge);
                intent.putExtra("PHONE" , yourPhone);
                intent.putExtra("EMAIL" , yourEmail);
                startActivity(intent);
            }
        });

        //click for reset list
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
