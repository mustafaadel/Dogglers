package com.example.dogglers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class activity_vertical_list extends AppCompatActivity {
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_list);
        recycler =findViewById(R.id.vertical_recycler_view);
        ArrayList<Dogs> dog = new ArrayList<>();
        dog.add(new Dogs("faye","Age: 1","playing",R.drawable.faye));
        dog.add(new Dogs("bella","Age: 2","playing",R.drawable.bella));
        dog.add(new Dogs("frankie","Age: 3","playing",R.drawable.frankie));
        dog.add(new Dogs("nox","Age: 4","playing",R.drawable.nox));
        dog.add(new Dogs("leroy","Age: 5","playing",R.drawable.leroy));
        dog.add(new Dogs("frankie","Age: 6","playing",R.drawable.tzeitel));
        Adapter adapter =new Adapter(dog);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(linearLayoutManager);
        recycler.setAdapter(adapter);
    }
}