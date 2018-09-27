package com.example.shashu.calculator;

import android.widget.Button;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
private Button btnOpenCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenCalculator=findViewById(R.id.btnCalculator);
        btnOpenCalculator.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent intent=new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
