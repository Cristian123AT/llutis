package com.example.llutis;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityPedido extends AppCompatActivity {

    private Button maschicharroncamaron;
    private Button menosChicharronCamaron;
    private Button maschupedecamaron;
    private Button menoschupedecamaron;
    private Button massudadodecamaron;
    private Button menossudadodecamaron;
    private Button mascaldodecamaron;
    private Button menoscaldodecamaron;
    private Button masarrozconpato;
    private Button menosarrozconpato;
    private Button maspatoalvino;
    private Button menospatoalvino;
    private Button mascuychactado;
    private Button menoscuychactado;
    private Button maspepiandecuy;
    private Button menospepiandecuy;
    private Button maschicharrondechancho;
    private Button menoschicharrondechancho;

    private Button maschuletadechancho;
    private Button menoschuletadechancho;
    private Button masparrillada;
    private Button menosparrillada;
    private Button mastriple;
    private Button menostriple;
    private Button maschicharrondepollo;
    private Button menoschicharrondepollo;
    private Button maspolloalaplancha;
    private Button menospolloalaplancha;
    private Button masmilanesadepollo;
    private Button menosmilanesadepollo;

    private TextView textViewChicharrondecamaron;
    private TextView textviewchupecamaron;
    private TextView textviewsudadocamaron;
    private TextView textviewcaldodecamaron;
    private TextView textviewarrozconpato;
    private TextView textviewpatoalvino;
    private TextView textviewcuychactado;
    private TextView textviewpepiandecuy;
    private TextView textviewchicharrondechancho;
    private TextView textviewchuletadechancho;
    private TextView textviewparrilada;
    private TextView textviewtriple;
    private TextView textviewchicharrondepollo;
    private TextView textviewpolloalaplancha;
    private TextView textviewmilanesadepollo;
    private TextView numMesa;




    private int numChicharronCamaron = 0;
    private int numchupedecamaron = 0;
    private int numsudadocamaron = 0;
    private int numcaldodecamaron = 0;
    private int numarrozconpato = 0;
    private int numpatoalvino = 0;
    private int numcuychactado = 0;
    private int numpepiandecuy = 0;
    private int numchicharrondechancho = 0;
    private int numchuletadechancho = 0;
    private int numparrilada = 0;
    private int numtriple = 0;
    private int numchicharrondepollo = 0;
    private int numpolloalaplancha = 0;
    private int nummilanesadepollo  = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        final String mesa = getIntent().getStringExtra("Mesa");

        this.setTitle(mesa);
        numMesa = (TextView)findViewById(R.id.mesa);
        numMesa.setText(mesa);
        maschicharroncamaron = (Button)findViewById(R.id.maschicharroncamaron);
        textViewChicharrondecamaron = (TextView)findViewById(R.id.numchicharroncamaron);
        textViewChicharrondecamaron.setText(""+0);
        menosChicharronCamaron = (Button)findViewById(R.id.menoschicharroncamaron);



        maschicharroncamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numChicharronCamaron++;
                textViewChicharrondecamaron.setText(String.valueOf(numChicharronCamaron));
            }
        });
        menosChicharronCamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numChicharronCamaron >0){
                    numChicharronCamaron--;
                    textViewChicharrondecamaron.setText(String.valueOf(numChicharronCamaron));
                }

            }
        });



        maschupedecamaron = (Button)findViewById(R.id.maschupecamaron);
        textviewchupecamaron = (TextView)findViewById(R.id.numchupecamaron);
        textviewchupecamaron.setText(""+0);
        menoschupedecamaron = (Button)findViewById(R.id.menoschupecamaron);



        maschupedecamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numchupedecamaron++;
                textviewchupecamaron.setText(String.valueOf(numchupedecamaron));
            }
        });
        menoschupedecamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numchupedecamaron >0){
                    numchupedecamaron--;
                    textviewchupecamaron.setText(String.valueOf(numchupedecamaron));
                }

            }
        });


        massudadodecamaron = (Button)findViewById(R.id.massudadocamaron);
        textviewsudadocamaron = (TextView)findViewById(R.id.numsudadocamaron);
        textviewsudadocamaron.setText(""+0);
        menossudadodecamaron = (Button)findViewById(R.id.menossudadocamaron);



        massudadodecamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numsudadocamaron++;
                textviewsudadocamaron.setText(String.valueOf(numsudadocamaron));
            }
        });
        menossudadodecamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numsudadocamaron >0){
                    numsudadocamaron--;
                    textviewsudadocamaron.setText(String.valueOf(numsudadocamaron));
                }

            }
        });






        mascaldodecamaron = (Button)findViewById(R.id.mascaldocamaron);
        textviewcaldodecamaron = (TextView)findViewById(R.id.numcaldocamaron);
        textviewcaldodecamaron.setText(""+0);
        menoscaldodecamaron = (Button)findViewById(R.id.menoscaldocamaron);



        mascaldodecamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numcaldodecamaron++;
                textviewcaldodecamaron.setText(String.valueOf(numcaldodecamaron));
            }
        });
        menoscaldodecamaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numcaldodecamaron >0){
                    numcaldodecamaron--;
                    textviewcaldodecamaron.setText(String.valueOf(numcaldodecamaron));
                }

            }
        });






        masarrozconpato = (Button)findViewById(R.id.masarrozconpato);
        textviewarrozconpato = (TextView)findViewById(R.id.numarrozconpato);
        textviewarrozconpato.setText(""+0);
        menosarrozconpato = (Button)findViewById(R.id.menosarrozconpato);



        masarrozconpato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numarrozconpato++;
                textviewarrozconpato.setText(String.valueOf(numarrozconpato));
            }
        });
        menosarrozconpato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numarrozconpato >0){
                    numarrozconpato--;
                    textviewarrozconpato.setText(String.valueOf(numarrozconpato));
                }

            }
        });





        maspatoalvino = (Button)findViewById(R.id.maspatoalvino);
        textviewpatoalvino = (TextView)findViewById(R.id.numpatoalvino);
        textviewpatoalvino.setText(""+0);
        menospatoalvino = (Button)findViewById(R.id.menospatoalvino);



        maspatoalvino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numpatoalvino++;
                textviewpatoalvino.setText(String.valueOf(numpatoalvino));
            }
        });
        menospatoalvino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numpatoalvino >0){
                    numpatoalvino--;
                    textviewpatoalvino.setText(String.valueOf(numpatoalvino));
                }

            }
        });




        mascuychactado = (Button)findViewById(R.id.mascuychactado);
        textviewcuychactado = (TextView)findViewById(R.id.numcuychatado);
        textviewcuychactado.setText(""+0);
        menoscuychactado = (Button)findViewById(R.id.menoscuychactado);



        mascuychactado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numcuychactado++;
                textviewcuychactado.setText(String.valueOf(numcuychactado));
            }
        });
        menoscuychactado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numcuychactado >0){
                    numcuychactado--;
                    textviewcuychactado.setText(String.valueOf(numcuychactado));
                }

            }
        });


        maspepiandecuy = (Button)findViewById(R.id.maspepiandecuy);
        textviewpepiandecuy = (TextView)findViewById(R.id.numpepiandecuy);
        textviewpepiandecuy.setText(""+0);
        menospepiandecuy = (Button)findViewById(R.id.menospepiandecuy);



        maspepiandecuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numpepiandecuy++;
                textviewpepiandecuy.setText(String.valueOf(numpepiandecuy));
            }
        });
        menospepiandecuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numpepiandecuy >0){
                    numpepiandecuy--;
                    textviewpepiandecuy.setText(String.valueOf(numpepiandecuy));
                }

            }
        });

        maschicharrondechancho = (Button)findViewById(R.id.maschicharrondechancho);
        textviewchicharrondechancho = (TextView)findViewById(R.id.numchicharrondechancho);
        textviewchicharrondechancho.setText(""+0);
        menoschicharrondechancho = (Button)findViewById(R.id.menoschicharrondechancho);



        maschicharrondechancho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numchicharrondechancho++;
                textviewchicharrondechancho.setText(String.valueOf(numchicharrondechancho));
            }
        });
        menoschicharrondechancho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numchicharrondechancho >0){
                    numchicharrondechancho--;
                    textviewchicharrondechancho.setText(String.valueOf(numchicharrondechancho));
                }

            }
        });





        maschuletadechancho = (Button)findViewById(R.id.maschuletadechancho);
        textviewchuletadechancho = (TextView)findViewById(R.id.numchuletadechancho);
        textviewchuletadechancho.setText(""+0);
        menoschuletadechancho = (Button)findViewById(R.id.menoschuletadechancho);



        maschuletadechancho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numchuletadechancho++;
                textviewchuletadechancho.setText(String.valueOf(numchuletadechancho));
            }
        });
        menoschuletadechancho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numchuletadechancho >0){
                    numchuletadechancho--;
                    textviewchuletadechancho.setText(String.valueOf(numchuletadechancho));
                }

            }
        });


        masparrillada = (Button)findViewById(R.id.masparrillada);
        textviewparrilada = (TextView)findViewById(R.id.numparrillada);
        textviewparrilada.setText(""+0);
        menosparrillada = (Button)findViewById(R.id.menosparrillada);



        masparrillada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numparrilada++;
                textviewparrilada.setText(String.valueOf(numparrilada));
            }
        });
        menosparrillada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numparrilada >0){
                    numparrilada--;
                    textviewparrilada.setText(String.valueOf(numparrilada));
                }

            }
        });

        mastriple = (Button)findViewById(R.id.mastriple);
        textviewtriple = (TextView)findViewById(R.id.numtriple);
        textviewtriple.setText(""+0);
        menostriple = (Button)findViewById(R.id.menostriple);



        mastriple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numtriple++;
                textviewtriple.setText(String.valueOf(numtriple));
            }
        });
        menostriple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numtriple >0){
                    numtriple--;
                    textviewtriple.setText(String.valueOf(numtriple));
                }

            }
        });




        maschicharrondepollo = (Button)findViewById(R.id.maschicharrondepollo);
        textviewchicharrondepollo = (TextView)findViewById(R.id.numchicharrondepollo);
        textviewchicharrondepollo.setText(""+0);
        menoschicharrondepollo = (Button)findViewById(R.id.menoschicharrondepollo);



        maschicharrondepollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numchicharrondepollo++;
                textviewchicharrondepollo.setText(String.valueOf(numchicharrondepollo));
            }
        });
        menoschicharrondepollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numchicharrondepollo >0){
                    numchicharrondepollo--;
                    textviewchicharrondepollo.setText(String.valueOf(numchicharrondepollo));
                }

            }
        });



        maspolloalaplancha = (Button)findViewById(R.id.maspolloalaplancha);
        textviewpolloalaplancha= (TextView)findViewById(R.id.numpolloalaplancha);
        textviewpolloalaplancha.setText(""+0);
        menospolloalaplancha = (Button)findViewById(R.id.menospolloalaplancha);



        maspolloalaplancha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 numpolloalaplancha++;
                textviewpolloalaplancha.setText(String.valueOf(numpolloalaplancha));
            }
        });
        menospolloalaplancha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numpolloalaplancha >0){
                    numpolloalaplancha--;
                    textviewpolloalaplancha.setText(String.valueOf(numpolloalaplancha));
                }

            }
        });

        masmilanesadepollo = (Button)findViewById(R.id.masmilanesadepollo);
        textviewmilanesadepollo= (TextView)findViewById(R.id.nummilanesadepollo);
        textviewmilanesadepollo.setText(""+0);
        menosmilanesadepollo = (Button)findViewById(R.id.menosmilanesadepollo);



        masmilanesadepollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nummilanesadepollo++;
                textviewmilanesadepollo.setText(String.valueOf(nummilanesadepollo));
            }
        });
        menosmilanesadepollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nummilanesadepollo >0){
                    nummilanesadepollo--;
                    textviewmilanesadepollo.setText(String.valueOf(nummilanesadepollo));
                }

            }
        });





















    }

}
