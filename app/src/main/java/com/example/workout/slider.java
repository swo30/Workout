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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider);

        final int minWorkoutTime = 3; //3 blocks of 10mins aka 3 exercises

        SeekBar workoutminSeekBar =  findViewById(R.id.workoutminSeekBar);
        final TextView seekBarValue =  findViewById(R.id.workoutminText);

        workoutminSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText(String.valueOf((minWorkoutTime + progress)*10)+" min");
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


        SeekBar chestSeekBar    =  findViewById(R.id.chestSeekBar   );
        SeekBar backSeekBar     =  findViewById(R.id.backSeekBar    );
        SeekBar biSeekBar       =  findViewById(R.id.biSeekBar      );
        SeekBar triSeekBar      =  findViewById(R.id.triSeekBar     );
        SeekBar shoulderSeekBar =  findViewById(R.id.shoulderSeekBar);
        SeekBar legsSeekBar     =  findViewById(R.id.legsSeekBar    );

        final TextView chestText    =  findViewById(R.id.chestText   );
        final TextView backText     =  findViewById(R.id.backText    );
        final TextView biText       =  findViewById(R.id.biText      );
        final TextView triText      =  findViewById(R.id.triText     );
        final TextView shoulderText =  findViewById(R.id.shoulderText);
        final TextView legText      =  findViewById(R.id.legText     );



        groups group = new groups();
        int checkboxMuscleGroups = group.getCheckboxMuscleGroups();
        System.out.println("MUSCLEGROUPS CHECKBOX NUMBER IS  " + checkboxMuscleGroups );

        if ((checkboxMuscleGroups & 1) == 1){
            chestSeekBar.setVisibility(View.VISIBLE);
            chestText.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups & 2)==2){
            backText.setVisibility(View.VISIBLE);
            backSeekBar.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups & 4)==4){
            biText.setVisibility(View.VISIBLE);
            biSeekBar.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups & 8)==8){
            triText.setVisibility(View.VISIBLE);
            triSeekBar.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups & 16)==16){
            shoulderText.setVisibility(View.VISIBLE);
            shoulderSeekBar.setVisibility(View.VISIBLE);
        }

        if ((checkboxMuscleGroups & 32)==32){
            legText.setVisibility(View.VISIBLE);
            legsSeekBar.setVisibility(View.VISIBLE);
        }



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
                legText     .setText(String.format("Legs:%d min", (progress+1)*10));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });



    }

}






