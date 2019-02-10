package com.example.testjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = findViewById(R.id.AddBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            int res;
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.Num1EditText);
                EditText num2 = findViewById(R.id.Num2EditText);
                TextView resultTextView = findViewById(R.id.ResTextView);

                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                res += n1 + n2;
                resultTextView.setText(res + "");
            }
        });

        Button togBtn = findViewById(R.id.togBtn);
        togBtn.setOnClickListener(new View.OnClickListener() {
            Boolean pic=false;
            @Override
            public void onClick(View v) {
                ImageView imgView = findViewById(R.id.img1);
                if (pic) {
                    imgView.setImageResource(R.drawable.front_side);
                    pic=false;
                }
                else {
                    imgView.setImageResource(R.drawable.grass);
                    pic = true;
                }
            }
        });

    }
}
