package com.example.foodapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.example.foodapp.Adapters.RecipeAdapter;
import com.example.foodapp.Classes.RecyclerItemClickListener;
import com.example.foodapp.Models.RecipeModel;

import java.util.ArrayList;

public class RecycleviewMain_activity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview_main_activity);

        recyclerView = findViewById(R.id.recyclermain);

        ArrayList<RecipeModel> list = new ArrayList<>();

        list.add(new RecipeModel(R.drawable.buger1, "Burger"));
        list.add(new RecipeModel(R.drawable.buger2, "Burger"));
        list.add(new RecipeModel(R.drawable.burger3, "Burger"));
        list.add(new RecipeModel(R.drawable.burger4, "Burger"));
        list.add(new RecipeModel(R.drawable.buger5, "Burger"));
        list.add(new RecipeModel(R.drawable.buger6, "Burger"));
        list.add(new RecipeModel(R.drawable.burger7, "Burger"));
        list.add(new RecipeModel(R.drawable.burger8, "Burger"));
        list.add(new RecipeModel(R.drawable.burger9, "Burger"));
        list.add(new RecipeModel(R.drawable.burger10, "Burger"));

        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:

                        Intent intent = new Intent(RecycleviewMain_activity.this,ScrollingActivity.class);
                        startActivity(intent);
                        break;

                    case 1:

                        Toast.makeText(RecycleviewMain_activity.this, "Second item is clicked", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));


//        StaggeredGridLayoutManager stagered = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(stagered);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);
//        listview

//      horizontal view with right to left
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        recyclerView.setLayoutManager(linearLayoutManager);
        }
}
