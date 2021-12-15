package com.example.hf3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    ArrayList<String> productList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,productList);
        EditText code=findViewById(R.id.productCode);
        EditText name=findViewById(R.id.productName);
        EditText price=findViewById(R.id.productPrice);
        Button add=findViewById(R.id.button2);
        Button removecells=findViewById(R.id.button);
        Button tolist=findViewById(R.id.button3);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int code1=Integer.parseInt(code.getText().toString());
                String name1=name.getText().toString();
                double price1=Double.parseDouble(price.getText().toString());
                Product product=new Product(code1,name1,price1);
                productList.add(product.toString());

            }
        });
        removecells.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code.getText().clear();
                name.getText().clear();
                price.getText().clear();
            }
        });
        tolist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                listView=findViewById(R.id.viewlist);

                listView.setAdapter(arrayAdapter);
            }
        });



    }
}