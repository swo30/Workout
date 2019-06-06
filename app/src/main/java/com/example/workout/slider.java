package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.SeekBar;
import android.app.Activity;
import com.edmodo.rangebar.RangeBar;


public class slider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider);

        SeekBar workoutminSeekBar =  findViewById(R.id.workoutminSeekBar);
        final TextView seekBarValue =  findViewById(R.id.workoutminText);
        final TextView topText =  findViewById(R.id.topText);
        final TextView bottomText =  findViewById(R.id.bottomText);


        RangeBar rangebar = findViewById(R.id.rangebar);
        rangebar.setTickCount(8);
        rangebar.setTickHeight(25);
        rangebar.setBarWeight(6);
        rangebar.setBarColor(2);



        rangebar.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onIndexChangeListener(RangeBar rangeBar, int leftThumbIndex, int rightThumbIndex) {
                topText.setText(String.valueOf(10+leftThumbIndex*10)+" min");
                bottomText.setText(String.valueOf(10+rightThumbIndex*10)+" min");
            }
        });


        workoutminSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText(String.valueOf(10+progress*10)+" min");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });

    }

}






