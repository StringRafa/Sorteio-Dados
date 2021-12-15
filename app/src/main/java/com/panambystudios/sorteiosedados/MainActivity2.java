package com.panambystudios.sorteiosedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private int valorFinal;
    private int valorInicial;
    private int numero;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }



    public void ChangeText(View view) throws InterruptedException {

        TextView resultado = findViewById(R.id.numeroSorteado);
        EditText editValorFinal = findViewById(R.id.editTextNumber2);
        EditText editValorInicial = findViewById(R.id.editTextNumber);

        valorFinal = Integer.parseInt(editValorFinal.getText().toString());
        valorInicial = Integer.parseInt(editValorInicial.getText().toString());


        if (valorFinal > valorInicial){
            numero = new Random().nextInt(valorFinal+1 - valorInicial) + valorInicial;
            resultado.setText(""+numero);
            Toast.makeText(MainActivity2.this, "O número sorteado foi: " + numero, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity2.this, "O valor Final deve ser maior que o valor Inicial", Toast.LENGTH_LONG).show();
        }

    }

}