package com.example.vk8;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText euroInput;
    private Button usdButton, gbpButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euroInput = findViewById(R.id.EuroInput);
        usdButton = findViewById(R.id.USDButton);
        gbpButton = findViewById(R.id.GDBButton);
        resultText = findViewById(R.id.ResultText);


        usdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency(1.05, "$");
            }
        });

        gbpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency(0.83, "£");
            }
        });
    }

    private void convertCurrency(double rate, String symbol) {
        String inputText = euroInput.getText().toString();


        double euroAmount = Double.parseDouble(inputText);
        double convertedAmount = euroAmount * rate;

        resultText.setText(String.format("%s%.2f", symbol, convertedAmount));
    }
}