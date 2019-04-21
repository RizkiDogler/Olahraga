package com.example.asus.olahraga;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class OlahragaDetail extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);


        getIncomingIntent();
    }

    private void getIncomingIntent(){


        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") ){


            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String deskripsi = getIntent().getStringExtra("deskripsi");




            setImage(imageUrl, imageName, deskripsi);

        }
    }


    private void setImage(String imageUrl, String imageName, String deskripsi ){

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);

        TextView desk = findViewById(R.id.deskripsi);
        desk.setText(deskripsi);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .apply(new RequestOptions().override(500, 600))
                .into(image);
    }

}
