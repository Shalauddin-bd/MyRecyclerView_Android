package com.example.myrecylcerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity03 extends AppCompatActivity implements View.OnClickListener {

    TextView tvPlaceDescription;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_03);

        btnHome= findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(this);
        tvPlaceDescription= findViewById(R.id.textViewPlaceDescription);
        tvPlaceDescription.setText("The Shaheed Minar (Bengali: শহীদ মিনার Shohid Minar lit. \"Martyr Monument\") is a national monument in Dhaka, Bangladesh, established to commemorate those killed during the Bengali Language Movement demonstrations of 1952 in then East Pakistan." +
                "\n" +
                "National, mourning, cultural and other activities are held each year on 21 February (Ekushey February) to mark Language Movement Day or Shaheed Dibas (Martyrs' Day), centred on the Shaheed Minar. Since 2000, 21 February is also recognised as International Mother Language Day.\n" +
                "\n");
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }
}