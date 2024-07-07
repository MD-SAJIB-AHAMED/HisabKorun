package com.example.hisabkorun;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char PERCENT = '%';
    private char currentSymbol;
    private double firstValue = Double.NaN;
    private double secondValue;
    private TextView inputDisplay, outputDisplay;
    private DecimalFormat decimalFormat;
    private MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonDot, buttonAdd, buttonSub, buttonMultiply, buttonDivide, buttonPercent, buttonClear, buttonOFF, buttonEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Drawer start==============================================
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.zakat) {
                    Intent intent = new Intent(MainActivity.this, Zakat.class);
                    startActivity(intent);
                }
                if(item.getItemId()==R.id.bmi) {
                    Intent intent = new Intent(MainActivity.this, bmi_calculator.class);
                    startActivity(intent);
                }
                if(item.getItemId()==R.id.details) {
                    Intent intent = new Intent(MainActivity.this, Details.class);
                    startActivity(intent);
                }
                if(item.getItemId()==R.id.nav_share) {
                    Toast.makeText(MainActivity.this,"Working...",Toast.LENGTH_LONG).show();
                }
                if(item.getItemId()==R.id.nav_exit) {
                    finish();
                }
                return false;
            }
        });

        toggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Drawer finish================================================

        //Calculator start===============================================

        decimalFormat = new DecimalFormat("#.##########");
        inputDisplay = findViewById(R.id.input);
        outputDisplay = findViewById(R.id.output);
        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonAdd = findViewById(R.id.add);
        buttonSub = findViewById(R.id.subtract);
        buttonDivide = findViewById(R.id.division);
        buttonDot = findViewById(R.id.btnPoint);
        buttonMultiply = findViewById(R.id.multiply);
        buttonClear = findViewById(R.id.clear);
        buttonOFF = findViewById(R.id.off);
        buttonEqual = findViewById(R.id.equal);
        buttonPercent = findViewById(R.id.percent);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + "9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allCalculations();
                currentSymbol = ADDITION;
                outputDisplay.setText(decimalFormat.format(firstValue) + "+");
                inputDisplay.setText(null);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allCalculations();
                currentSymbol = SUBTRACTION;
                outputDisplay.setText(decimalFormat.format(firstValue) + "-");
                inputDisplay.setText(null);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allCalculations();
                currentSymbol = MULTIPLICATION;
                outputDisplay.setText(decimalFormat.format(firstValue) + "x");
                inputDisplay.setText(null);
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allCalculations();
                currentSymbol = DIVISION;
                outputDisplay.setText(decimalFormat.format(firstValue) + "/");
                inputDisplay.setText(null);
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                allCalculations();
                currentSymbol = PERCENT;
                outputDisplay.setText(decimalFormat.format(firstValue) + "%");
                inputDisplay.setText(null);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText(inputDisplay.getText() + ".");
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputDisplay.getText().length() > 0) {
                    CharSequence currentText = inputDisplay.getText();
                    inputDisplay.setText(currentText.subSequence(0, currentText.length() - 1));
                } else {
                    firstValue = Double.NaN;
                    secondValue = Double.NaN;
                    inputDisplay.setText("");
                    outputDisplay.setText("");
                }
            }
        });
        buttonOFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputDisplay.setText("");
                outputDisplay.setText("");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    allCalculations();
                    outputDisplay.setText(decimalFormat.format(firstValue));
                    firstValue = Double.NaN;
                    currentSymbol = '0';
                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"invalid",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    //Drawer==============================
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    //=======================================

    //Calculator start here===========================
    private void allCalculations(){
        if (!Double.isNaN(firstValue)) {
            secondValue = Double.parseDouble(inputDisplay.getText().toString());
            inputDisplay.setText(null);
            if (currentSymbol == ADDITION)
                firstValue = this.firstValue + secondValue;
            else if (currentSymbol == SUBTRACTION)
                firstValue = this.firstValue - secondValue;
            else if (currentSymbol == MULTIPLICATION)
                firstValue = this.firstValue * secondValue;
            else if (currentSymbol == DIVISION)
                firstValue = this.firstValue / secondValue;
            else if (currentSymbol == PERCENT)
                firstValue = this.firstValue % secondValue;
        } else {
            try {
                firstValue = Double.parseDouble(inputDisplay.getText().toString());
            } catch (Exception e) {
            }
        }
    }
    //finish========================================




}

