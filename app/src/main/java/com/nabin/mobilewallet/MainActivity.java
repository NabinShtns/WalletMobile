package com.nabin.mobilewallet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nabin.mobilewallet.MyAdapter.MyAdapter;
import com.nabin.mobilewallet.UI.secondScreen;
import com.nabin.mobilewallet.model.moodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerview;
private TextView name , location;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            name =findViewById(R.id.Name);
            location= findViewById(R.id.Location);
            button = findViewById(R.id.btntest);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, secondScreen.class);
                    startActivity(intent);
                }
            });

        recyclerview = findViewById(R.id.recyclerview);
        List<moodel> moodelList = new ArrayList<>();
        moodelList.add(new moodel("nabin","thimi"));
        moodelList.add(new moodel("mohan","balkumari"));
        moodelList.add(new moodel("ramu","kathmandu"));
        moodelList.add(new moodel("prabin","chapagaon"));
        moodelList.add(new moodel("munna","bhaktapur"));
        moodelList.add(new moodel("nabin","thimi"));
        moodelList.add(new moodel("mohan","balkumari"));
        moodelList.add(new moodel("ramu","kathmandu"));
        moodelList.add(new moodel("prabin","chapagaon"));
        moodelList.add(new moodel("munna","bhaktapur"));
        moodelList.add(new moodel("nabin","thimi"));
        moodelList.add(new moodel("mohan","balkumari"));
        moodelList.add(new moodel("ramu","kathmandu"));
        moodelList.add(new moodel("prabin","chapagaon"));
        moodelList.add(new moodel("munna","bhaktapur"));
        moodelList.add(new moodel("nabin","thimi"));
        moodelList.add(new moodel("mohan","balkumari"));
        moodelList.add(new moodel("ramu","kathmandu"));
        moodelList.add(new moodel("prabin","chapagaon"));
        moodelList.add(new moodel("munna","bhaktapur"));

        MyAdapter myAdapter = new MyAdapter(this, moodelList);
        recyclerview.setAdapter(myAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));



    }
}