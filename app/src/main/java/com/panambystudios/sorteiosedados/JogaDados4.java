package com.panambystudios.sorteiosedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Random;

public class JogaDados4 extends AppCompatActivity {

    public int valorDado1, valorDado2, valorDado3, valorDado4;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joga_dados4);

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

    public void jogarDados(View view) throws InterruptedException {


        ImageView imagens = findViewById(R.id.imageView11);
        int IMG = new Random().nextInt(6);

        switch (IMG) {
            case 0:
                imagens.setImageResource(R.drawable.dado1);
                valorDado1 = 1;
                break;
            case 1:
                imagens.setImageResource(R.drawable.dado2);
                valorDado1 = 2;
                break;
            case 2:
                imagens.setImageResource(R.drawable.dado3);
                valorDado1 = 3;
                break;
            case 3:
                imagens.setImageResource(R.drawable.dado4);
                valorDado1 = 4;
                break;
            case 4:
                imagens.setImageResource(R.drawable.dado5);
                valorDado1 = 5;
                break;
            case 5:
                imagens.setImageResource(R.drawable.dado6);
                valorDado1 = 6;
                break;
        };



        ImageView imagens1 = findViewById(R.id.imageView12);
        int IMG1 = new Random().nextInt(6);
        switch (IMG1) {
            case 0:
                imagens1.setImageResource(R.drawable.dado1);
                valorDado2 = 1;
                break;
            case 1:
                imagens1.setImageResource(R.drawable.dado2);
                valorDado2 = 2;
                break;
            case 2:
                imagens1.setImageResource(R.drawable.dado3);
                valorDado2 = 3;
                break;
            case 3:
                imagens1.setImageResource(R.drawable.dado4);
                valorDado2 = 4;
                break;
            case 4:
                imagens1.setImageResource(R.drawable.dado5);
                valorDado2 = 5;
                break;
            case 5:
                imagens1.setImageResource(R.drawable.dado6);
                valorDado2 = 6;
                break;
        };
        ImageView imagens2 = findViewById(R.id.imageView13);
        int IMG2 = new Random().nextInt(6);
        switch (IMG2) {
            case 0:
                imagens2.setImageResource(R.drawable.dado1);
                valorDado3 = 1;
                break;
            case 1:
                imagens2.setImageResource(R.drawable.dado2);
                valorDado3 = 2;
                break;
            case 2:
                imagens2.setImageResource(R.drawable.dado3);
                valorDado3 = 3;
                break;
            case 3:
                imagens2.setImageResource(R.drawable.dado4);
                valorDado3 = 4;
                break;
            case 4:
                imagens2.setImageResource(R.drawable.dado5);
                valorDado3 = 5;
                break;
            case 5:
                imagens2.setImageResource(R.drawable.dado6);
                valorDado3 = 6;
                break;
        };
        ImageView imagens3 = findViewById(R.id.imageView14);
        int IMG3 = new Random().nextInt(6);
        switch (IMG3) {
            case 0:
                imagens3.setImageResource(R.drawable.dado1);
                valorDado4 = 1;
                break;
            case 1:
                imagens3.setImageResource(R.drawable.dado2);
                valorDado4 = 2;
                break;
            case 2:
                imagens3.setImageResource(R.drawable.dado3);
                valorDado4 = 3;
                break;
            case 3:
                imagens3.setImageResource(R.drawable.dado4);
                valorDado4 = 4;
                break;
            case 4:
                imagens3.setImageResource(R.drawable.dado5);
                valorDado4 = 5;
                break;
            case 5:
                imagens3.setImageResource(R.drawable.dado6);
                valorDado4 = 6;
                break;
        };
        int total = valorDado1 + valorDado2 + valorDado3 + valorDado4;
        Toast.makeText(JogaDados4.this, "O valor total dos Dados: " + total, Toast.LENGTH_SHORT).show();
    }
}