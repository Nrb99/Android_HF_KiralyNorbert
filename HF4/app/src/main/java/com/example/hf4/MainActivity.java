package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray={"EUR","USD","GBP","AUS","CAD","CHF","DKK","HUF"};
    String[] currencies={"Euro","American dollar","Pound",
            "Australian dollar","Canadian dollar","Franc elvetian",
            "Dane crown","Hungarian Forint"};
    Integer[] images={R.drawable.ic_list_eu,
            R.drawable.ic_list_us,
            R.drawable.ic_list_uk,
            R.drawable.ic_list_au,
            R.drawable.ic_list_ca,
            R.drawable.ic_list_ch,
            R.drawable.ic_list_dk,
            R.drawable.ic_list_hu};
    Double[] buyingPrices={4.41,3.97,6.12,2.96,3.09,4.23,0.58,0.0136};
    Double[] sellingPrices={4.55,4.14,6.355,3.06,3.26,4.33,0.61,0.0146};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomListAdapter adapter=new CustomListAdapter(this,nameArray,currencies,
                images,sellingPrices,buyingPrices);
        final ListView list=findViewById(R.id.lista);
        list.setAdapter(adapter);

        TextView textView1=findViewById(R.id.textView2);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                view=adapterView.getChildAt(i);
                view.findViewById(R.id.vetelar).setVisibility(View.VISIBLE);
                view.findViewById(R.id.textView2).setVisibility(View.VISIBLE);
            }
        });



    }
}