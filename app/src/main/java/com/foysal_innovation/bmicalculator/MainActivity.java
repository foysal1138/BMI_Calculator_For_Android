package com.foysal_innovation.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edweight,edheighFeet,edheightInch;
    Button bcalculateBMI;
    TextView tvdisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edweight = findViewById(R.id.edweight);
        edheighFeet = findViewById(R.id.edheighFeet);
        edheightInch = findViewById(R.id.edheightInch);
        bcalculateBMI = findViewById(R.id.bcalculateBMI);
        tvdisplay = findViewById(R.id.tvdisplay);

        bcalculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float weightKg,heightFeet,heightInch,heightMeter,BMI;
                weightKg = Float.parseFloat(edweight.getText().toString());
                heightFeet = Float.parseFloat(edheighFeet.getText().toString());
                heightInch = Float.parseFloat(edheightInch.getText().toString());

                heightFeet = (float) (heightFeet*0.3048);
                heightInch = (float) (heightInch*0.0254 );
                heightMeter = heightFeet + heightInch;
                BMI = weightKg/(heightMeter*heightMeter);


                if(BMI>= 16 && BMI<=17)
                {
                    tvdisplay.setText("BMI:"+BMI+"\nYou are in Moderately underweight.\nHurry to increase your Weight!");
                }
                else if (BMI>= 17.0 && BMI<=18.5)
                {
                    tvdisplay.setText("BMI:"+BMI+"\nYou are in Slightly underweight.\nHurry to increase your Weight!");
                }

                else if(BMI>= 18.5  && BMI<=24.9)
                {
                    tvdisplay.setText("BMI:"+BMI+"\nYou are in Healthy weight.\nGood Job!");
                }

               else if(BMI>= 25.0  && BMI<=29.9)
                {
                    tvdisplay.setText("BMI:"+BMI+"\nYou are in Pre-obesity.\nHave to concious about your Food!!");
                }

               else if(BMI>= 30.0  && BMI<=34.9)
                {
                    tvdisplay.setText("BMI:"+BMI+"\nYou are in Obesity class I.\nNeed to decrease your Weight!!");
                }

               else if(BMI>= 35.0  && BMI<=39.9)
                {
                    tvdisplay.setText("BMI:"+BMI+"\nYou are in Obesity class II.\nNeed to decrease your Weight!! ");
                }


               else if(BMI>=40)
                {
                    tvdisplay.setText("BMI:"+BMI+"\nYou are in Obesity class III.\nNeed to decrease your Weight and Hurry to consult a Health specialist and must maintain his or her prescription!!! ");
                }


                else{
                    tvdisplay.setText("BMI:"+BMI+"\nYou are in Severely underweight.\nHurry to consult a nutrition specialist and must maintain his or her prescription!!! ");
                }



            }
        });

    }
}