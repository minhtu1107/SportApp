package com.example.pnguyen.sportcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KhuVucActivity extends AppCompatActivity {

    // Array of strings...
    ListView simpleList;
    String KhuVucList[] = {"Quận 1", "Quận 2","Quận 3", "Quận 4", "Quận 5","Quận 6", "Quận 7", "Quận 8", "Quận 9", "Quận 10", "Quận 11", "Quận 12", "Huyện Bình Chánh", "Huyện Hốc Môn", "Huyện Củ Chi","Huyện Nhà Bè"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthethao);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, KhuVucList);
        simpleList.setAdapter(arrayAdapter);
    }
}