package com.example.a15056251.demoimageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivDay1;
    ImageView ivDay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivDay1 = (ImageView)findViewById(R.id.imageView);
        ivDay2 = (ImageView)findViewById(R.id.imageView2);
        
    }
}
