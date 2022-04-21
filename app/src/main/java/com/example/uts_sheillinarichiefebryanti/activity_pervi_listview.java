package com.example.uts_sheillinarichiefebryanti;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class activity_pervi_listview extends Fragment {

    public activity_pervi_listview(){

    }

    public static ArrayList<Shape> shappeList = new ArrayList<Shape>();
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.activity_pervi_listview, container, false);
        setupData();

        listView = v.findViewById(R.id.shapeListview);
        activity_pervi_listview_cell adapter = new activity_pervi_listview_cell(getContext(), 0, shappeList);
        listView.setAdapter(adapter);

        setupOnClickListener();
        return v;
    }

    public void setupData(){
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

        Shape luca = new Shape("6", "Luca       Genre Fantasy", R.drawable.luca);
        shappeList.add(luca);

        Shape encanto = new Shape("7", "Encanto       Genre Family", R.drawable.encanto);
        shappeList.add(encanto);

        Shape doraemon = new Shape("8", "Doraemon      Genre Anime", R.drawable.doraemon);
        shappeList.add(doraemon);

        Shape boysoverflowers = new Shape("9", "Boys Over Flowers      Genre Drama", R.drawable.boysoverflowers);
        shappeList.add(boysoverflowers);
    }

    private void setupOnClickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shape selectShape = (Shape) listView.getItemAtPosition(i);
                Intent showDetail = new Intent(getContext(), activity_pervi_listview_detail.class);
                showDetail.putExtra("id", selectShape.getId());
                startActivity(showDetail);
            }
        });
    }
}