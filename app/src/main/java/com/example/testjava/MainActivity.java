package com.example.testjava;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#CEA6FF"));

        Button addBtn = findViewById(R.id.AddBtn);
        final TextView resultTextView = findViewById(R.id.ResTextView);
        final Button togBtn = findViewById(R.id.togBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            int res;
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.Num1EditText);
                EditText num2 = findViewById(R.id.Num2EditText);

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                res += n1 + n2;
                resultTextView.setText(String.format(Locale.UK, "%d", res));
            }
        });


        togBtn.setOnClickListener(new View.OnClickListener() {
            Boolean pic=false;
            @Override
            public void onClick(View v) {
                ImageView imgView = findViewById(R.id.img1);
                if (pic) {
                    imgView.setImageResource(R.drawable.front_side);
                    pic=false;
                    uRes("Front", resultTextView, "Show Grass", togBtn);
                }
                else {
                    imgView.setImageResource(R.drawable.grass);
                    pic = true;
                    uRes("Grass", resultTextView, "Show Front", togBtn);
                }
            }
        });


    }

    public void uRes(String strRes, TextView resultTextView, String strBtnLab, Button togBtn) {
        resultTextView.setText(strRes);
        togBtn.setText(strBtnLab);
    }


}
