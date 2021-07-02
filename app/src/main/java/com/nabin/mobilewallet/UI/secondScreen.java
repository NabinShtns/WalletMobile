package com.nabin.mobilewallet.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.nabin.mobilewallet.R;

public class secondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);


        ImageButton send = (ImageButton) findViewById(R.id.btnsend);
        ImageButton recieve = (ImageButton) findViewById(R.id.btnrecive);
        ImageButton more = (ImageButton) findViewById(R.id.btnmore);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"send button is clicked",Toast.LENGTH_LONG).show();
            }
        });

        recieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"recive button is clicked",Toast.LENGTH_LONG).show();

            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"more button is clicked",Toast.LENGTH_LONG).show();

            }
        });


    }
}