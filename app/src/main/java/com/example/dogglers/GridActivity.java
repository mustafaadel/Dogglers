package com.example.dogglers;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    RecyclerView recycler;
    int numberOfColumns=2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_grid_list);
        recycler =findViewById(R.id.grid_recycler_view);
        ArrayList<Dogs> dog = new ArrayList<>();
        dog.add(new Dogs("faye","Age: 1","playing",R.drawable.faye));
        dog.add(new Dogs("bella","Age: 2","playing",R.drawable.bella));
        dog.add(new Dogs("frankie","Age: 3","playing",R.drawable.frankie));
        dog.add(new Dogs("nox","Age: 4","playing",R.drawable.nox));
        dog.add(new Dogs("leroy","Age: 5","playing",R.drawable.leroy));
        dog.add(new Dogs("frankie","Age: 6","playing",R.drawable.tzeitel));
        Adapter adapter =new Adapter(dog);
        recycler.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        recycler.setAdapter(adapter);

    }
}
