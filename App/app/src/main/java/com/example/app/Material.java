package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Material extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);

        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter =  new RecyclerViewAdapter(obtenerVideos());
        recyclerView.setAdapter(adapter);

    }
    public List<Recurso> obtenerVideos(){
        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("https://www.youtube.com/watch?v=QFuFaNsUX0c"));
        recursos.add(new Recurso("https://youtu.be/9MEIwUIaaVk?list=PL2dWUhgFt1yns0e2XhLsEUOekNpXMiFvw"));
        recursos.add(new Recurso("https://youtu.be/9MEIwUIaaVk?list=PL2dWUhgFt1yns0e2XhLsEUOekNpXMiFvw"));
        return recursos;
    }

}
