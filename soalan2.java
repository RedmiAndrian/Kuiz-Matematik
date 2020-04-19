package com.example.kuizmatematik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class soalan2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soalan2);

        Button btn = (Button)findViewById(R.id.button4);
        btn.setOnClickListener (new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(getApplicationContext(), "Jawapan anda salah. Cuba lagi", Toast.LENGTH_SHORT).show();
                                    }
                                });

         Button btn1 = (Button)findViewById(R.id.button5);
         btn1.setOnClickListener (new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(getApplicationContext(), "Tahniah! jawapan yang betul", Toast.LENGTH_SHORT).show();
                 startActivity(new Intent(soalan2.this, tamat.class));

             }
            });
    }
}
