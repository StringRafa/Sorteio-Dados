package com.panambystudios.sorteiosedados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    private ImageView imagens;
    private Button jogar;
    private RadioButton dado1, dado2, dado3, dado4;
    private RadioGroup verificaS;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                //Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        //imagens = findViewById(R.id.imageView2);
        jogar = findViewById(R.id.buttonJogar);

        //Botões dos dados a serem jogados

        dado1 = findViewById(R.id.radioButton1);
        dado2 = findViewById(R.id.radioButton2);
        dado3 = findViewById(R.id.radioButton3);
        dado4 = findViewById(R.id.radioButton4);

        verificaS = findViewById(R.id.radioGroup);

        verificaS();

        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(dado1.isChecked()){

                    Intent intent = new Intent(getApplicationContext(),MainActivity4.class);
                    startActivity(intent);

                }else if(dado2.isChecked()){
                    Intent intent = new Intent(getApplicationContext(),JogaDados2.class);
                    startActivity(intent);
                }else if(dado3.isChecked()){
                    Intent intent = new Intent(getApplicationContext(),JogaDados3.class);
                    startActivity(intent);

                }else if(dado4.isChecked()){

                    Intent intent = new Intent(getApplicationContext(),JogaDados4.class);
                    startActivity(intent);
                }

            }
        });

    }

    public void verificaS(){

        verificaS.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(i == R.id.radioButton1){
                    Toast.makeText(MainActivity3.this, "Opção de jogar 1 Dado foi selecionada.", Toast.LENGTH_SHORT).show();
                }else if(i == R.id.radioButton2){
                    Toast.makeText(MainActivity3.this, "Opção de jogar 2 Dados foi selecionada.", Toast.LENGTH_SHORT).show();
                }else if(i == R.id.radioButton3){
                    Toast.makeText(MainActivity3.this, "Opção de jogar 3 Dados foi selecionada.", Toast.LENGTH_SHORT).show();
                }else if(i == R.id.radioButton4){
                    Toast.makeText(MainActivity3.this, "Opção de jogar 4 Dados foi selecionada.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

/*
    public void jogarDado(View view) throws InterruptedException {


        int IMG = new Random().nextInt(6+1);
        Toast.makeText(MainActivity3.this, "Jogou!!!", Toast.LENGTH_SHORT).show();
        switch (IMG) {
            case 1:
                imagens.setImageResource(R.drawable.dado1);

                break;
            case 2:
                imagens.setImageResource(R.drawable.dado2);

                break;
            case 3:
                imagens.setImageResource(R.drawable.dado3);
                break;
            case 4:
                imagens.setImageResource(R.drawable.dado4);
                break;
            case 5:
                imagens.setImageResource(R.drawable.dado5);
                break;
            case 6:
                imagens.setImageResource(R.drawable.dado6);
                break;
        };

    }
*/
}