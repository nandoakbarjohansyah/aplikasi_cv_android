package com.example.mycv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Kontak extends AppCompatActivity implements View.OnClickListener {
private CardView wa, gmail, insta, telegram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
        wa = (CardView) findViewById(R.id.wa);
        gmail = (CardView) findViewById(R.id.gmail);
        insta = (CardView) findViewById(R.id.insta);

        wa.setOnClickListener(this);
        gmail.setOnClickListener(this);
        insta.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.wa:
            Intent i = new Intent(this, New_telp.class);
            startActivity(i);
            break;

            case R.id.gmail:
                Intent j = new Intent(this, Send_mail.class);
                startActivity(j);
                break;

            case R.id.insta:
                Intent k = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/nandopqrstu/"));
                startActivity(k);
                break;


        }

    }
}
