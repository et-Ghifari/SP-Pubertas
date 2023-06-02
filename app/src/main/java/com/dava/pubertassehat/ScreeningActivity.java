package com.dava.pubertassehat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ScreeningActivity extends AppCompatActivity {

    public Button btnKembali;
    private Button btnLakiLaki, btnPerempuan;
    private EditText etNama, etUsia;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screening);

        etNama = findViewById(R.id.et_nama);
        etUsia = findViewById(R.id.et_umur);

        btnKembali = findViewById(R.id.btn_kembali);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnLakiLaki = findViewById(R.id.btn_laki);
        btnLakiLaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString().trim();
                String usia = etUsia.getText().toString().trim();

                if (nama.isEmpty()) {
                    etNama.setError("Masukan Nama Lengkap Anda!");
                } else if (usia.isEmpty()) {
                    etUsia.setError("Masukan Usia Anda!");
                } else {
                    ScreeningLaki();
                }
            }
        });

        btnPerempuan = findViewById(R.id.btn_perempuan);
        btnPerempuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString().trim();
                String usia = etUsia.getText().toString().trim();

                if (nama.isEmpty()) {
                    etNama.setError("Masukan Nama Lengkap Anda!");
                } else if (usia.isEmpty()) {
                    etUsia.setError("Masukan Usia Anda!");
                } else {
                    ScreeningPerempuan();
                }
            }
        });
    }

    private void ScreeningLaki () {
        final String nama = this.etNama.getText().toString().trim();
        final String usia = this.etUsia.getText().toString().trim();

        Intent laki = new Intent(ScreeningActivity.this, LakiLakiActivity.class);

        laki.putExtra(LakiLakiActivity.EXTRA_NAME, nama);
        laki.putExtra(LakiLakiActivity.EXTRA_AGE, usia);
        laki.putExtra(LakiLakiActivity.EXTRA_JK, "Laki - Laki");
        startActivity(laki);
    }

    private void ScreeningPerempuan () {
        final String nama = this.etNama.getText().toString().trim();
        final String usia = this.etUsia.getText().toString().trim();

        Intent perempuan = new Intent(ScreeningActivity.this, PerempuanActivity.class);

        perempuan.putExtra(PerempuanActivity.EXTRA_NAME, nama);
        perempuan.putExtra(PerempuanActivity.EXTRA_AGE, usia);
        perempuan.putExtra(PerempuanActivity.EXTRA_JK, "Perempuan");
        startActivity(perempuan);
    }
}