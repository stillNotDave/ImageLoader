package ru.sfedu.aston3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.net.URL;

public class ImagePicasso extends AppCompatActivity implements TextWatcher {

    EditText text;
    ImageView image;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        image = findViewById(R.id.image);
        text = findViewById(R.id.edit_text);
        //url = "https://i.imgur.com/DvpvklR.png";

        text.addTextChangedListener(this);

        // Picasso
    }

    public void makeErrorToast() {
        Toast.makeText(this, "error", Toast.LENGTH_LONG).show();
        System.out.println("error Toast");
    }

    public void loadImage() {
        url = text.getText().toString();
        if (url.length() != 0) {
            Picasso
                    .get()
                    .load(url)
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_foreground)
                    .into(image, new Callback() {
                        @Override
                        public void onSuccess() {
                        }

                        @Override
                        public void onError(Exception e) {
                            makeErrorToast();
                        }
                    });
        }
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    }

    @Override
    public void afterTextChanged(Editable editable) {
        loadImage();
    }
}