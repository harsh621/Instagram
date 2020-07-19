package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView MyListView = findViewById(R.id.MyListView);
        ArrayList<String> Tables = new ArrayList<>();
        Tables.add("Table Of 1");
        Tables.add("Table Of 2");
        Tables.add("Table Of 3");
        Tables.add("Table Of 4");
        Tables.add("Table Of 5");
        Tables.add("Table Of 6");
        Tables.add("Table Of 7");
        Tables.add("Table Of 8");
        Tables.add("Table Of 9");
        Tables.add("Table Of 10");
        Tables.add("Table Of 11");
        Tables.add("Table Of 12");
        Tables.add("Table Of 13");
        Tables.add("Table Of 14");
        Tables.add("Table Of 15");
        Tables.add("Table Of 16");
        Tables.add("Table Of 17");
        Tables.add("Table Of 18");
        Tables.add("Table Of 19");
        Tables.add("Table Of 20");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Tables);
        MyListView.setAdapter(arrayAdapter);
        MyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


    }
}