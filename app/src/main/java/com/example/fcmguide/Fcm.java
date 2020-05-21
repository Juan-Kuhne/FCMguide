package com.example.fcmguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Fcm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcm);

        //pegando valor da intent
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String sIdade = b.getString("age");
        int idade = 0;
        try {
            idade = Integer.parseInt(sIdade);
        } catch (NumberFormatException nfe){
            //
        }

        if (idade != 0) {
            //pegando TextViews
            TextView tvidade = findViewById(R.id.idade);
            TextView tvfcm = findViewById(R.id.fcm);
            TextView tvcmrap = findViewById(R.id.cmrap);
            TextView tvtrote = findViewById(R.id.trote);
            TextView tvcdleve = findViewById(R.id.cdleve);
            TextView tvcdmod = findViewById(R.id.cdmod);
            TextView tvcdint = findViewById(R.id.cdint);

            //alterando valores das TextViews
            DecimalFormat df = new DecimalFormat("#.0");
            int fcm = 220 - idade;
            tvidade.setText(idade + " anos");
            tvfcm.setText(fcm + " bpm");
            tvcmrap.setText(df.format(fcm * 0.55) + " a " + df.format(fcm * 0.6) + " bpm");
            tvtrote.setText(df.format(0.65 * fcm) + " a " + df.format(0.7 * fcm) + " bpm");
            tvcdleve.setText(df.format(0.75 * fcm) + " a " + df.format(0.8 * fcm) + " bpm");
            tvcdmod.setText(df.format(0.85 * fcm) + " a " + df.format(0.9 * fcm) + " bpm");
            tvcdint.setText("acima de " + df.format(0.95 * fcm) + " bpm");
        }
    }
}
