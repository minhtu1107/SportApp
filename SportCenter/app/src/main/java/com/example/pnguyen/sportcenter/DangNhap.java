package com.example.pnguyen.sportcenter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DangNhap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button dangnhap = (Button)findViewById(R.id.dangnhap);
        dangnhap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(DangNhap.this, MainActivity.class);
                startActivity(intent);
            }
        });
        super.onCreate(savedInstanceState);
    }
}
