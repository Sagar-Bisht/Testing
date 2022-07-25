package com.example.android.recyclerviewdemotwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);

        recycler_view.setLayoutManager(new LinearLayoutManager(this));

      //  recycler_view.setLayoutManager(new GridLayoutManager(this ,2) );

      //  recycler_view.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));



        ArrayList<Structure> list = new ArrayList<>();
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));
        list.add(new Structure(R.drawable.avatar_1,"sagar"));
        list.add(new Structure(R.drawable.avatar_2,"sagar"));
        list.add(new Structure(R.drawable.avatar_3,"sagar"));
        list.add(new Structure(R.drawable.avatar_4,"sagar"));
        list.add(new Structure(R.drawable.avatar_5,"sagar"));

        MyAdaptor adaptor = new MyAdaptor(list,this);
        recycler_view.setHasFixedSize(true);
        recycler_view.setAdapter(adaptor);
    }
}