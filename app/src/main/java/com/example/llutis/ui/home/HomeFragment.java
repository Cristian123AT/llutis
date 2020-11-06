package com.example.llutis.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.llutis.Comanda;
import com.example.llutis.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Button UNOA;
    private Button DOSA;
    private Button TRESA;
    private Button CUATROA;
    private Button CINCOA;
    private Button SEISA;
    private Button SIETEA;
    private Button OCHOA;
    private Button NUEVEA;
    private Button DIEZA;
    private Button ONCEA;
    private Button DOCEA;
    private Button TRECEA;
    private Button CATORCEA;
    private Button UNOB;
    private Button DOSB;
    private Button TRESB;
    private Button CUATROB;
    private Button CINCOB;
    private Button SEISB;
    private Button SIETEB;
    private Button OCHOB;
    private Button NUEVEB;
    private Button DIEZB;
    private Button ONCEB;
    private Button DOCEB;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
        //homeViewModel.getText().observe(this, new Observer<String>() {
        //    @Override
        //    public void onChanged(@Nullable String s) {
        //        textView.setText(s);
        //    }
        //});
        UNOA = root.findViewById(R.id.unoA);
        UNOA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",UNOA.getText().toString());
                startActivity(intent);
            }
        });
        UNOB = root.findViewById(R.id.unoB);
        UNOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",UNOB.getText().toString());
                startActivity(intent);
            }
        });
        DOSA = root.findViewById(R.id.dosA);
        DOSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",DOSA.getText().toString());
                startActivity(intent);
            }
        });
        DOSB = root.findViewById(R.id.dosB);
        DOSB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",DOSB.getText().toString());
                startActivity(intent);
            }
        });
        TRESA = root.findViewById(R.id.tresA);
        TRESA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",TRESA.getText().toString());
                startActivity(intent);
            }
        });
        TRESB = root.findViewById(R.id.tresB);
        TRESB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",TRESB.getText().toString());
                startActivity(intent);
            }
        });
        CUATROA = root.findViewById(R.id.cuatroA);
        CUATROA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",CUATROA.getText().toString());
                startActivity(intent);
            }
        });
        CUATROB = root.findViewById(R.id.cuatroB);
        CUATROB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",CUATROB.getText().toString());
                startActivity(intent);
            }
        });
        CINCOA = root.findViewById(R.id.cincoA);
        CINCOA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",CINCOA.getText().toString());
                startActivity(intent);
            }
        });
        CINCOB = root.findViewById(R.id.cincoB);
        CINCOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",CINCOB.getText().toString());
                startActivity(intent);
            }
        });
        SEISA = root.findViewById(R.id.seisA);
        SEISA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",SEISA.getText().toString());
                startActivity(intent);
            }
        });
        SEISB = root.findViewById(R.id.seisB);
        SEISB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",SEISB.getText().toString());
                startActivity(intent);
            }
        });
        SIETEA = root.findViewById(R.id.sieteA);
        SIETEA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",SIETEA.getText().toString());
                startActivity(intent);
            }
        });
        SIETEB = root.findViewById(R.id.sieteB);
        SIETEB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",SIETEB.getText().toString());
                startActivity(intent);
            }
        });
        OCHOA = root.findViewById(R.id.ochoA);
        OCHOA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",OCHOA.getText().toString());
                startActivity(intent);
            }
        });
        OCHOB = root.findViewById(R.id.ochoB);
        OCHOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",OCHOB.getText().toString());
                startActivity(intent);
            }
        });
        NUEVEA = root.findViewById(R.id.nueveA);
        NUEVEA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",NUEVEA.getText().toString());
                startActivity(intent);
            }
        });
        NUEVEB = root.findViewById(R.id.nueveB);
        NUEVEB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",NUEVEB.getText().toString());
                startActivity(intent);
            }
        });
        DIEZA = root.findViewById(R.id.diezA);
        DIEZA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",DIEZA.getText().toString());
                startActivity(intent);
            }
        });
        DIEZB = root.findViewById(R.id.diezB);
        DIEZB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",DIEZB.getText().toString());
                startActivity(intent);
            }
        });
        ONCEA = root.findViewById(R.id.onceA);
        ONCEA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",ONCEA.getText().toString());
                startActivity(intent);
            }
        });
        ONCEB = root.findViewById(R.id.onceB);
        ONCEB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",ONCEB.getText().toString());
                startActivity(intent);
            }
        });
        DOCEA = root.findViewById(R.id.doceA);
        DOCEA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",DOCEA.getText().toString());
                startActivity(intent);
            }
        });
        DOCEB = root.findViewById(R.id.doceB);
        DOCEB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",DOCEB.getText().toString());
                startActivity(intent);
            }
        });
        TRECEA = root.findViewById(R.id.treceA);
        TRECEA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",TRECEA.getText().toString());
                startActivity(intent);
            }
        });
        CATORCEA = root.findViewById(R.id.catorceA);
        CATORCEA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Comanda.class);
                intent.putExtra("Mesa",CATORCEA.getText().toString());
                startActivity(intent);
            }
        });
        return root;
    }
}