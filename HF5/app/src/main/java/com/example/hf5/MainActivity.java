package com.example.hf5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter arrayAdapter;
    ListView listView;


    String szavak[]={"Vaj","Nyaloka","Ember","Valami","MZP"};
    ArrayList list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=findViewById(R.id.listview);
        arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,szavak);
        listView.setAdapter(arrayAdapter);
        this.registerForContextMenu(listView);




    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu,menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
      AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
      int itemPosition=info.position;
        TextView textView= (TextView) listView.getChildAt(itemPosition);
        switch (item.getItemId()){
            case R.id.kek:

                textView.setTextColor(Color.parseColor("#0E4DED"));

                break;
            case R.id.zold:
                textView.setTextColor(Color.parseColor("#24ED0E"));
                break;
            case R.id.piros:
                textView.setTextColor(Color.parseColor("#ED0E0E"));
                break;

        }

        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.omenu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.sort:
               list =new ArrayList(Arrays.asList(szavak));
                Collections.sort(list);
                arrayAdapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, list);
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
                break;
            case R.id.delete:
                listView.setAdapter(null);
        }
        return super.onOptionsItemSelected(item);
    }
}


