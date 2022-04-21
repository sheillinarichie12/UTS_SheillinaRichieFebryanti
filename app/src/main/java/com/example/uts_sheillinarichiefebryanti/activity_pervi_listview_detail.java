package com.example.uts_sheillinarichiefebryanti;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_pervi_listview_detail extends AppCompatActivity {

    Shape selectedShape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pervi_listview_detail);

        getSelectedShape();
        setValues();
    }

    public void getSelectedShape(){
        Intent previousIntent = getIntent();
        String parseStringId = previousIntent.getStringExtra("id");
        selectedShape = activity_pervi_listview.shappeList.get(Integer.valueOf(parseStringId));
    }

    public void setValues(){
        TextView tv = findViewById(R.id.list_text);
        ImageView iv = findViewById(R.id.list_image);

        tv.setText(selectedShape.getName());
        iv.setImageResource(selectedShape.getImage());
    }
}