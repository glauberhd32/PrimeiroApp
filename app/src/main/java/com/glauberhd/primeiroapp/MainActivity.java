package com.glauberhd.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botaoclique;
    private TextView textoVisual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void alterarTexto(View view){
        textoVisual =(findViewById(R.id.txtView));
        textoVisual.setText("Glauco");

    }
}
