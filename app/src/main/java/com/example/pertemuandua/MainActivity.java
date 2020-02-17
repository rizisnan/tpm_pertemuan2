package com.example.pertemuandua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.FormatException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etText;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = findViewById(R.id.btnSend);
        etText = findViewById(R.id.etText);

        btnSend.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String sText = etText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, IntentActivity.class);
                    intent.putExtra("Text", sText);
                    startActivity(intent);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Ksoong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
