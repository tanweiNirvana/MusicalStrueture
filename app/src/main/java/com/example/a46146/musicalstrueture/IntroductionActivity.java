package com.example.a46146.musicalstrueture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroductionActivity extends AppCompatActivity {

    private ImageView iv_pic;
    private TextView tv_name;
    private TextView tv_singer;
    private TextView tv_Album;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        //achieve song
        Intent intent=getIntent();
        Music song= (Music) intent.getSerializableExtra("music");
        //Initialization view
        iv_pic= (ImageView) findViewById(R.id.iv_pic);
        tv_name= (TextView) findViewById(R.id.tv_name);
        tv_singer= (TextView) findViewById(R.id.tv_singer);
        tv_Album= (TextView) findViewById(R.id.tv_Album);
        //insert data
        iv_pic.setBackgroundResource(song.getPic());
        tv_name.setText(song.getName());
        tv_singer.setText(song.getSinger());
        tv_Album.setText(song.getAlbum());
    }
}
