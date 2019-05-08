package com.example.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rv);
        String[] mydataset ={"hi","hello","namaste","kk","byebye","ahahha"};

        myadapter = new MyAdapter(mydataset);
        recyclerView.setAdapter(myadapter);




    }
}
