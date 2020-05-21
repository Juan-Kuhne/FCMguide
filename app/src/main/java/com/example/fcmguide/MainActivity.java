package com.example.fcmguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View v){
        EditText txtIdade = findViewById(R.id.txtIdade);
        String sIdade = txtIdade.getText().toString();

        Intent intent = new Intent(this, Fcm.class);

        intent.putExtra("age", sIdade);
        startActivity(intent);
    }
}
