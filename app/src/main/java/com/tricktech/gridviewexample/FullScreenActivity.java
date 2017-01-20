package com.tricktech.gridviewexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenActivity extends AppCompatActivity {

    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        imageView = (ImageView) findViewById(R.id.imageView);
        MyImageViewAdapter adapter = new MyImageViewAdapter(this);
        Intent intent = getIntent();
        int position = intent.getIntExtra("id", 0);
        imageView.setImageResource(adapter.mThumbIds[position]);
    }
}
