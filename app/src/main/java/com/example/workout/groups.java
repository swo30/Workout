package com.example.workout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class groups extends AppCompatActivity {
    private Button nextButton;

    private CheckBox chestCheckBox ;
    private CheckBox backCheckBox ;
    private CheckBox biCheckBox ;
    private CheckBox triCheckBox ;
    private CheckBox shoulderCheckBox ;
    private CheckBox legCheckBox ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groups);


        nextButton = (Button) findViewById(R.id.nextButton);

        chestCheckBox = (CheckBox)findViewById(R.id.chestCheckBox);
        backCheckBox = (CheckBox)findViewById(R.id.backCheckBox);
        biCheckBox = (CheckBox)findViewById(R.id.biCheckBox);
        triCheckBox = (CheckBox)findViewById(R.id.triCheckBox);
        shoulderCheckBox = (CheckBox)findViewById(R.id.shoulderCheckBox);
        legCheckBox = (CheckBox)findViewById(R.id.legCheckBox);



        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sliderPage();
            }
        });











    }

    public void sliderPage(){
        Intent intent = new Intent(this, slider.class);
        startActivity(intent);
    }

}
