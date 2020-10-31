package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button persegii, segitigaa, lingkarann;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persegii=findViewById(R.id.persegii);
        persegii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this.getApplicationContext(), persegi.class);
                MainActivity.this.startActivity(intent);
            }
        });

        segitigaa=findViewById(R.id.segitigaa);
        segitigaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this.getApplicationContext(), segitiga.class);
                MainActivity.this.startActivity(intent);
            }
        });

        lingkarann=findViewById(R.id.lingkarann);
        lingkarann.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this.getApplicationContext(), lingkaran.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}