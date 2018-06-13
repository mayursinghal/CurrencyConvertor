package com.example.mayursinghal.imagetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void clicked(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageclicked);
        image.setImageResource(R.drawable.index1);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
