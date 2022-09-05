package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button showT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = findViewById(R.id.checkBox);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);
        cb4 = findViewById(R.id.checkBox4);
        cb5 = findViewById(R.id.checkBox5);
    }


    public void showt_clicked(View view) {
        StringBuffer res=new StringBuffer();
        res.append("Topping:");

        if (cb1.isChecked()){res.append(" " +cb1.getText().toString());}
        if (cb2.isChecked()){res.append(" "+cb2.getText().toString());}
        if (cb3.isChecked()){res.append(" "+cb3.getText().toString());}
        if (cb4.isChecked()){res.append(" "+cb4.getText().toString());}
        if (cb5.isChecked()){res.append(" "+cb5.getText().toString());}
        if (!cb1.isChecked()&!cb2.isChecked()&!cb3.isChecked()&!cb4.isChecked()&!cb5.isChecked()){res.append(" None");}

        Toast.makeText(getApplicationContext(), res,
                Toast.LENGTH_SHORT).show();


    }


}