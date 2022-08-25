package com.onurcetin.ilkugraslar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeImage(View view){
        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.supmario);

    }
}