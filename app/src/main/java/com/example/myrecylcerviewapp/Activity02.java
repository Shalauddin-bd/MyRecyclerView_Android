package com.example.myrecylcerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity02 extends AppCompatActivity implements View.OnClickListener {

    TextView tvPlaceDescription;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_02);

        btnHome= findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(this);
        tvPlaceDescription= findViewById(R.id.textViewPlaceDescription);
        tvPlaceDescription.setText("Ahsan Manzil was the official residential palace and seat of the Nawab of Dhaka.[1] The building is situated at Kumartoli along the banks of the Buriganga River in Dhaka, Bangladesh. Construction was started in 1859 and was completed in 1872.[1] It was constructed in the Indo-Saracenic Revival architecture. It has been designated as a national museum.\n" +
                "\n");
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }
}