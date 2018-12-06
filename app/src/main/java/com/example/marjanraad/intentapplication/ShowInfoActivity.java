package com.example.marjanraad.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        textView=findViewById(R.id.ShowInfo_tv);

        Intent intent =getIntent();
        String name=intent.getStringExtra("NAME");
        String age=intent.getStringExtra("AGE");
        String phone=intent.getStringExtra("PHONE");
        String email=intent.getStringExtra("EMAIL");

        textView.setText("Name: "+name+"\n"+"Age: "+age+"\n"+"Phone: " + phone + "\n" + "Email: " +email);
    }

}
