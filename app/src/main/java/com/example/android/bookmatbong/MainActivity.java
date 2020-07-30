package com.example.android.bookmatbong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_book, btn_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_book = (Button) findViewById(R.id.btn_book);
        btn_check = (Button) findViewById(R.id.btn_check);
        btn_book.setOnClickListener(this);
        btn_check.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == btn_book.getId()){
            Intent intent = new Intent(this, BookPage.class);
            startActivity(intent);
        } else if(view.getId() == btn_check.getId()){
            Intent intent = new Intent(this, CheckPage.class);
            startActivity(intent);
        }
    }
}