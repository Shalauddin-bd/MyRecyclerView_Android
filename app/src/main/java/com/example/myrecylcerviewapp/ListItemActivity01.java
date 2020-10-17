package com.example.myrecylcerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ListItemActivity01 extends AppCompatActivity {

    private static final String TAG = "ListItemActivity01";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item01);

        Log.d(TAG, "onCreate: Called");
//        Intent intent = new Intent(this, ListItemActivity01.class);
//        intent.putExtra("ListItem_01","Item_01");
//        startActivity(intent);
    }
}