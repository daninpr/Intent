package com.daninpr.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
//    public static final String EXTRA_MESSAGE = "com.daninpr.intent.extra.MESSAGE";
    private EditText mMessageEditTextNama, mMessageEditTextAlamat, mMessageEditTextNohp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditTextNama = (EditText) findViewById(R.id.editText_nama);
        mMessageEditTextAlamat = (EditText) findViewById(R.id.editText_alamat);
        mMessageEditTextNohp= (EditText) findViewById(R.id.editText_nohp);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Registrasi");
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("message_nama", mMessageEditTextNama.getText().toString());
        intent.putExtra("message_alamat", mMessageEditTextAlamat.getText().toString());
        intent.putExtra("message_nohp", mMessageEditTextNohp.getText().toString());
        startActivity(intent);
    }
}
