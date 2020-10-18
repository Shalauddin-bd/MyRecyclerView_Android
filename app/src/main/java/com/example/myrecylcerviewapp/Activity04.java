package com.example.myrecylcerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity04 extends AppCompatActivity implements View.OnClickListener {

    TextView tvPlaceDescription;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_04);

        btnHome= findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(this);
        tvPlaceDescription= findViewById(R.id.textViewPlaceDescription);
        tvPlaceDescription.setText("The Jatiya Sangsad (Bengali: জাতীয় সংসদ Jatiyô Sôngsôd; lit. ’National Parliament’), often referred to simply as the Sangsad or JS and also known as the House of the Nation,[2] is the supreme legislative body of Bangladesh. The current parliament of Bangladesh contains 350[2] seats, including 50 seats reserved for women, which are apportioned on elected party position in the parliament. Elected occupants are called members of parliament or MPs. The 11th National Parliamentary Election was held on 30 December 2018. Elections are held every five years unless the parliament is dissolved before that time.[3]\n" +
                "\n" +
                "The leader of the party (or alliance of parties) holding the majority of seats becomes the Prime Minister of Bangladesh, and the head of the government. The President of Bangladesh, the ceremonial head of state, is chosen by Parliament. Since the December 2008 national election, the current majority party is the Awami League. It is led by Prime Minister Sheikh Hasina.\n" +
                "\n");
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }
}