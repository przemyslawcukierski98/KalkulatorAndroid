package com.example.projekt11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class zalogujactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zalogujactivity);
        EditText konto = findViewById(R.id.konto_input);
        EditText haslo = findViewById(R.id.password_input);
        String toasttext = "Podano błędny login lub hasło";
    }

    public void check_login(View view) {
        EditText login = findViewById(R.id.konto_input);
        EditText password = findViewById(R.id.password_input);
        String login_ver = login.getText().toString();
        String pass_ver = password.getText().toString();

        if ((login_ver.equals("login") && pass_ver.equals("haslo")) || (login_ver.equals("50k") && pass_ver.equals("permonth"))) {
            setResult(RESULT_OK);
            openMainActivity();
            finish();
        } else {
            Toast toast = Toast.makeText(this, R.string.toasttext,
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    private void openMainActivity() {
        Intent intent5 = new Intent(this, MainActivity.class);
        startActivity(intent5);
        Toast toast = Toast.makeText(this, R.string.dobredane, Toast.LENGTH_SHORT);
        toast.show();
        finish();
    }

}
