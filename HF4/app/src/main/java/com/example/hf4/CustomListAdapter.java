package com.example.hf4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.zip.Inflater;

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;
    LayoutInflater inflater;


    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] currencies;

    private final Double[] sellingPrices;

    private final Double[] buyingPrices;



    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] currencies, Integer[] imageIDArrayParam,Double[] sellingPrices,Double[] buyingPrices){

        super(context, R.layout.list_row, nameArrayParam);
        this.context=context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.currencies = currencies;
        this.buyingPrices=buyingPrices;
        this.sellingPrices=sellingPrices;



    }




    public View getView(int position, View view, ViewGroup parent) {

        //ToDo
        LayoutInflater inflater=context.getLayoutInflater();
        view = inflater.inflate(R.layout.list_row, null);
        ImageView flag=view.findViewById(R.id.zaszlo);
        TextView names=view.findViewById(R.id.penz);
        TextView penznem=view.findViewById(R.id.textView2);
        TextView buying=view.findViewById(R.id.vetelar);
        TextView selling=view.findViewById(R.id.eladasiar);

        flag.setImageResource(imageIDarray[position]);
        names.setText(nameArray[position]);
        penznem.setText(currencies[position]);
        buying.setText(buyingPrices[position].toString());
        selling.setText(sellingPrices[position].toString());





        return view;

    }
}