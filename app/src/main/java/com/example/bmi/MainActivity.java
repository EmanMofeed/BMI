package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private Switch gender;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
    }



    public void setUpViews(){
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        gender = findViewById(R.id.gender);
        result= findViewById(R.id.result);
    }

    public void calculateBMI(View view) {
        double heightValue = 0;
        double weightValue = 0;
        String msg="";

        if(!(height.getText().toString().isEmpty())){
             heightValue =Double.parseDouble(height.getText().toString());
            msg+= "Your height:" +heightValue +"\n";

        }
        if(!(weight.getText().toString().isEmpty())){
             weightValue = Double.parseDouble(weight.getText().toString());
            msg+= "Your weight:" +weightValue +"\n";

        }



        double value = weightValue / Math.pow(heightValue,2);
if(gender.isChecked()){
    value+=0.05;
    msg+= "\n BMI=" + value ;
}
result.setText(msg);

    }
}