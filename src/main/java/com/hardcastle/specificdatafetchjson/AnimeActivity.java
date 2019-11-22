package com.hardcastle.specificdatafetchjson;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        // hide the default actionbar
        getSupportActionBar().hide();

        // Recieve data

        String name  = getIntent().getExtras().getString("anime_name");
        String description = getIntent().getExtras().getString("anime_description");
        String studio = getIntent().getExtras().getString("studio");


        // ini views

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id);
        collapsingToolbarLayout.setTitleEnabled(true);

        TextView tv_name = findViewById(R.id.aa_anime_name);
        TextView tv_decript = findViewById(R.id.descriptiont);
        TextView tu_studio = findViewById(R.id.studiot);

        // setting values to each view

        tv_name.setText(name);
        tv_decript.setText(description);
        tu_studio.setText(studio);


        collapsingToolbarLayout.setTitle(name);


        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);






    }
}
