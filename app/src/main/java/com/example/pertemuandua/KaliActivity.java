package com.example.pertemuandua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KaliActivity extends AppCompatActivity {

    private Button btnKalian;
    private TextView tvKali;
    private EditText etNum1;
    private EditText etNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kali);

        btnKalian = findViewById(R.id.btnKalian);
        tvKali = findViewById(R.id.tvKali);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);

        btnKalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sNum1 = etNum1.getText().toString();
                    String sNum2 = etNum2.getText().toString();

                    double Num1 = Double.parseDouble(sNum1);
                    double Num2 = Double.parseDouble(sNum2);

                    double result = Num1*Num2;
                    String res = Double.toString(result);

                    tvKali.setText(res);

                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Ksoong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
