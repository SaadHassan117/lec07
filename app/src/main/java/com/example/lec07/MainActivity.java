package com.example.lec07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox ch;
    TextView tx;
    TextView ab;
    Switch btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ch=findViewById(R.id.checkBox);
        //tx=findViewById(R.id.textView);
        ab=findViewById(R.id.editTextTextPersonName2);
        btn=(Switch)findViewById(R.id.switch2);
        /*ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch.isChecked())
                {
                    tx.setText("check button is enable");
                }
                else
                {
                    tx.setText("check button is disable");
                }
            }
        });*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn.isChecked())
                {
                          ab.setText("switch button is enabled");
                }
                else
                {
                    ab.setText("switch button is dissabled");
                }
            }
        });
    }
}