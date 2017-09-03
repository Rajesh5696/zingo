package com.example.hi.settingzingo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.hi.settingzingo.R.id.share;

public class MainActivity extends AppCompatActivity {
Button bt7,bt6,bt5,bt4,bt3;
    MediaPlayer mp;
    Intent sendIntent;
    Context c;
    String sharel="https://play.google.com/store/apps/details?id=com.fankick&hl=en";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt7=(Button)findViewById(R.id.contacts);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.gemini-us.com/about-us/contact-us/"));
                startActivity(i);
            }
        });
        bt6=(Button)findViewById(R.id.abt);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.gemini-us.com/about-us/"));
                startActivity(i);
            }
        });
        bt5=(Button)findViewById(R.id.play);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p= new Intent(MainActivity.this,how_to_play.class);
                startActivity(p);

            }
        });
        bt4=(Button)findViewById(R.id.play);
        mp=MediaPlayer.create(this,R.raw.sunny_2mp3);



        bt4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mp.start();



                //Intent p= new Intent(MainActivity.this,how_to_play.class);
                //startActivity(p);

            }
        });
        bt4=(Button)findViewById(share);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Share");
                sendIntent.putExtra(Intent.EXTRA_TEXT, sharel);
                startActivity(sendIntent);
            }
        });


    }
}
