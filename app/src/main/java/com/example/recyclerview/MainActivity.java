package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private ArrayList<BioModal> bioModalArrayList;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        bioModalArrayList = new ArrayList<>();

        buildRecyclerView();
        getData();

    }

    private void getData() {

        bioModalArrayList.add(new BioModal("Ankit Khandelwal",
                "Android App Developer"));
        bioModalArrayList.add(new BioModal("Kabir Rawat",
                "UI/UX Designer"));
        bioModalArrayList.add(new BioModal("Sachin Sharma",
                "Frontend Developer"));
        bioModalArrayList.add(new BioModal("Parth Singh",
                "App Developer"));
        bioModalArrayList.add(new BioModal("Vaibhav Kapoor",
                "Full Stack Developer"));
        bioModalArrayList.add(new BioModal("Arjun Rathore",
                "Game Designer"));
        bioModalArrayList.add(new BioModal("Karan Ahuja",
                "Backend Developer"));
        bioModalArrayList.add(new BioModal("Virat Wahi",
                "SQL Developer"));
        bioModalArrayList.add(new BioModal("Eshant Sharma",
                "Web Designer"));
        bioModalArrayList.add(new BioModal("Aryan Jain",
                "App Developer"));
    }

    private void buildRecyclerView() {
        adapter = new CustomAdapter(bioModalArrayList,getApplication());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);
    }
}