package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editTextNum;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = findViewById(R.id.button);
        textView   = findViewById(R.id.textView);
        textView2   = findViewById(R.id.textView2);
        textView3   = findViewById(R.id.textView3);
        editTextNum = findViewById(R.id.editTextNum);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Successfully convert", Toast.LENGTH_SHORT).show();
               String A= editTextNum.getText().toString();
               Double Cel = Double.parseDouble(A);
               Double far = (Cel * 9/5) + 32;
               textView.setText("The Fahrenheit value is " + far+"°F");
            }
        });
        
    }
}