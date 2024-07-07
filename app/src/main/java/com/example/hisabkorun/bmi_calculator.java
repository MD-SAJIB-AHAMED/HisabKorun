package com.example.hisabkorun;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class bmi_calculator extends AppCompatActivity {

    EditText feet,inch,weight,result;
    TextView comment,info;
    ImageButton clear;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);

        feet = findViewById(R.id.feet);
        inch = findViewById(R.id.inch);
        weight = findViewById(R.id.weight);
        result = findViewById(R.id.result);

        comment = findViewById(R.id.comment);
        info = findViewById(R.id.info);

        submit = findViewById(R.id.submit);
        clear = findViewById(R.id.clear);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String feetValue = String.valueOf(feet.getText());
                String inchValue = String.valueOf(inch.getText());
                String weightValue = String.valueOf(weight.getText());

                if (feetValue.isEmpty() || inchValue.isEmpty() || weightValue.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
                }
                else {


                    double feetD = Double.parseDouble(feetValue);
                    double inchD = Double.parseDouble(inchValue);
                    double weitD = Double.parseDouble(weightValue);

                    double Inch = (feetD * 12) + inchD;
                    double meter = Inch * 0.0254;
                    double Feet = meter * meter;

                    double bmi = weitD / Feet;

                    result.setText(String.valueOf(String.format("%.2f", bmi)));

                    if (bmi < 16) {
                        comment.setText("Under Weight");
                        info.setText(R.string.underweight);
                        comment.setTextColor(Color.RED);
                        result.setBackgroundColor(Color.RED);
                    } else if (bmi >= 16 && bmi < 18.5) {
                        comment.setText("Under Weight");
                        info.setText(R.string.underweight);
                        comment.setTextColor(Color.BLUE);
                        result.setBackgroundColor(Color.BLUE);
                    } else if (bmi >= 18.5 && bmi < 25) {
                        comment.setText("Normal");
                        info.setText(R.string.normal);
                        comment.setTextColor(Color.GREEN);
                        result.setBackgroundColor(Color.GREEN);
                    } else if (bmi >= 25 && bmi < 30) {
                        comment.setText("Over Weight");
                        info.setText(R.string.overweight);
                        comment.setTextColor(Color.YELLOW);
                        result.setBackgroundColor(Color.YELLOW);
                    } else if (bmi >= 30 && bmi < 35) {
                        comment.setText("Obesity");
                        info.setText(R.string.obesity);
                        comment.setTextColor(Color.MAGENTA);
                        result.setBackgroundColor(Color.MAGENTA);
                    } else if (bmi >= 35 && bmi < 40) {
                        comment.setText("Obesity");
                        info.setText(R.string.obesity);
                        comment.setTextColor(Color.MAGENTA);
                        result.setBackgroundColor(Color.MAGENTA);
                    } else {
                        comment.setText("Obesity");
                        info.setText(R.string.obesity);
                        comment.setTextColor(Color.RED);
                        result.setBackgroundColor(Color.RED);

                    }

                }
            }
        });



        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feet.setText("");
                inch.setText("");
                weight.setText("");
                result.setText("");
                comment.setText("");
                info.setText("");
                result.setBackgroundColor(Color.LTGRAY);
            }
        });
    }
}