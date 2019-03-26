package com.example.hrido.mainproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Send_Email extends AppCompatActivity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send__email);

        editText = findViewById(R.id.massageET);
        textView = findViewById(R.id.SendBtn);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMsg();
            }
        });

    }

    public void sendMsg() {
        String message= editText.getText().toString();

        Intent intent=null, choooser=null;

            intent=new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[]to={"apostelecom@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_TEXT,message);

            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Choose An email clint"));

    }

}
