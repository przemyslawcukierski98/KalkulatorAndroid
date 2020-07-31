package com.example.projekt11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    public Button kalkbutton;
    private Button projbutton;
    private Button zalogujbutton;
    private Button koniecbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kalkbutton = findViewById(R.id.kalkbutton);
        projbutton = findViewById(R.id.projbutton);
        zalogujbutton = findViewById(R.id.zalogujbutton);
        koniecbutton = findViewById(R.id.koniecbutton);

        projbutton.setOnClickListener(this);
        kalkbutton.setOnClickListener(this);
        zalogujbutton.setOnClickListener(this);
        koniecbutton.setOnClickListener(this);

        koniecbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    private void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.projbutton:
                openProjActivity();
                break;
            case R.id.kalkbutton:
                openKalkActivity();
                break;
            case R.id.zalogujbutton:
                openZalogujActivity();
                break;
            }
        }

    public void openProjActivity(){
        Intent intent1 = new Intent(this, ProjActivity.class);
        startActivity(intent1);
    }

    public void openKalkActivity(){
        Intent intent2 = new Intent(this, KalkActivity.class);
        startActivity(intent2);
    }

    public void openZalogujActivity(){
        Intent intent3 = new Intent( this, zalogujactivity.class);
        startActivity(intent3);
    }
}

