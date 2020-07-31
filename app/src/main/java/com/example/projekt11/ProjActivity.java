package com.example.projekt11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProjActivity extends AppCompatActivity {
    public Button powrotbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proj);
        powrotbutton = (Button) findViewById(R.id.powrotbutton);
        powrotbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }

        });
    }

    public void openMainActivity() {
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }
}
