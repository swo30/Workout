package com.example.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CheckBox;

public class groups extends AppCompatActivity {
    private Button nextButton;

    private CheckBox chestCheckBox ;
    private CheckBox backCheckBox ;
    private CheckBox biCheckBox ;
    private CheckBox triCheckBox ;
    private CheckBox shoulderCheckBox ;
    private CheckBox legCheckBox ;

    private boolean oneCheckBox = false;
    public int checkboxMuscleGroups = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groups);


        nextButton = (Button) findViewById(R.id.nextButton);

        chestCheckBox = findViewById(R.id.chestCheckBox);
        backCheckBox = findViewById(R.id.backCheckBox);
        biCheckBox = findViewById(R.id.biCheckBox);
        triCheckBox = findViewById(R.id.triCheckBox);
        shoulderCheckBox = findViewById(R.id.shoulderCheckBox);
        legCheckBox = findViewById(R.id.legCheckBox);



        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sliderPage();
            }
        });


        chestCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    oneCheckBox = true;
                    checkboxMuscleGroups = checkboxMuscleGroups|32; //32 is 10 0000
                }else{
                    oneCheckBox = false;
                    checkboxMuscleGroups = checkboxMuscleGroups^32; //32 is 10 0000

                }
            }
        });

        backCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    oneCheckBox = true;
                    checkboxMuscleGroups = checkboxMuscleGroups|16; //16 is 01 0000
                }else{
                    oneCheckBox = false;
                    checkboxMuscleGroups = checkboxMuscleGroups^16; //16 is 01 0000

                }
            }
        });
        biCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    oneCheckBox = true;
                    checkboxMuscleGroups = checkboxMuscleGroups|8; //8 is 00 1000
                }else{
                    oneCheckBox = false;
                    checkboxMuscleGroups = checkboxMuscleGroups^8; //8 is 00 1000

                }
            }
        });
        triCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    oneCheckBox = true;
                    checkboxMuscleGroups = checkboxMuscleGroups|4; //4 is 00 0100
                }else{
                    oneCheckBox = false;
                    checkboxMuscleGroups = checkboxMuscleGroups^4; //4 is 00 0100

                }
            }
        });
        shoulderCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    oneCheckBox = true;
                    checkboxMuscleGroups = checkboxMuscleGroups|2; //2 is 00 0010
                }else{
                    oneCheckBox = false;
                    checkboxMuscleGroups = checkboxMuscleGroups^2; //2 is 00 0010

                }
            }
        });
        legCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((CompoundButton) view).isChecked()){
                    oneCheckBox = true;
                    checkboxMuscleGroups = checkboxMuscleGroups|1; //1 is 00 0001
                }else{
                    oneCheckBox = false;
                    checkboxMuscleGroups = checkboxMuscleGroups^1; //1 is 00 0001
                }
            }
        });

        System.out.print(oneCheckBox);
        if (oneCheckBox) {
            nextButton.isEnabled();
        }


    }

    public void sliderPage(){
        Intent intent = new Intent(this, slider.class);
        startActivity(intent);
    }

}
