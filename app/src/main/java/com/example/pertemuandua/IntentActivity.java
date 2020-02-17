package com.example.pertemuandua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class IntentActivity extends AppCompatActivity {

    private TextView tvText;
    private Button btnKali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        tvText = findViewById(R.id.tvText);
        btnKali = findViewById(R.id.btnKali);
        String Text = getIntent().getStringExtra("Text");
        String value = "Hi, "+ Text +"!";

        tvText.setText(value);

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent kali = new Intent(IntentActivity.this, KaliActivity.class);
                    startActivity(kali);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
