package com.example.mycv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Send_mail extends AppCompatActivity {
    private EditText mEditTextTo, mEditTextSubject, mEditTextMassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);

        mEditTextTo = findViewById(R.id.edit_text_to);
        mEditTextSubject = findViewById(R.id.edit_text_subject);
        mEditTextMassage = findViewById(R.id.edit_text_message);

        Button buttonSend = findViewById(R.id.button_send);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }
    private void  sendMail(){
        String recipientList = mEditTextTo.getText().toString();
        String[] recipients = recipientList.split("nandoakbar42@gmail.com");

        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMassage.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose email client"));
    }
}
