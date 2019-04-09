package com.daninpr.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String nama, alamat, nohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView text_message = (TextView) findViewById(R.id.text_message);
        Intent intent = getIntent();
        nama = intent.getStringExtra("message_nama");
        alamat = intent.getStringExtra("message_alamat");
        nohp = intent.getStringExtra("message_nohp");

        text_message.setText(String.format("Nama Anda : %s\nAlamat Anda : %s\nNo Telepon : %s", nama, alamat, nohp));
    }

    public void launch_share(View view) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Nama Anda : "+nama+ " Alamat Anda : "+alamat+ " No Telo : "+nohp);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
