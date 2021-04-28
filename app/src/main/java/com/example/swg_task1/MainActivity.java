package com.example.swg_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        List<String> title=new ArrayList<>();
        List<Integer> image=new ArrayList<>();

        title.add("Student Mentorship Programme");
        title.add("PDS Doubt Sessions");
        title.add("ET Doubt SSessions");
        title.add("Examania");


            image.add(R.drawable.smp);
        image.add(R.drawable.pds);
        image.add(R.drawable.et);
        image.add(R.drawable.examania);

        MyAdapter myAdapter=new MyAdapter(this, title, image);

        listView.setAdapter(myAdapter);
    }



    public void openTabbedActivity(View view) {
        Toast.makeText(this,"Button was clicked",Toast.LENGTH_LONG).show();
    }
}