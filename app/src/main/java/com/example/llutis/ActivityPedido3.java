package com.example.llutis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPedido3 extends AppCompatActivity  {

    Comida comida;
    Bebida bebida;

    Otro otro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido3);

        comida = new Comida();
        bebida = new Bebida();
        otro = new Otro();
        getSupportFragmentManager().beginTransaction().add(R.id.comanda, comida).commit();
        Button btnComidas = (Button)findViewById(R.id.comidas);
        Button btnBebidas = (Button)findViewById(R.id.bebidas);
        Button btnOtros = (Button)findViewById(R.id.otros);

        btnComidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.comanda, comida);
                transaction.commit();
            }
        });

        btnBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.comanda, bebida);
                transaction.commit();

            }
        });
        btnOtros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.comanda, otro);
                transaction.commit();

            }
        });

    }


}
