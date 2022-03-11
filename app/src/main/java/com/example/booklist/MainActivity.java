// PA02 by Adham and Alexia

package com.example.booklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView BookList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BookList=(ListView) findViewById(R.id.BookList);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("android");
        arrayList.add("su");
        arrayList.add("cks");
        arrayList.add("and I don't love it");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        BookList.setAdapter(arrayAdapter);

        BookList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "clicked item:"+i+" "+arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}