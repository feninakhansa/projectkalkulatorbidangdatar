package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    EditText esisi1, esisi2, esisi3, etinggi;
    Button bkeliling, bluas;
    TextView thasil3, thasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        esisi1=(EditText) findViewById(R.id.etjari);
        esisi2=(EditText) findViewById(R.id.etsisi2);
        esisi3=(EditText) findViewById(R.id.etsisi3);
        etinggi=(EditText) findViewById(R.id.ettinggi);
        bkeliling=(Button) findViewById(R.id.btnkeliling);
        bluas=(Button) findViewById(R.id.btnluas);
        thasil3=(TextView) findViewById(R.id.tvhasil3);
        thasil2=(TextView) findViewById(R.id.tvhasil2);

        bkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, bil3, hasil;
                bil1=Double.valueOf(esisi1.getText().toString().trim());
                bil2=Double.valueOf(esisi2.getText().toString().trim());
                bil3=Double.valueOf(esisi3.getText().toString().trim());
                hasil=bil1+bil2+bil3;
                String hasil1 = String.valueOf(hasil);
                thasil3.setText(hasil1);
            }
        });

        bluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(esisi3.getText().toString().trim());
                bil2=Double.valueOf(etinggi.getText().toString().trim());
                hasil=(bil1/2) * bil2;
                String hasil1 = String.valueOf(hasil);
                thasil2.setText(hasil1);
            }
        });
    }
}