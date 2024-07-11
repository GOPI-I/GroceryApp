package com.example.thegroceryapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<item> itemList;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();
        item item2 = new item(R.drawable.tomato,"Tomato","1 Kg",4.00);
        item item3 = new item(R.drawable.onion,"Onion","1 Kg",3.00);
        item item4 = new item(R.drawable.potato,"Potato","1 Kg",2.43);
        item item5 = new item(R.drawable.biscut,"Biscut","1 Packet",5.56);
        item item6 = new item(R.drawable.kellos,"Kelloys","1 Box",3.07);
        item item7 = new item(R.drawable.maggie,"Maggie","1 Family Pack",4.30);
        item item8 = new item(R.drawable.oats,"Oats","1 Pack",5.00);
        item item9 = new item(R.drawable.offer,"Cleaner","Offer Pack",6.39);

        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        itemList.add(item7);
        itemList.add(item8);
        itemList.add(item9);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        myAdapter = new MyAdapter(itemList);

        recyclerView.setAdapter(myAdapter);






    }
}