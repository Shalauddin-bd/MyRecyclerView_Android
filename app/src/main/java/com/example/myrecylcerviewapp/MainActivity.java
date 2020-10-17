package com.example.myrecylcerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

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
        Log.d(TAG, "OnListItemClick: Clicked- " + position);
    }
}