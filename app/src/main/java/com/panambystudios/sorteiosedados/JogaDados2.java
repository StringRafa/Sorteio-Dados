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

public class JogaDados2 extends AppCompatActivity {

    public int valorDado1, valorDado2;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joga_dados2);

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


        ImageView imagens = findViewById(R.id.imageView2);
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



        ImageView imagens1 = findViewById(R.id.imageView3);
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
        int total = valorDado1 + valorDado2;
        Toast.makeText(JogaDados2.this, "O valor total dos Dados: " + total, Toast.LENGTH_SHORT).show();
    }
}