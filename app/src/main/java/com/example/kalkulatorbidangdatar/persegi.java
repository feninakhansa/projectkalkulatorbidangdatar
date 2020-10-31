package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {

    EditText epanjang;
    Button bkeliling, bluas;
    TextView thasil3, thasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        epanjang=(EditText) findViewById(R.id.etjari);
        bkeliling=(Button) findViewById(R.id.btnkeliling);
        bluas=(Button) findViewById(R.id.btnluas);
        thasil3=(TextView) findViewById(R.id.tvhasil3);
        thasil2=(TextView) findViewById(R.id.tvhasil2);

        bkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, hasil;
                bil1=Double.valueOf(epanjang.getText().toString().trim());
                hasil=bil1*4;
                String hasil1 = String.valueOf(hasil);
                thasil3.setText(hasil1);
            }
        });
        bluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, hasil;
                bil1=Double.valueOf(epanjang.getText().toString().trim());
                hasil=bil1 * bil1;
                String hasil1 = String.valueOf(hasil);
                thasil2.setText(hasil1);
            }
        });
    }
}