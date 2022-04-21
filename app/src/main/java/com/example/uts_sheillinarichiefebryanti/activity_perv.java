package com.example.uts_sheillinarichiefebryanti;

import static com.example.uts_sheillinarichiefebryanti.activity_pervi_listview.shappeList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_perv extends AppCompatActivity {

    public static ArrayList<Shape> shapeList = new ArrayList<Shape>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perv);

        setupData();
        setUpList();
        setUpOnclickListener();
    }

    private void setupData()
    {
        Shape insidious = new Shape("0", "Insidious      Genre Horror", R.drawable.insidious);
        shappeList.add(insidious);

        Shape toystory4 = new Shape("1", "Toy Story 4       Genre Adventure", R.drawable.toystory4);
        shappeList.add(toystory4);

        Shape avatar2 = new Shape("2", "Avatar2       Genre Action", R.drawable.avatar2);
        shappeList.add(avatar2);

        Shape mischiefnight2013 = new Shape("3", "Mischief Night 2013      Genre Thriller", R.drawable.mischiefnight2013);
        shappeList.add(mischiefnight2013);

        Shape mrbean = new Shape("4", "Mr Bean       Genre Comedy", R.drawable.mrbean);
        shappeList.add(mrbean);

        Shape tuneinforlove = new Shape("5", "Tune In For Love      Genre Romance", R.drawable.tuneinforlove);
        shappeList.add(tuneinforlove);

        Shape luca = new Shape("6", "Luca    Genre Fantasy", R.drawable.luca);
        shappeList.add(luca);

        Shape encanto = new Shape("7", "Encanto      Genre Family", R.drawable.encanto);
        shappeList.add(encanto);

        Shape doraemon = new Shape("8", "Doraemon     Genre Anime", R.drawable.doraemon);
        shappeList.add(doraemon);

        Shape boysoverflowers = new Shape("9", "Boys Over Flowers      Genre Drama", R.drawable.boysoverflowers);
        shappeList.add(boysoverflowers);
    }

    private void setUpList()
    {
        listView = (ListView) findViewById(R.id.shapesListView);

        activity_perv_adapter adapter = new activity_perv_adapter(getApplicationContext(), 0, shapeList);
        listView.setAdapter(adapter);
    }

    private void setUpOnclickListener()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Shape selectShape = (Shape) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), activity_perv_detail.class);
                showDetail.putExtra("id",selectShape.getId());
                startActivity(showDetail);
            }
        });

    }
}