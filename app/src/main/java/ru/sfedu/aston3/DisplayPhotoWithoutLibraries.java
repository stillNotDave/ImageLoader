package ru.sfedu.aston3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class DisplayPhotoWithoutLibraries extends AppCompatActivity {

    EditText text;
    ImageView image;
    private ImageLoader imgLoader;
    String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        image = findViewById(R.id.image);
        text = findViewById(R.id.edit_text);

        //imgLoader = new ImageLoader(this);

    }

    public void loadImageOnClick(View view){
        //imgLoader.DisplayImage(url, image);
    }
}