package com.example.soundboard;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DecimalFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
//    MediaPlayer mySound1;
//    MediaPlayer mySound2;
    MediaPlayer phil;
    PlaybackParams params= new PlaybackParams();
    private boolean updown = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mySound1 = MediaPlayer.create(this, R.raw.bullshit);
//        mySound2 = MediaPlayer.create(this,R.raw.cantremember);
        phil = MediaPlayer.create(this,R.raw.philphilphil);

    }


//    public void sound1(View view) {
//        mySound1.start();
//    }
//
//    public void sound2(View view) {
//        mySound2.start();
//    }

    public void phil(View view) {
//        Float r = new Random().nextFloat();
//        params.setPitch(r);
//        phil.setPlaybackParams(params);
        phil.start();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("PHIL CALLED");
        }
    }
