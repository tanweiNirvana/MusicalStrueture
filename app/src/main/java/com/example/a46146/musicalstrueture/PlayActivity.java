package com.example.a46146.musicalstrueture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        //achieve song
        Intent intent=getIntent();
        Music song= (Music) intent.getSerializableExtra("music");
        //Initialization view
        TextView tv_play= (TextView) findViewById(R.id.tv_play);
        //insert data
        tv_play.setText(song.getLyric());
    }
}
