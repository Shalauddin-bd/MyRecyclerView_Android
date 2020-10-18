package com.example.myrecylcerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.OnRecyclerListItemClickListener {
    private static final String TAG = "MainActivity";
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerAdapter;
    RecyclerView.LayoutManager recyclerLayoutManager;

    String[] titleList = {"Lalbag Fort", "Ahsan Manzil", "Shaheed Minar", "Jatiya Sangsad Bhaban"};
    String[] descriptionList = {"17th-century Mughal fort complex.",
                                "The official residential palace of the Nawab of Dhaka.",
                                "A national monument.",
                                "The house of the Parliament of Bangladesh."};
    int[] itemImageList = {R.drawable.lalbagfort, R.drawable.ahsanmonjil, R.drawable.shaheedminar, R.drawable.nationalassembly};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewListContainer);
        recyclerView.setHasFixedSize(true);
        recyclerLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutManager);

        recyclerAdapter = new RecyclerAdapter(this,titleList, descriptionList, itemImageList, this);
        recyclerView.setAdapter(recyclerAdapter);
    }

    @Override
    public void OnListItemClick(int position) {
//        Log.d(TAG, "OnListItemClick: Clicked- " + position);
//        Toast.makeText(this,"Clicked item index: "+position, Toast.LENGTH_LONG).show();
//        String spotName = titleList[position];
//        Toast.makeText(this,"Spot Name: "+spotName, Toast.LENGTH_LONG).show();

//        String[] activityClassList = {"Activity01", "Activity02", "Activity03", "Activity04"};
//        String activityName = activityClassList[position];
//        try {
//            Class newClass = Class.forName(activityName);
//            Intent resume = new Intent(this, newClass);
//            startActivity(resume);
//        } catch (ClassNotFoundException e) {
//            Toast.makeText(this,"Class Not Found!", Toast.LENGTH_LONG).show();
//            e.printStackTrace();
//        }

       if(position == 0){
            Intent intent = new Intent(MainActivity.this, Activity01.class);
            startActivity(intent);
       }else  if(position == 1){
           Intent intent = new Intent(MainActivity.this, Activity02.class);
           startActivity(intent);
       }else  if(position == 2){
           Intent intent = new Intent(MainActivity.this, Activity03.class);
           startActivity(intent);
       }else  if(position == 3){
           Intent intent = new Intent(MainActivity.this, Activity04.class);
           startActivity(intent);
       }
    }
}