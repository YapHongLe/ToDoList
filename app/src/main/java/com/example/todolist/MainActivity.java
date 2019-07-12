package com.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.todolist.CustomAdapter;
import sg.edu.rp.c346.todolist.ToDoList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDoList;
    ArrayList<ToDoList> androidList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvToDoList = findViewById(R.id.listView);

        androidList = new ArrayList<>();

        ToDoList ver1 = new ToDoList("MSA", "1/7/2019");
        ToDoList ver2 = new ToDoList("Go for haircut", "22/9/2019");
        androidList.add(ver1);
        androidList.add(ver2);

        adapter = new CustomAdapter(this, R.layout.row, androidList);

        lvToDoList.setAdapter(adapter);

    }
}


