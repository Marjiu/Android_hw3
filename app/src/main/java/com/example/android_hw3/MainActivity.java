package com.example.android_hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button =(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                EditText editText =(EditText)findViewById(R.id.editText);
                double temp = Double.parseDouble(editText.getText().toString());
                double result;
                result= temp*1.8+32;
                TextView show = (TextView)findViewById(R.id.textView);
                show.setText("華氏溫度:"+nf.format(result));
            }
        });
    }
}
