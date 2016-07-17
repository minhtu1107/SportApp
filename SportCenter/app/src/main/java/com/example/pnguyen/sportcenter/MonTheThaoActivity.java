package com.example.pnguyen.sportcenter;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MonTheThaoActivity extends AppCompatActivity {

    // Array of strings...
    ListView simpleList;
    String sportList[] = {"Bóng Đá", "Bóng Rổ","Cầu lông", "Bơi", "Tennis","Bóng bàn"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthethao);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, sportList);
        simpleList.setAdapter(arrayAdapter);
    }
}