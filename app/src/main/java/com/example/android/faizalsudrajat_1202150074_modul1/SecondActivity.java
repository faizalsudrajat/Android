package com.example.android.faizalsudrajat_1202150074_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tempatmakan, menumakan, porsimakan, hargamakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String HasilTempat = intent.getStringExtra("tempat");
        String Menu = intent.getStringExtra("menu");
        String Porsi = intent.getStringExtra("porsi");
        String Harga = intent.getStringExtra("harga");

        int Total = Integer.valueOf(Harga) * Integer.valueOf(Porsi);

        tempatmakan = (TextView) findViewById(R.id.cafe);
        tempatmakan.setText(HasilTempat);

        menumakan = (TextView) findViewById(R.id.menumakanan);
        menumakan.setText(Menu);

        porsimakan = (TextView) findViewById(R.id.porsimakanan);
        porsimakan.setText(Porsi);

        hargamakan = (TextView) findViewById(R.id.hargamakanan);
        hargamakan.setText(String.valueOf(Total));

        if (Total > 65000) {
            Toast notif= Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            notif.show();

        } else {

            Toast notif= Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            notif.show();

        }
    }
}