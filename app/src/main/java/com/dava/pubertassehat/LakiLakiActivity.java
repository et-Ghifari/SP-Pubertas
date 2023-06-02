package com.dava.pubertassehat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class LakiLakiActivity extends AppCompatActivity {

    public Button btnKembali;

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_JK = "extra_jk";

    private TextView tvNama, tvUsia, tvJk;

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private List<String> list;
    private AdapterLaki adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laki_laki);

        btnKembali = findViewById(R.id.btn_kembali);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tvNama = findViewById(R.id.tv_nama);
        tvUsia = findViewById(R.id.tv_usia);
        tvJk = findViewById(R.id.tv_jk);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String age = getIntent().getStringExtra(EXTRA_AGE);
        String jk = getIntent().getStringExtra(EXTRA_JK);

        String nama = name;
        String usia = age;
        String kelamin = jk;

        tvNama.setText(nama);
        tvUsia.setText(usia);
        tvJk.setText(kelamin);

        recyclerView = findViewById(R.id.rv_gejala);
        list = new ArrayList<>();

        for (int i=1; i<=10; i++) {
            list.add("Gejala" + i);
        }

        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new AdapterLaki(this, list);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}