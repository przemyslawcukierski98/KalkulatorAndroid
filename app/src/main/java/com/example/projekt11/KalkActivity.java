package com.example.projekt11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class KalkActivity extends AppCompatActivity {

    private Button p0;
    private Button p1;
    private Button p2;
    private Button p3;
    private Button p4;
    private Button p5;
    private Button p6;
    private Button p7;
    private Button p8;
    private Button p9;

    private Button addButton;
    private Button substractButton;
    private Button multiplyButton;
    private Button backButton;
    private Button equalsButton;
    private Button cButton;

    private TextView dzialanie;
    private int liczba_1;
    private int liczba_2;
    private int wynik;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalk);

        p0 = findViewById(R.id.button_0);
        p1 = findViewById(R.id.button_1);
        p2 = findViewById(R.id.button_2);
        p3 = findViewById(R.id.button_3);
        p4 = findViewById(R.id.button_4);
        p5 = findViewById(R.id.button_5);
        p6 = findViewById(R.id.button_6);
        p7 = findViewById(R.id.button_7);
        p8 = findViewById(R.id.button_8);
        p9 = findViewById(R.id.button_9);

        addButton = findViewById(R.id.button_add);
        substractButton = findViewById(R.id.button_sub);
        multiplyButton = findViewById(R.id.button_multip);
        backButton = findViewById(R.id.button_back);
        equalsButton = findViewById(R.id.button_equal);
        cButton = findViewById(R.id.button_c);

        dzialanie = findViewById(R.id.dzialanie);

        p0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "0");
            }
        });

        p1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "1");
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "2");
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "3");
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "4");
            }
        });

        p5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "5");
            }
        });

        p6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "6");
            }
        });

        p7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "7");
            }
        });

        p8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "8");
            }
        });

        p9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText() + "9");
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzialanie.setText(dzialanie.getText().subSequence(0, dzialanie.getText().length()-1));
            }
        });

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzialanie.setText("");
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter == 0){
                    liczba_1 = Integer.parseInt(String.valueOf(dzialanie.getText()));
                    dzialanie.setText("");
                    counter++;
                }
                else if(counter == 1){
                    liczba_2 = Integer.parseInt(String.valueOf(dzialanie.getText()));
                    wynik = liczba_1 + liczba_2;
                    System.out.println(wynik);
                    counter--;
                }
            }
        });

        substractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter == 0){
                    liczba_1 = Integer.parseInt(String.valueOf(dzialanie.getText()));
                    dzialanie.setText("");
                    counter++;
                }
                else if(counter == 1){
                    liczba_2 = Integer.parseInt(String.valueOf(dzialanie.getText()));
                    wynik = liczba_1 - liczba_2;
                    System.out.println(wynik);
                    counter--;
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter == 0){
                    liczba_1 = Integer.parseInt(String.valueOf(dzialanie.getText()));
                    dzialanie.setText("");
                    counter++;
                }
                else if(counter == 1){
                    liczba_2 = Integer.parseInt(String.valueOf(dzialanie.getText()));
                    wynik = liczba_1 * liczba_2;
                    System.out.println(wynik);
                    counter--;
                }
            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzialanie.setText(Integer.toString(wynik));
                wynik = 0;
            }
        });
    }
}
