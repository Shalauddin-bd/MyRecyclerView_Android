package com.example.myrecylcerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity01 extends AppCompatActivity implements View.OnClickListener{

    ImageView ivPlaceImage;
    TextView tvPlaceTitle;
    TextView tvPlaceDescription;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);

        btnHome= findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(this);
        tvPlaceDescription= findViewById(R.id.textViewPlaceDescription);
        tvPlaceDescription.setText("Lalbagh Fort (also Fort Aurangabad) is an incomplete 17th-century Mughal fort complex that stands before the Buriganga River in the southwestern part of Dhaka, Bangladesh. The construction was started in 1678 AD by Mughal Subahdar Muhammad Azam Shah, who was son of Emperor Aurangzeb and later emperor himself. His successor, Shaista Khan, did not continue the work, though he stayed in Dhaka up to 1688.\n" +
                "\n" +
                "The fort was never completed, and unoccupied for a long period of time. Much of the complex was built over and now sits across from modern buildings.\n" +
                "\n");
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }
}