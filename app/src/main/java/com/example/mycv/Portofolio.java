package com.example.mycv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Portofolio extends AppCompatActivity implements View.OnClickListener {
    private CardView andro, andro2, web, web2, web3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portofolio);

        andro = (CardView) findViewById(R.id.andro);
        andro2 = (CardView) findViewById(R.id.andro2);
        web =  (CardView) findViewById(R.id.web);
        web2 = (CardView) findViewById(R.id.web2);
        web3 = (CardView) findViewById(R.id.web3);

        andro.setOnClickListener(this);
        andro2.setOnClickListener(this);
        web.setOnClickListener(this);
        web2.setOnClickListener(this);
        web3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.andro:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nandoakbarjohansyah/aplikasi_bangunDatar"));
                startActivity(i);
                break;

            case R.id.andro2:
                Intent j = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nandoakbarjohansyah/aplikasi_cv_android"));
                startActivity(j);
                break;

            case R.id.web:
                Intent k = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nandoakbarjohansyah/crud_ci"));
                startActivity(k);
                break;

            case R.id.web2:
                Intent l = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nandoakbarjohansyah/berita"));
                startActivity(l);
                break;

            case R.id.web3:
                Intent m = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/nandoakbarjohansyah/projek_laravel"));
                startActivity(m);
                break;


        }

    }
}
