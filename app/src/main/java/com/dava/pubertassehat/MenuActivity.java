package com.dava.pubertassehat;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button btnScreening, btnPanduan, btnTentang, btnVideo, btnAdmin, btnKeluar, btnTidak, btnYa;

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog exitDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnScreening = findViewById(R.id.btn_screening);
        btnScreening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screening = new Intent(MenuActivity.this, ScreeningActivity.class);
                startActivity(screening);
            }
        });

        btnPanduan = findViewById(R.id.btn_panduan);
        btnPanduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panduan = new Intent(MenuActivity.this, PanduanActivity.class);
                startActivity(panduan);
            }
        });

        btnTentang = findViewById(R.id.btn_tentang);
        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panduan = new Intent(MenuActivity.this, TentangActivity.class);
                startActivity(panduan);
            }
        });

        btnVideo = findViewById(R.id.btn_video);
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video = new Intent(MenuActivity.this, VideoActivity.class);
                startActivity(video);
            }
        });

        btnAdmin = findViewById(R.id.btn_admin);
        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent database = new Intent(MenuActivity.this, AdminActivity.class);
                startActivity(database);
            }
        });
    }
}