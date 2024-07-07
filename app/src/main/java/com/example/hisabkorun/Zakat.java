package com.example.hisabkorun;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Zakat extends AppCompatActivity {

    Button clear,submit;
    Dialog dialog;
    TextView zakatnisab,totalnisab,totalzakat;
    Button OkButton;


    EditText nisab,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen,eightteen,
            nineteen,twenty,twentyOne,twentyTwo,twentyThree,twentyFour,twentyFive,twentySix,twentySeven,twentyEight,twentyNine,thirty,
            thirtyOne,thirtyTwo,thirtyThree,thirtyFour,thirtyFive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat);

        //Zakat Calculation============================================
        nisab = findViewById(R.id.nisab);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);
        eleven = findViewById(R.id.eleven);
        twelve = findViewById(R.id.twelve);
        thirteen = findViewById(R.id.thirteen);
        fourteen = findViewById(R.id.fourteen);
        fifteen = findViewById(R.id.fifteen);
        sixteen = findViewById(R.id.sixteen);
        seventeen = findViewById(R.id.seventeen);
        eightteen = findViewById(R.id.eighteen);
        nineteen = findViewById(R.id.nineteen);
        twenty = findViewById(R.id.twenty);
        twentyOne = findViewById(R.id.twentyOne);
        twentyTwo = findViewById(R.id.twentyTwo);
        twentyThree = findViewById(R.id.twentyThree);
        twentyFour = findViewById(R.id.twentyFour);
        twentyFive = findViewById(R.id.twentyFive);
        twentySix = findViewById(R.id.twentySix);
        twentySeven = findViewById(R.id.twentySeven);
        twentyEight = findViewById(R.id.twentyEight);
        twentyNine = findViewById(R.id.twentyNine);
        thirty = findViewById(R.id.thirty);
        thirtyOne = findViewById(R.id.thirtyOne);
        thirtyTwo = findViewById(R.id.thirtyTwo);
        thirtyThree = findViewById(R.id.thirtyThree);
        thirtyFour = findViewById(R.id.thirtyFour);
        thirtyFive = findViewById(R.id.thirtyFive);




        submit = findViewById(R.id.submit);
        clear = findViewById(R.id.clear);
        dialog = new Dialog(Zakat.this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nisab_Value = nisab.getText().toString().trim();
                String one_Value = one.getText().toString().trim();
                String two_Value = two.getText().toString().trim();
                String three_Value = three.getText().toString().trim();
                String four_Value = four.getText().toString().trim();
                String five_Value = five.getText().toString().trim();
                String six_Value = six.getText().toString().trim();
                String seven_Value = seven.getText().toString().trim();
                String eight_Value = eight.getText().toString().trim();
                String nine_Value = nine.getText().toString().trim();
                String ten_Value = ten.getText().toString().trim();
                String eleven_Value = eleven.getText().toString().trim();
                String twelve_Value = twelve.getText().toString().trim();
                String thirteen_Value = thirteen.getText().toString().trim();
                String fourteen_Value = fourteen.getText().toString().trim();
                String fifteen_Value = fifteen.getText().toString().trim();
                String sixteen_Value = sixteen.getText().toString().trim();
                String seventeen_Value = seventeen.getText().toString().trim();
                String eighteen_Value = eightteen.getText().toString().trim();
                String ninteen_Value = nineteen.getText().toString().trim();
                String twenty_Value = twenty.getText().toString().trim();
                String twentyone_Value = twentyOne.getText().toString().trim();
                String twentytwo_Value = twentyTwo.getText().toString().trim();
                String twentythree_Value = twentyThree.getText().toString().trim();
                String twentyfour_Value = twentyFour.getText().toString().trim();
                String twentyfive_Value = twentyFive.getText().toString().trim();
                String twentysix_Value = twentySix.getText().toString().trim();
                //----------------------------------------------------------
                String twentyseven_Value = twentySeven.getText().toString().trim();
                String twentyeight_Value = twentyEight.getText().toString().trim();
                String twentynine_Value = twentyNine.getText().toString().trim();
                String thirty_Value = thirty.getText().toString().trim();
                String thirtyone_Value = thirtyOne.getText().toString().trim();
                String thirtytwo_Value = thirtyTwo.getText().toString().trim();
                String thirtythree_Value = thirtyThree.getText().toString().trim();
                String thirtyfour_Value = thirtyFour.getText().toString().trim();
                String thirtyfive_Value = thirtyFive.getText().toString().trim();





                if(nisab_Value.isEmpty()){
                    nisab.setError("দয়া করে পূরুন করুন");
                    Toast.makeText(Zakat.this,"দয়া করে ১ ভরি (তোলা) রূপার মূল্য লিখুন", Toast.LENGTH_SHORT).show();
                }else{
                    double nisab = Double.parseDouble(nisab_Value);
                    double nisabAmount = nisab * 52.5;

                    double One = Double.parseDouble(one_Value);
                    double Two = Double.parseDouble(two_Value);
                    double Three = Double.parseDouble(three_Value);
                    double Four = Double.parseDouble(four_Value);
                    double Five = Double.parseDouble(five_Value);
                    double Six = Double.parseDouble(six_Value);
                    double Seven = Double.parseDouble(seven_Value);
                    double Eight = Double.parseDouble(eight_Value);
                    double Nine = Double.parseDouble(nine_Value);
                    double Ten = Double.parseDouble(ten_Value);
                    double Eleven = Double.parseDouble(eleven_Value);
                    double Twelve = Double.parseDouble(twelve_Value);
                    double Thirteen = Double.parseDouble(thirteen_Value);
                    double Fourteen = Double.parseDouble(fourteen_Value);
                    double Fifteen = Double.parseDouble(fifteen_Value);
                    double Sixteen = Double.parseDouble(sixteen_Value);
                    double Seventeen = Double.parseDouble(seventeen_Value);
                    double Eighteen = Double.parseDouble(eighteen_Value);
                    double Nineteen = Double.parseDouble(ninteen_Value);
                    double Twenty = Double.parseDouble(twenty_Value);
                    double Twentyone = Double.parseDouble(twentyone_Value);
                    double Twentytwo = Double.parseDouble(twentytwo_Value);
                    double Twentythree = Double.parseDouble(twentythree_Value);
                    double Twentyfour = Double.parseDouble(twentyfour_Value);
                    double Twentyfive = Double.parseDouble(twentyfive_Value);
                    double Twentysix = Double.parseDouble(twentysix_Value);
                    //-----------------------------------------------------
                    double Twentyseven = Double.parseDouble(twentyseven_Value);
                    double Twentyeight = Double.parseDouble(twentyeight_Value);
                    double Twentynine = Double.parseDouble(twentynine_Value);
                    double Thirty = Double.parseDouble(thirty_Value);
                    double Thirtyone = Double.parseDouble(thirtyone_Value);
                    double Thirtytwo = Double.parseDouble(thirtytwo_Value);
                    double Thirtythree = Double.parseDouble(thirtythree_Value);
                    double Thirtyfour = Double.parseDouble(thirtyfour_Value);
                    double Thirtyfive = Double.parseDouble(thirtyfive_Value);

                    double totalSum = One+Two+Three+Four+Five+Six+Seven+Eight+Nine+Ten+Eleven+Twelve+Thirteen+Fourteen+Fifteen+Sixteen+Seventeen
                            +Eighteen+Nineteen+Twenty+Twentyone+Twentytwo+Twentythree+Twentyfour+Twentyfive+Twentysix;

                    double totalMinus = Twentyseven+Twentyeight+Twentynine+Thirty+Thirtyone+Thirtytwo+Thirtythree+Thirtyfour+Thirtyfive;

                    double totalSompod = totalSum - totalMinus;
                    double Zakat = totalSompod * 0.025;


                    //ALert Dialog--------------
                    dialog.setContentView(R.layout.custom_dialog);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.setCancelable(true);

                    OkButton = dialog.findViewById(R.id.OkButton);
                    zakatnisab = dialog.findViewById(R.id.zakatnisab);
                    totalnisab = dialog.findViewById(R.id.totalnisab);
                    totalzakat = dialog.findViewById(R.id.totalzakat);

                    zakatnisab.setText(String.valueOf(String.format("%.2f", nisabAmount)));
                    totalnisab.setText(String.valueOf(String.format("%.2f", totalSompod)));
                    if(totalSompod>nisabAmount){
                        totalzakat.setText(String.valueOf(String.format("%.2f", Zakat)));
                    }else{
                        totalzakat.setText("0");
                    }

                    OkButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    dialog.show();
                }
            }


        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nisab.setText("");
                one.setText("");
                two.setText("");
                three.setText("");
                four.setText("");
                five.setText("");
                six.setText("");
                seven.setText("");
                eight.setText("");
                nine.setText("");
                ten.setText("");
                eleven.setText("");
                twelve.setText("");
                thirteen.setText("");
                fourteen.setText("");
                fifteen.setText("");
                sixteen.setText("");
                seventeen.setText("");
                eightteen.setText("");
                nineteen.setText("");
                twenty.setText("");
                twentyOne.setText("");
                twentyTwo.setText("");
                twentyThree.setText("");
                twentyFour.setText("");
                twentyFive.setText("");
                twentySix.setText("");
                twentySeven.setText("");
                twentyEight.setText("");
                twentyNine.setText("");
                thirty.setText("");
                thirtyOne.setText("");
                thirtyTwo.setText("");
                thirtyThree.setText("");
                thirtyFour.setText("");
                thirtyFive.setText("");


            }
        });



    }


}
