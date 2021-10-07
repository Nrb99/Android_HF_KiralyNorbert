package com.example.hf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText sz1=findViewById(R.id.szam);
        EditText sz2=findViewById(R.id.szam2);
        TextView v=findViewById(R.id.textView);
        Button b=findViewById(R.id.button);
        Button kivonas= findViewById(R.id.button2);
        Button szorzas=findViewById(R.id.button3);
        Button osztas=findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    int szam1 = Integer.parseInt(sz1.getText().toString());
                    int szam2 = Integer.parseInt(sz2.getText().toString());
                    int eredmeny = szam1 + szam2;
                    v.setText(String.valueOf(eredmeny));
                
            }

        });
        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam1=Integer.parseInt(sz1.getText().toString());
                int szam2=Integer.parseInt(sz2.getText().toString());
                int eredmeny=szam1-szam2;
                v.setText(String.valueOf(eredmeny));
            }
        });
        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int szam1=Integer.parseInt(sz1.getText().toString());
                int szam2=Integer.parseInt(sz2.getText().toString());
                int eredmeny=szam1*szam2;
                v.setText(String.valueOf(eredmeny));
            }
        });
        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double szam1=Double.parseDouble(sz1.getText().toString());
                double szam2=Double.parseDouble(sz2.getText().toString());
                double eredmeny=szam1/szam2;
                v.setText(String.valueOf(eredmeny));
            }
        });
    }
}