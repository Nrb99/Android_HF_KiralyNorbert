package com.example.activitystatesavetwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editText);
        checkBox=findViewById(R.id.checkBox);
        if(savedInstanceState!=null){
            et.setText(savedInstanceState.getString("et"));
            checkBox.setChecked((savedInstanceState.getBoolean("checkBox")));
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){

        super.onSaveInstanceState(outState);

        outState.putString("et",et.getText().toString());
        outState.putBoolean("checkBox",checkBox.isChecked());
    }
}