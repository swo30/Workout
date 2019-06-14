package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.CompoundButton;
import android.widget.CheckBox;
import android.app.Activity;
import com.edmodo.rangebar.RangeBar;



public class slider extends AppCompatActivity {

    SeekBar chestSeekBar   ;
    SeekBar backSeekBar    ;
    SeekBar biSeekBar      ;
    SeekBar triSeekBar     ;
    SeekBar shoulderSeekBar;
    SeekBar legsSeekBar    ;
    TextView chestText     ;
    TextView backText      ;
    TextView biText        ;
    TextView triText       ;
    TextView shoulderText  ;
    TextView legsText      ;

    Intent intent;
    int checkboxMuscleGroups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider);

        final int minWorkoutTime = 3; //3 blocks of 10mins aka 3 exercises

        intent = getIntent();
        checkboxMuscleGroups = Integer.parseInt(intent.getStringExtra("checkboxMuscleGroups"));
        System.out.println("NIGGER2: " + checkboxMuscleGroups );


        chestSeekBar        =  findViewById(R.id.chestSeekBar   );
        backSeekBar         =  findViewById(R.id.backSeekBar    );
        biSeekBar           =  findViewById(R.id.biSeekBar      );
        triSeekBar          =  findViewById(R.id.triSeekBar     );
        shoulderSeekBar     =  findViewById(R.id.shoulderSeekBar);
        legsSeekBar         =  findViewById(R.id.legsSeekBar    );
        chestText           =  findViewById(R.id.chestText      );
        backText            =  findViewById(R.id.backText       );
        biText              =  findViewById(R.id.biText         );
        triText             =  findViewById(R.id.triText        );
        shoulderText        =  findViewById(R.id.shoulderText   );
        legsText             =  findViewById(R.id.legsText      );

        SeekBar workoutminSeekBar =  findViewById(R.id.workoutminSeekBar);
        final TextView seekBarValue =  findViewById(R.id.workoutminText);

        addListeners();
        Load_checkbox();

        workoutminSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                seekBarValue.setText(String.valueOf((minWorkoutTime + progress)*10)+" min");
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }

    public void Load_checkbox() {
        if ((checkboxMuscleGroups&32) == 32) {
            chestSeekBar.setVisibility(View.VISIBLE);
            chestText.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups&16) == 16) {
            backText.setVisibility(View.VISIBLE);
            backSeekBar.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups&8) == 8) {
            biText.setVisibility(View.VISIBLE);
            biSeekBar.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups&4) == 4) {
            triText.setVisibility(View.VISIBLE);
            triSeekBar.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups&2) == 2) {
            shoulderText.setVisibility(View.VISIBLE);
            shoulderSeekBar.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups&1) == 1) {
            legsText.setVisibility(View.VISIBLE);
            legsSeekBar.setVisibility(View.VISIBLE);
        }
    }


    public void addListeners(){


        chestSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                chestText   .setText(String.format("Chest:%d min", (progress+1)*10));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        backSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                backText    .setText(String.format("Back:%d min", (progress+1)*10));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        biSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                biText      .setText(String.format("Biceps:%d min", (progress+1)*10));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        triSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                triText     .setText(String.format("Triceps:%d min", (progress+1)*10));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        shoulderSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                shoulderText.setText(String.format("Shoulders:%d min", (progress+1)*10));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        legsSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                legsText     .setText(String.format("Legs:%d min", (progress+1)*10));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

    }

}






