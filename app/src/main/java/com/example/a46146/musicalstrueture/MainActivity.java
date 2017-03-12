package com.example.a46146.musicalstrueture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;
    private Music song1;
    private Music song2;
    private Music song3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();         //Initialization data
        initView();         //Initialization view
        setListener();      //create Listener
    }

    private void setListener() {
        onClickListener onclickListener = new onClickListener();
        btn1.setOnClickListener(onclickListener);
        btn2.setOnClickListener(onclickListener);
        btn3.setOnClickListener(onclickListener);
        iv1.setOnClickListener(onclickListener);
        iv2.setOnClickListener(onclickListener);
        iv3.setOnClickListener(onclickListener);
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn_music_1);
        btn2 = (Button) findViewById(R.id.btn_music_2);
        btn3 = (Button) findViewById(R.id.btn_music_3);
        iv1 = (ImageView) findViewById(R.id.iv_music_1);
        iv2 = (ImageView) findViewById(R.id.iv_music_2);
        iv3 = (ImageView) findViewById(R.id.iv_music_3);
    }

    private void initData() {
        song1 = new Music("This Song Is About You", "Olly Murs", "In Case You Didnt Know", R.drawable.this_song,
                "Olly Murs-This Song Is About You\n" +
                        "this is my confessional\n" +
                        "pen and paper round gonna right this down\n" +
                        "saying things you never thought\n" +
                        "that were on my mind,\n" +
                        "let the truth pour out\n" +
                        "cause im tired of the games\n" +
                        "i wont lie, no im not ok!\n" +
                        "you were wrong youre to blame,\n" +
                        "now the world knows your name\n" +
                        "so here you go,\n" +
                        "you finally get a song about you on the radio\n" +
                        "are you happy now that you broke me down!\n" +
                        "now i curse the day that i met you\n" +
                        "i hope you know this song is about you,\n" +
                        "this is no mistake, yes i meant to\n" +
                        "i hope you know this song is about you, about you!\n" +
                        "this song is about you, yeah!\n" +
                        "seem im feeling better now,\n" +
                        "i like the way our heads lifting off my chest!\n" +
                        "should have done months ago\n" +
                        "if i knew back ten it would feel like this!\n" +
                        "cause you done all the games\n" +
                        "i wont lie, no im not ok\n" +
                        "you were wrong, youre the blame\n" +
                        "now the world knows your name!\n" +
                        "so here you go,\n" +
                        "you finally get a song about you on the radio\n" +
                        "are you happy now that you broke me down!\n" +
                        "now i curse the day that i met you\n" +
                        "i hope you know this song is about you,\n" +
                        "this is no mistake, yes i meant to\n" +
                        "i hope you know this song is about you\n" +
                        "when you hear this play,\n" +
                        "i hope you feel the same way that i felt that day\n" +
                        "that you let me, yeah you left me!\n" +
                        "this is my confession\n" +
                        "pen and paper round gonna right this down\n" +
                        "so here you go,\n" +
                        "you finally get a song about you on the radio\n" +
                        "are you happy now that you broke me down!\n" +
                        "now i curse the day that i met you\n" +
                        "i hope you know this song is about you,\n" +
                        "this is no mistake, yes i meant to\n" +
                        "i hope you know this song is about you, about you\n" +
                        "about you, about you, about you!\n" +
                        "this song is about you,\n" +
                        "this song is about you yeah!\n" +
                        "this song is about you,\n" +
                        "this song is about you, oh!\n");
        song2 = new Music("Undo", "Sanna nielsen", "Undo", R.drawable.undo,
                "Silent, I can't wait here silent\n" +
                        "Working up a storm inside my head\n" +
                        "Nothing, I just stood for nothing\n" +
                        "So I fell for everything you said\n" +
                        "Hear the rumble\n" +
                        "Hear my voice\n" +
                        "Silent, I can't wait here silent\n" +
                        "Gotta make a change and make some noise\n" +
                        "Undo my sad\n" +
                        "Undo what hurts so bad\n" +
                        "Undo my pain\n" +
                        "Gonna get out, through the rain\n" +
                        "I know that I am over you\n" +
                        "At last I know what I should do\n" +
                        "Undo my sad\n" +
                        "Trouble, baby I'm in trouble\n" +
                        "Everytime I look into your eyes\n" +
                        "Save me, oh I'm gonna save me\n" +
                        "Far away from all the crazy lies\n" +
                        "Hear the rumble\n" +
                        "Hear my voice\n" +
                        "Undo my sad\n" +
                        "Undo what hurts so bad\n" +
                        "Undo my pain\n" +
                        "Gonna get out, through the rain\n" +
                        "I know that I am over you\n" +
                        "At last I know what I should do\n" +
                        "Undo my sad\n" +
                        "Undo my sad\n" +
                        "Undo what hurts so bad\n" +
                        "Undo my pain\n" +
                        "Gonna get out, through the rain\n" +
                        "I know that I am over you\n" +
                        "At last I know what I should do\n" +
                        "Undo my sad\n" +
                        "My sad\n" +
                        "Undo");
        song3 = new Music("Road Trip", "DARIN", "flashback", R.drawable.roadtrip,
                "Baby I got love for you\n" +
                        "And I appreciate the things you do\n" +
                        "But I got no reason to stay\n" +
                        "Cause somehow We don't seem to work it out\n" +
                        "And baby ain't it what it's all about\n" +
                        "Think I gotta take a break\n" +
                        "\n" +
                        "Trying to figure out\n" +
                        "Where we be ending up\n" +
                        "I have to follow my intuition\n" +
                        "Make a dicision\n" +
                        "Just for a while I have to let it go\n" +
                        "I have to follow my intuition\n" +
                        "Make a dicision\n" +
                        "\n" +
                        "I'm taking a road trip\n" +
                        "Trying forget you\n" +
                        "City to city but it all\n" +
                        "Reminds me of you\n" +
                        "I pull down the window\n" +
                        "Feeling the wind blow\n" +
                        "I need to breathe in something new\n" +
                        "\n" +
                        "All we do is fight\n" +
                        "We never work it out\n" +
                        "No need to look\n" +
                        "Into the rearview mirror\n" +
                        "The only thing that's right\n" +
                        "Is for us to divide\n" +
                        "No need to look back\n" +
                        "In the rearview mirror\n" +
                        "\n" +
                        "After all that we've been thru\n" +
                        "Girl I can't stay mad at you\n" +
                        "I just can't stay mad at you\n" +
                        "Cause I've been getting Pictures in my head\n" +
                        "On how I used To dry those tears you shed\n" +
                        "Still I got to make a move\n" +
                        "\n" +
                        "Trying to figure out\n" +
                        "Where we be ending up\n" +
                        "I have to follow my intuition\n" +
                        "Make a dicision\n" +
                        "Just for a while I have to let it go\n" +
                        "I have to follow my intuition\n" +
                        "Make a dicision\n" +
                        "\n" +
                        "I'm taking a road trip\n" +
                        "Trying forget you\n" +
                        "City to city but it all\n" +
                        "Reminds me of you\n" +
                        "I pull down the window\n" +
                        "Feeling the wind blow\n" +
                        "I need to breathe in something new\n" +
                        "\n" +
                        "All we do is fight\n" +
                        "We never work it out\n" +
                        "No need to look\n" +
                        "Into the rearview mirror\n" +
                        "The only thing that's right\n" +
                        "Is for us to divide\n" +
                        "No need to look back\n" +
                        "In the rearview mirror\n" +
                        "\n" +
                        "I'm taking a road trip\n" +
                        "Trying forget you\n" +
                        "City to city but it all\n" +
                        "Reminds me of you\n" +
                        "I pull down the window\n" +
                        "Feeling the wind blow\n" +
                        "I need to breathe in something new\n" +
                        "\n" +
                        "All we do is fight\n" +
                        "We never work it out\n" +
                        "No need to look\n" +
                        "Into the rearview mirror\n" +
                        "The only thing that's right\n" +
                        "Is for us to divide\n" +
                        "No need to look back\n" +
                        "In the rearview mirror");
    }

    class onClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.iv_music_1:
                    intent = new Intent(MainActivity.this, PlayActivity.class);
                    //transmit song
                    intent.putExtra("music", song1);
                    startActivity(intent);
                    break;
                case R.id.iv_music_2:
                    intent = new Intent(MainActivity.this, PlayActivity.class);
                    //transmit song
                    intent.putExtra("music", song2);
                    startActivity(intent);
                    break;
                case R.id.iv_music_3:
                    intent = new Intent(MainActivity.this, PlayActivity.class);
                    //transmit song
                    intent.putExtra("music", song3);
                    startActivity(intent);
                    break;
                case R.id.btn_music_1:
                    intent = new Intent(MainActivity.this, IntroductionActivity.class);
                    //transmit song
                    intent.putExtra("music", song1);
                    startActivity(intent);
                    break;
                case R.id.btn_music_2:
                    intent = new Intent(MainActivity.this, IntroductionActivity.class);
                    //transmit song
                    intent.putExtra("music", song2);
                    startActivity(intent);
                    break;
                case R.id.btn_music_3:
                    intent = new Intent(MainActivity.this, IntroductionActivity.class);
                    //transmit song
                    intent.putExtra("music", song3);
                    startActivity(intent);
                    break;
            }
        }
    }
}
