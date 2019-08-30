package com.example.mycv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private CardView pendidikanCard,skillsCard,expeCard,portoCard,appCard,contactCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pendidikanCard = (CardView) findViewById(R.id.pendidikan);
        skillsCard = (CardView) findViewById(R.id.skills);
        expeCard = (CardView) findViewById(R.id.expe);
        portoCard = (CardView) findViewById(R.id.porto);
        appCard = (CardView) findViewById(R.id.app_info);
        contactCard = (CardView) findViewById(R.id.contact);

        pendidikanCard.setOnClickListener(this);
        skillsCard.setOnClickListener(this);
        expeCard.setOnClickListener(this);
        portoCard.setOnClickListener(this);
        appCard.setOnClickListener(this);
        contactCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.pendidikan : i = new Intent(this,Pendidikan.class);
            startActivity(i);
            break;

            case R.id.skills : i = new Intent(this,Skill.class);
            startActivity(i);
            break;

            case R.id.expe : i = new Intent(this,Experience.class);
                startActivity(i);
                break;

            case R.id.porto : i = new Intent(this,Portofolio.class);
                startActivity(i);
                break;

            case R.id.app_info : i = new Intent(this,Info.class);
                startActivity(i);
                break;

            case R.id.contact : i = new Intent(this,New_cont.class);
                startActivity(i);
                break;
            default:break;
        }

    }
}
