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

public class MainActivity4 extends AppCompatActivity {

    public int valorDado;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

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

    public void jogarDados(View view) throws InterruptedException{


        ImageView imagens = findViewById(R.id.imageView4);
        int IMG = new Random().nextInt(6);
        switch(IMG){
            case 0 :
                imagens.setImageResource(R.drawable.dado1);
                valorDado = 1;
                break;
            case 1 :
                imagens.setImageResource(R.drawable.dado2);
                valorDado = 2;
                break;
            case 2 :
                imagens.setImageResource(R.drawable.dado3);
                valorDado = 3;
                break;
            case 3 :
                imagens.setImageResource(R.drawable.dado4);
                valorDado = 4;
                break;
            case 4 :
                imagens.setImageResource(R.drawable.dado5);
                valorDado = 5;
                break;
            case 5 :
                imagens.setImageResource(R.drawable.dado6);
                valorDado = 6;
                break;
        };
        Toast.makeText(MainActivity4.this, "O valor do Dado foi: " + valorDado, Toast.LENGTH_SHORT).show();
        /*
        ImageView imagens1 = findViewById(R.id.imageView5);
        int IMG1 = new Random().nextInt(6+1);
        switch(IMG1){
            case 1 :
                imagens1.setImageResource(R.drawable.dado1);
                break;
            case 2 :
                imagens1.setImageResource(R.drawable.dado2);
                break;
            case 3 :
                imagens1.setImageResource(R.drawable.dado3);
                break;
            case 4 :
                imagens1.setImageResource(R.drawable.dado4);
                break;
            case 5 :
                imagens1.setImageResource(R.drawable.dado5);
                break;
            case 6 :
                imagens1.setImageResource(R.drawable.dado6);
                break;
        };
*/
        //int total = IMG + IMG1;
        //Toast.makeText(MainActivity4.this, "O valor total dos dados é: " + total, Toast.LENGTH_LONG).show();


    }

}