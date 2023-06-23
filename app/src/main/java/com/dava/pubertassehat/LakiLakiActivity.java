package com.dava.pubertassehat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LakiLakiActivity extends AppCompatActivity {

    public Button btnKembali;
    private Button btnSelanjutnya, btngy01, btngn01, btngy02, btngn02, btngy03, btngn03, btngy04, btngn04, btngy05, btngn05, btngy06, btngn06, btngy07, btngn07, btngy08, btngn08, btngy09, btngn09, btngy10, btngn10, btngy11, btngn11, btngy12, btngn12, btngy13, btngn13, btngy14, btngn14, btngy15, btngn15;
    private RelativeLayout rlg01, rlg02, rlg03, rlg04, rlg05, rlg06, rlg07, rlg08, rlg09, rlg10, rlg11, rlg12, rlg13, rlg14, rlg15;

    private String g01, g02, g03, g04, g05, g06, g07, g08, g09, g10, g11, g12, g13, g14, g15, n15;
    private String tg01, tg02, tg03, tg04, tg05, tg06, tg07, tg08, tg09, tg10, tg11, tg12, tg13, tg14, tg15;
    private String s01, s02, s03, s04, s05, s06, s07;
    private String ng01, ng02, ng03, ng04, ng05, ng06, ng07;

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_JK = "extra_jk";

    private TextView tvNama, tvUsia, tvJk;

    private DatabaseHelper databaseHelper;

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

        btngy01 = findViewById(R.id.btn_gy01);
        btngn01 = findViewById(R.id.btn_gn01);
        btngy02 = findViewById(R.id.btn_gy02);
        btngn02 = findViewById(R.id.btn_gn02);
        btngy03 = findViewById(R.id.btn_gy03);
        btngn03 = findViewById(R.id.btn_gn03);
        btngy04 = findViewById(R.id.btn_gy04);
        btngn04 = findViewById(R.id.btn_gn04);
        btngy05 = findViewById(R.id.btn_gy05);
        btngn05 = findViewById(R.id.btn_gn05);
        btngy06 = findViewById(R.id.btn_gy06);
        btngn06 = findViewById(R.id.btn_gn06);
        btngy07 = findViewById(R.id.btn_gy07);
        btngn07 = findViewById(R.id.btn_gn07);
        btngy08 = findViewById(R.id.btn_gy08);
        btngn08 = findViewById(R.id.btn_gn08);
        btngy09 = findViewById(R.id.btn_gy09);
        btngn09 = findViewById(R.id.btn_gn09);
        btngy10 = findViewById(R.id.btn_gy10);
        btngn10 = findViewById(R.id.btn_gn10);
        btngy11 = findViewById(R.id.btn_gy11);
        btngn11 = findViewById(R.id.btn_gn11);
        btngy12 = findViewById(R.id.btn_gy12);
        btngn12 = findViewById(R.id.btn_gn12);
        btngy13 = findViewById(R.id.btn_gy13);
        btngn13 = findViewById(R.id.btn_gn13);
        btngy14 = findViewById(R.id.btn_gy14);
        btngn14 = findViewById(R.id.btn_gn14);
        btngy15 = findViewById(R.id.btn_gy15);
        btngn15 = findViewById(R.id.btn_gn15);

        rlg01 = findViewById(R.id.rl_g01);
        rlg02 = findViewById(R.id.rl_g02);
        rlg03 = findViewById(R.id.rl_g03);
        rlg04 = findViewById(R.id.rl_g04);
        rlg05 = findViewById(R.id.rl_g05);
        rlg06 = findViewById(R.id.rl_g06);
        rlg07 = findViewById(R.id.rl_g07);
        rlg08 = findViewById(R.id.rl_g08);
        rlg09 = findViewById(R.id.rl_g09);
        rlg10 = findViewById(R.id.rl_g10);
        rlg11 = findViewById(R.id.rl_g11);
        rlg12 = findViewById(R.id.rl_g12);
        rlg13 = findViewById(R.id.rl_g13);
        rlg14 = findViewById(R.id.rl_g14);
        rlg15 = findViewById(R.id.rl_g15);

        btngy01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn01.setVisibility(View.GONE);
                btngy01.setClickable(false);
                rlg02.setVisibility(View.VISIBLE);
                g01 = "G01";
            }
        });


        btngn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy01.setVisibility(View.GONE);
                btngn01.setClickable(false);
                rlg02.setVisibility(View.VISIBLE);
            }
        });

        btngy02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn02.setVisibility(View.GONE);
                btngy02.setClickable(false);
                rlg03.setVisibility(View.VISIBLE);
                g02 = "G02";
            }
        });

        btngn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy02.setVisibility(View.GONE);
                btngn02.setClickable(false);
                rlg03.setVisibility(View.VISIBLE);
            }
        });

        btngy03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn03.setVisibility(View.GONE);
                btngy03.setClickable(false);
                rlg04.setVisibility(View.VISIBLE);
                g03 = "G03";
            }
        });

        btngn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy03.setVisibility(View.GONE);
                btngn03.setClickable(false);
                rlg04.setVisibility(View.VISIBLE);
            }
        });

        btngy04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn04.setVisibility(View.GONE);
                btngy04.setClickable(false);
                rlg05.setVisibility(View.VISIBLE);
                g04 = "G04";
            }
        });

        btngn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy04.setVisibility(View.GONE);
                btngn04.setClickable(false);
                rlg05.setVisibility(View.VISIBLE);
            }
        });

        btngy05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn05.setVisibility(View.GONE);
                btngy05.setClickable(false);
                rlg06.setVisibility(View.VISIBLE);
                g05 = "G05";
            }
        });

        btngn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy05.setVisibility(View.GONE);
                btngn05.setClickable(false);
                rlg06.setVisibility(View.VISIBLE);
            }
        });

        btngy06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn06.setVisibility(View.GONE);
                btngy06.setClickable(false);
                rlg07.setVisibility(View.VISIBLE);
                g06 = "G06";
            }
        });

        btngn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy06.setVisibility(View.GONE);
                btngn06.setClickable(false);
                rlg07.setVisibility(View.VISIBLE);
            }
        });

        btngy07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn07.setVisibility(View.GONE);
                btngy07.setClickable(false);
                rlg08.setVisibility(View.VISIBLE);
                g07 = "G07";
            }
        });

        btngn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy07.setVisibility(View.GONE);
                btngn07.setClickable(false);
                rlg08.setVisibility(View.VISIBLE);
            }
        });

        btngy08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn08.setVisibility(View.GONE);
                btngy08.setClickable(false);
                rlg09.setVisibility(View.VISIBLE);
                g08 = "G08";
            }
        });

        btngn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy08.setVisibility(View.GONE);
                btngn08.setClickable(false);
                rlg09.setVisibility(View.VISIBLE);
            }
        });

        btngy09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn09.setVisibility(View.GONE);
                btngy09.setClickable(false);
                rlg10.setVisibility(View.VISIBLE);
                g09 = "G09";
            }
        });

        btngn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy09.setVisibility(View.GONE);
                btngn09.setClickable(false);
                rlg10.setVisibility(View.VISIBLE);
            }
        });

        btngy10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn10.setVisibility(View.GONE);
                btngy10.setClickable(false);
                rlg11.setVisibility(View.VISIBLE);
                g10 = "G10";
            }
        });

        btngn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy10.setVisibility(View.GONE);
                btngn10.setClickable(false);
                rlg11.setVisibility(View.VISIBLE);
            }
        });

        btngy11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn11.setVisibility(View.GONE);
                btngy11.setClickable(false);
                rlg12.setVisibility(View.VISIBLE);
                g11 = "G11";
            }
        });

        btngn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy11.setVisibility(View.GONE);
                btngn11.setClickable(false);
                rlg12.setVisibility(View.VISIBLE);
            }
        });

        btngy12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn12.setVisibility(View.GONE);
                btngy12.setClickable(false);
                rlg13.setVisibility(View.VISIBLE);
                g12 = "G12";
            }
        });

        btngn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy12.setVisibility(View.GONE);
                btngn12.setClickable(false);
                rlg13.setVisibility(View.VISIBLE);
            }
        });

        btngy13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn13.setVisibility(View.GONE);
                btngy13.setClickable(false);
                rlg14.setVisibility(View.VISIBLE);
                g13 = "G13";
            }
        });

        btngn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy13.setVisibility(View.GONE);
                btngn13.setClickable(false);
                rlg14.setVisibility(View.VISIBLE);
            }
        });

        btngy14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn14.setVisibility(View.GONE);
                btngy14.setClickable(false);
                rlg15.setVisibility(View.VISIBLE);
                g14 = "G14";
            }
        });

        btngn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy14.setVisibility(View.GONE);
                btngn14.setClickable(false);
                rlg15.setVisibility(View.VISIBLE);
            }
        });

        btngy15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngn15.setVisibility(View.GONE);
                btngy15.setClickable(false);
                g15 = "G15";
            }
        });

        btngn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btngy15.setVisibility(View.GONE);
                btngn15.setClickable(false);
                n15 = "N15";
            }
        });

        btnSelanjutnya = findViewById(R.id.btn_lanjut);
        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (g15 == null && n15 == null) {
                    String pesan = "Jawab Semua Pertanyaan Terlebih Dahulu!";
                    showToast(pesan);
                }

                if (g15 == "G15" || n15 == "N15") {
                    getSolusi();
                }

                //getSolusi();
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

        //recyclerView = findViewById(R.id.rv_gejala);
        //listL = new ArrayList<>();



        //for (int i=1; i<=10; i++) {
        //    list.add("Gejala" + i);
        //}

        databaseHelper = new DatabaseHelper(this);
        //if (databaseHelper.openDatabase())
        //    sqLiteDatabase = databaseHelper.getReadableDatabase();

        //linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //recyclerView.setLayoutManager(linearLayoutManager);

        //adapterL = new AdapterLaki(this, listL);
        //recyclerView.setAdapter(adapterL);
        //adapter.notifyDataSetChanged();

        //getListData();
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void getSolusi() {
        if (g01 == "G01" && g03 == "G03" && g05 == "G05") {
            tg01 = "Pernah mengalami mimpi basah/ keluarnya cairan sperma saat sedang tidur";
            tg03 = "Tumbuh jakun dibagian leher";
            tg05 = "Tumbuh kumis dan janggut";
            ng01 = "100";
            s01 = "Gejala yang dialami:\n" +
                    "-Pernah mengalami mimpi basah/ keluarnya cairan sperma saat sedang tidur\n" +
                    "-Tumbuh jakun dibagian leher\n" +
                    "-Tumbuh kumis dan janggut\n" +
                    "\n" +
                    "Selamat atas datangnya masa pubertas yang baru dalam hidupmu!. Inilah tanda bahwa kamu telah memasuki tahap pertumbuhan dan perkembangan yang normal dalam hidupmu. Jangan khawatir, ini adalah bagian dari perjalanan menuju kedewasaan. Teruslah belajar dan menjaga kesehatanmu dengan baik. Semoga kamu selalu diberkahi dan meraih kebahagiaan dalam setiap langkah hidupmu :). \n" +
                    "Perubahan fisik seperti mimpi basah/keluarnya cairan sperma saat tidur, tumbuh jakun di bagian leher, dan tumbuh kumis dan janggut adalah tanda-tanda bahwa pubertas sedang terjadi pada anak laki-laki.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Mencari informasi yang akurat dan bermanfaat tentang pubertas dan perubahan yang terjadi pada tubuh.\n" +
                    "2. Menjaga kesehatan fisik dan mental dengan mendorong mereka untuk mengonsumsi makanan sehat, berolahraga, dan mendapatkan istirahat yang cukup.\n" +
                    "3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri sendiri dengan cara yang positif dan sehat.\n" +
                    "4. Jika kamu merasa cemas atau tidak nyaman dengan perubahan yang terjadi pada tubuh atau emosinya, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g01 == "G01" && g03 == "G03" && g05 == null) {
            tg01 = "Pernah mengalami mimpi basah/ keluarnya cairan sperma saat sedang tidur";
            tg03 = "Tumbuh jakun dibagian leher";
            ng01 = "66";
            s01 = "Gejala yang dialami:\n" +
                    "-Pernah mengalami mimpi basah/ keluarnya cairan sperma saat sedang tidur\n" +
                    "-Tumbuh jakun dibagian leher\n" +
                    "\n" +
                    "Selamat atas datangnya masa pubertas yang baru dalam hidupmu!. Inilah tanda bahwa kamu telah memasuki tahap pertumbuhan dan perkembangan yang normal dalam hidupmu. Jangan khawatir, ini adalah bagian dari perjalanan menuju kedewasaan. Teruslah belajar dan menjaga kesehatanmu dengan baik. Semoga kamu selalu diberkahi dan meraih kebahagiaan dalam setiap langkah hidupmu :). \n" +
                    "Perubahan fisik seperti mimpi basah/keluarnya cairan sperma saat tidur dan tumbuh jakun di bagian leher adalah tanda-tanda bahwa pubertas sedang terjadi pada anak laki-laki.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Mencari informasi yang akurat dan bermanfaat tentang pubertas dan perubahan yang terjadi pada tubuh.\n" +
                    "2. Menjaga kesehatan fisik dan mental dengan mendorong mereka untuk mengonsumsi makanan sehat, berolahraga, dan mendapatkan istirahat yang cukup.\n" +
                    "3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri sendiri dengan cara yang positif dan sehat.\n" +
                    "4. Jika kamu merasa cemas atau tidak nyaman dengan perubahan yang terjadi pada tubuh atau emosinya, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g01 == "G01" && g05 == "G05" && g03 == null) {
            tg01 = "Pernah mengalami mimpi basah/ keluarnya cairan sperma saat sedang tidur";
            tg05 = "Tumbuh kumis dan janggut";
            ng01 = "66";
            s01 = "Gejala yang dialami:\n" +
                    "-Pernah mengalami mimpi basah/ keluarnya cairan sperma saat sedang tidur\n" +
                    "-Tumbuh kumis dan janggut" +
                    "\n" +
                    "Selamat atas datangnya masa pubertas yang baru dalam hidupmu!. Inilah tanda bahwa kamu telah memasuki tahap pertumbuhan dan perkembangan yang normal dalam hidupmu. Jangan khawatir, ini adalah bagian dari perjalanan menuju kedewasaan. Teruslah belajar dan menjaga kesehatanmu dengan baik. Semoga kamu selalu diberkahi dan meraih kebahagiaan dalam setiap langkah hidupmu :). \n" +
                    "Perubahan fisik seperti mimpi basah/keluarnya cairan sperma saat tidur dan tumbuh kumis dan janggut adalah tanda-tanda bahwa pubertas sedang terjadi pada anak laki-laki.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Mencari informasi yang akurat dan bermanfaat tentang pubertas dan perubahan yang terjadi pada tubuh.\n" +
                    "2. Menjaga kesehatan fisik dan mental dengan mendorong mereka untuk mengonsumsi makanan sehat, berolahraga, dan mendapatkan istirahat yang cukup.\n" +
                    "3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri sendiri dengan cara yang positif dan sehat.\n" +
                    "4. Jika kamu merasa cemas atau tidak nyaman dengan perubahan yang terjadi pada tubuh atau emosinya, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g03 == "G03" && g05 == "G05" && g01 == null) {
            tg03 = "Tumbuh jakun dibagian leher";
            tg05 = "Tumbuh kumis dan janggut";
            ng01 = "66";
            s01 = "Gejala yang dialami:\n" +
                    "-Tumbuh jakun dibagian leher\n" +
                    "-Tumbuh kumis dan janggut\n" +
                    "\n" +
                    "Selamat atas datangnya masa pubertas yang baru dalam hidupmu!. Inilah tanda bahwa kamu telah memasuki tahap pertumbuhan dan perkembangan yang normal dalam hidupmu. Jangan khawatir, ini adalah bagian dari perjalanan menuju kedewasaan. Teruslah belajar dan menjaga kesehatanmu dengan baik. Semoga kamu selalu diberkahi dan meraih kebahagiaan dalam setiap langkah hidupmu :). \n" +
                    "Perubahan fisik seperti tumbuh jakun di bagian leher dan tumbuh kumis dan janggut adalah tanda-tanda bahwa pubertas sedang terjadi pada anak laki-laki.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Mencari informasi yang akurat dan bermanfaat tentang pubertas dan perubahan yang terjadi pada tubuh.\n" +
                    "2. Menjaga kesehatan fisik dan mental dengan mendorong mereka untuk mengonsumsi makanan sehat, berolahraga, dan mendapatkan istirahat yang cukup.\n" +
                    "3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri sendiri dengan cara yang positif dan sehat.\n" +
                    "4. Jika kamu merasa cemas atau tidak nyaman dengan perubahan yang terjadi pada tubuh atau emosinya, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g01 == "G01" && g03 == null && g05 == null) {
            tg01 = "Pernah mengalami mimpi basah/ keluarnya cairan sperma saat sedang tidur";
            ng01 = "33";
            s01 = "Gejala yang dialami:\n" +
                    "-Pernah mengalami mimpi basah/ keluarnya cairan sperma saat sedang tidur\n" +
                    "\n" +
                    "Selamat atas datangnya masa pubertas yang baru dalam hidupmu!. Inilah tanda bahwa kamu telah memasuki tahap pertumbuhan dan perkembangan yang normal dalam hidupmu. Jangan khawatir, ini adalah bagian dari perjalanan menuju kedewasaan. Teruslah belajar dan menjaga kesehatanmu dengan baik. Semoga kamu selalu diberkahi dan meraih kebahagiaan dalam setiap langkah hidupmu :). \n" +
                    "Perubahan fisik seperti mimpi basah/keluarnya cairan sperma saat tidur adalah tanda-tanda bahwa pubertas sedang terjadi pada anak laki-laki.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Mencari informasi yang akurat dan bermanfaat tentang pubertas dan perubahan yang terjadi pada tubuh.\n" +
                    "2. Menjaga kesehatan fisik dan mental dengan mendorong mereka untuk mengonsumsi makanan sehat, berolahraga, dan mendapatkan istirahat yang cukup.\n" +
                    "3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri sendiri dengan cara yang positif dan sehat.\n" +
                    "4. Jika kamu merasa cemas atau tidak nyaman dengan perubahan yang terjadi pada tubuh atau emosinya, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g03 == "G03" && g01 == null && g05 == null) {
            tg03 = "Tumbuh jakun dibagian leher";
            ng01 = "33";
            s01 = "Gejala yang dialami:\n" +
                    "-Tumbuh jakun dibagian leher\n" +
                    "\n" +
                    "Selamat atas datangnya masa pubertas yang baru dalam hidupmu!. Inilah tanda bahwa kamu telah memasuki tahap pertumbuhan dan perkembangan yang normal dalam hidupmu. Jangan khawatir, ini adalah bagian dari perjalanan menuju kedewasaan. Teruslah belajar dan menjaga kesehatanmu dengan baik. Semoga kamu selalu diberkahi dan meraih kebahagiaan dalam setiap langkah hidupmu :). \n" +
                    "Perubahan fisik seperti tumbuh jakun di bagian leher adalah tanda-tanda bahwa pubertas sedang terjadi pada anak laki-laki.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Mencari informasi yang akurat dan bermanfaat tentang pubertas dan perubahan yang terjadi pada tubuh.\n" +
                    "2. Menjaga kesehatan fisik dan mental dengan mendorong mereka untuk mengonsumsi makanan sehat, berolahraga, dan mendapatkan istirahat yang cukup.\n" +
                    "3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri sendiri dengan cara yang positif dan sehat.\n" +
                    "4. Jika kamu merasa cemas atau tidak nyaman dengan perubahan yang terjadi pada tubuh atau emosinya, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g05 == "G05" && g03 == null && g01 == null) {
            tg05 = "-Tumbuh kumis dan janggut";
            ng01 = "33";
            s01 = "Gejala yang dialami:\n" +
                    "Tumbuh kumis dan janggut\n" +
                    "\n" +
                    "Selamat atas datangnya masa pubertas yang baru dalam hidupmu!. Inilah tanda bahwa kamu telah memasuki tahap pertumbuhan dan perkembangan yang normal dalam hidupmu. Jangan khawatir, ini adalah bagian dari perjalanan menuju kedewasaan. Teruslah belajar dan menjaga kesehatanmu dengan baik. Semoga kamu selalu diberkahi dan meraih kebahagiaan dalam setiap langkah hidupmu :). \n" +
                    "Perubahan fisik seperti tumbuh kumis dan janggut adalah tanda-tanda bahwa pubertas sedang terjadi pada anak laki-laki.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Mencari informasi yang akurat dan bermanfaat tentang pubertas dan perubahan yang terjadi pada tubuh.\n" +
                    "2. Menjaga kesehatan fisik dan mental dengan mendorong mereka untuk mengonsumsi makanan sehat, berolahraga, dan mendapatkan istirahat yang cukup.\n" +
                    "3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri sendiri dengan cara yang positif dan sehat.\n" +
                    "4. Jika kamu merasa cemas atau tidak nyaman dengan perubahan yang terjadi pada tubuh atau emosinya, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g02 == "G02") {
            tg02 = "Muncul jerawat pada wajah";
            ng02 = "100";
            s02 = "Gejala yang dialami:\n" +
                    "-Muncul jerawat pada wajah\n" +
                    "\n" +
                    "Kemungkinan timbul Jerawat disebabkan oleh perubahan hormon dalam tubuh, yang dapat terjadi selama masa kanak-kanak\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan kulit dengan rutin, membersihkan wajah dengan sabun wajah yang cocok untuk jenis kulit kamu. Hindari menggosok wajah terlalu keras karena dapat memperparah kondisi kulit. \n" +
                    "2. Perhatikan pola makan kamu, hindari makanan berlemak dan berminyak serta makan makanan yang sehat seperti buah-buahan dan sayuran. Minum cukup air putih untuk menjaga hidrasi kulit.\n" +
                    "3. Jika masalah jerawat masih berlanjut dan memburuk, konsultasikan dengan dokter kulit untuk mendapatkan saran perawatan yang tepat.\n";
        }

        if (g04 == "G04") {
            tg04 = "Suara berubah menjadi lebih berat";
            ng03 = "100";
            s03 = "Gejala yang dialami:\n" +
                    "-Suara berubah menjadi lebih berat\n" +
                    "\n" +
                    "Perubahan suara menjadi lebih berat adalah tanda-tanda bahwa pubertas sedang terjadi pada anak laki-laki. Selama masa pubertas, hormon testosteron pada anak laki-laki meningkat, yang dapat memengaruhi perubahan suara dan membuatnya menjadi lebih berat. \n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Menjaga kesehatan fisik dan mental dengan mendorong mereka untuk mengonsumsi makanan sehat, berolahraga, dan mendapatkan istirahat yang cukup.\n" +
                    "2. Mengonsumsi makanan sehat\n" +
                    "3. Memperhatikan aspek sosial dan emosional. \n" +
                    "4. Jika kamu merasa cemas atau tidak nyaman dengan perubahan yang terjadi pada tubuh atau emosinya, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g06 == "G06" && g09 == "G09") {
            tg06 = "Tumbuh rambut-rambut halus pada ketiak";
            tg09 = "Tumbuh rambut-rambut halus pada organ kelamin";
            ng04 = "100";
            s04 = "Gejala yang dialami:\n" +
                    "-Tumbuh rambut-rambut halus pada ketiak\n" +
                    "-Tumbuh rambut-rambut halus pada organ kelamin\n" +
                    "\n" +
                    "Tumbuhnya bulu halus pada area ketiak dan kemaluan adalah tanda-tanda awal bahwa pubertas akan segera datang.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan dengan rutin membersihkan area tersebut.\n" +
                    "2. Hindari mencukur bulu di area tersebut terlalu sering, karena hal ini dapat menyebabkan iritasi kulit dan infeksi. Jika kamu ingin mencukur bulu, pastikankamu menggunakan alat yang bersih dan steril.\n" +
                    "3. Jangan lupa untuk menjaga kebersihan pribadi dengan mengganti pakaian dalam secara teratur dan hindari berbagi pakaian atau handuk dengan orang lain untuk mencegah penyebaran bakteri dan infeksi.\n" +
                    "4. Terakhir, jikakamu mengalami perubahan yang tidak biasa seperti gatal atau bengkak pada area tersebut, sebaiknya segera berkonsultasi dengan dokter untuk mendapatkan perawatan yang tepat.\n";
        }

        if (g06 == "G06" && g09 == null) {
            tg06 = "Tumbuh rambut-rambut halus pada ketiak";
            ng04 = "50";
            s04 = "Gejala yang dialami:\n" +
                    "-Tumbuh rambut-rambut halus pada ketiak\n" +
                    "\n" +
                    "Tumbuhnya bulu halus pada area ketiak adalah tanda-tanda awal bahwa pubertas akan segera datang.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan dengan rutin membersihkan area tersebut.\n" +
                    "2. Hindari mencukur bulu di area tersebut terlalu sering, karena hal ini dapat menyebabkan iritasi kulit dan infeksi. Jika kamu ingin mencukur bulu, pastikankamu menggunakan alat yang bersih dan steril.\n" +
                    "3. Jangan lupa untuk menjaga kebersihan pribadi dengan mengganti pakaian dalam secara teratur dan hindari berbagi pakaian atau handuk dengan orang lain untuk mencegah penyebaran bakteri dan infeksi.\n" +
                    "4. Terakhir, jikakamu mengalami perubahan yang tidak biasa seperti gatal atau bengkak pada area tersebut, sebaiknya segera berkonsultasi dengan dokter untuk mendapatkan perawatan yang tepat.\n";
        }

        if (g09 == "G09" && g06 == null) {
            tg09 = "Tumbuh rambut-rambut halus pada organ kelamin";
            ng04 = "50";
            s04 = "Gejala yang dialami:\n" +
                    "-Tumbuh rambut-rambut halus pada organ kelamin\n" +
                    "\n" +
                    "Tumbuhnya bulu halus pada area kemaluan adalah tanda-tanda awal bahwa pubertas akan segera datang.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan dengan rutin membersihkan area tersebut.\n" +
                    "2. Hindari mencukur bulu di area tersebut terlalu sering, karena hal ini dapat menyebabkan iritasi kulit dan infeksi. Jika kamu ingin mencukur bulu, pastikankamu menggunakan alat yang bersih dan steril.\n" +
                    "3. Jangan lupa untuk menjaga kebersihan pribadi dengan mengganti pakaian dalam secara teratur dan hindari berbagi pakaian atau handuk dengan orang lain untuk mencegah penyebaran bakteri dan infeksi.\n" +
                    "4. Terakhir, jikakamu mengalami perubahan yang tidak biasa seperti gatal atau bengkak pada area tersebut, sebaiknya segera berkonsultasi dengan dokter untuk mendapatkan perawatan yang tepat.\n";
        }

        if (g07 == "G07") {
            tg07 = "Mulai timbul bau badan";
            ng05 = "100";
            s05 = "Gejala yang dialami:\n" +
                    "-Mulai timbul bau badan\n" +
                    "\n" +
                    "Perubahan hormon selama masa pubertas dapat menyebabkan kelenjar keringat pada tubuh menjadi lebih aktif, yang menyebabkan bau badan yang lebih kuat. Jikakamu mengalami bau badan yang lebih kuat dan belum mengalami pubertas, maka kemungkinan masalah tersebut bukan disebabkan oleh faktor pubertas. \n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Rutin mandi setiap hari menggunakan sabun yang lembut dan air bersih.\n" +
                    "2. Gunakan antiperspirant atau deodoran untuk mengurangi produksi keringat dan mencegah bau badan.\n" +
                    "3. Gunakan pakaian yang dapat menyerap keringat dan terbuat dari bahan yang tidak menimbulkan bau, seperti katun atau linen.\n" +
                    "4. Hindari makanan yang dapat memicu bau badan, seperti bawang putih, bawang merah, makanan pedas.\n" +
                    "5. Minum air putih yang cukup untuk menjaga tubuh tetap terhidrasi dan membantu mengurangi bau badan.\n" +
                    "6. Jikakamu merasa khawatir atau mengalami gejala yang tidak normal, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n" +
                    "Perlu diingat bahwa bau badan pada wanita adalah kondisi yang normal dan alami, namun jikakamu merasa terganggu atau memiliki bau badan yang kuat dan tidak normal, segera konsultasikan dengan dokter atau spesialis kesehatan terpercaya untuk mendapatkan saran dan perawatan yang tepat.\n";
        }

        if (g08 == "G08" && g10 == "G10" && g11 == "G11") {
            tg08 = "Dada mulai tampak bidang";
            tg10 = "Organ kelamin membesar";
            tg11 = "Terjadi peningkatan tinggi badan";
            ng06 = "100";
            s06 = "Gejala yang dialami:\n" +
                    "-Dada mulai tampak bidang\n" +
                    "-Organ kelamin membesar\n" +
                    "-Terjadi peningkatan tinggi badan\n" +
                    "\n" +
                    "Jikakamu mengalami perubahan fisik seperti dada tampak bidang, organ kelamin membesar, dan peningkatan tinggi badan, maka kemungkinan besarkamu sedang mengalami pubertas. Selama masa pubertas, tubuh mengalami perubahan fisik karena adanya perubahan hormonal.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Berbicara dengan orang tua atau teman-teman kamu tentang perubahan yang terjadi pada tubuh kamu dan bagaimana mengatasi perasaan yang muncul.\n" +
                    "2. Berolahraga secara teratur untuk membantu menjaga kesehatan tubuh dan meningkatkan kepercayaan diri\n" +
                    "3. Mengonsumsi makanan yang sehat dan seimbang untuk membantu memenuhi kebutuhan nutrisi selama masa pertumbuhan\n" +
                    "4. Tidur yang cukup untuk membantu tubuh pulih dan tumbuh dengan baik\n" +
                    "5. Menjaga kebersihan diri dan menjaga area genital tetap bersih\n" +
                    "\n" +
                    "Jikakamu merasa kesulitan menghadapi perubahan fisik selama pubertas atau mengalami gejala yang mengkhawatirkan, sebaiknyakamu berkonsultasi dengan dokter atau profesional kesehatan untuk mendapatkan saran dan perawatan yang tepat.\n";
        }

        if (g08 == "G08" && g10 == "G10" && g11 == null) {
            tg08 = "Dada mulai tampak bidang";
            tg10 = "Organ kelamin membesar";
            ng06 = "66";
            s06 = "Gejala yang dialami:\n" +
                    "-Dada mulai tampak bidang\n" +
                    "-Organ kelamin membesar\n" +
                    "\n" +
                    "Jikakamu mengalami perubahan fisik seperti dada tampak bidang dan organ kelamin membesar, maka kemungkinan besarkamu sedang mengalami pubertas. Selama masa pubertas, tubuh mengalami perubahan fisik karena adanya perubahan hormonal.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Berbicara dengan orang tua atau teman-teman kamu tentang perubahan yang terjadi pada tubuh kamu dan bagaimana mengatasi perasaan yang muncul.\n" +
                    "2. Berolahraga secara teratur untuk membantu menjaga kesehatan tubuh dan meningkatkan kepercayaan diri\n" +
                    "3. Mengonsumsi makanan yang sehat dan seimbang untuk membantu memenuhi kebutuhan nutrisi selama masa pertumbuhan\n" +
                    "4. Tidur yang cukup untuk membantu tubuh pulih dan tumbuh dengan baik\n" +
                    "5. Menjaga kebersihan diri dan menjaga area genital tetap bersih\n" +
                    "\n" +
                    "Jikakamu merasa kesulitan menghadapi perubahan fisik selama pubertas atau mengalami gejala yang mengkhawatirkan, sebaiknyakamu berkonsultasi dengan dokter atau profesional kesehatan untuk mendapatkan saran dan perawatan yang tepat.\n";
        }

        if (g08 == "G08" && g11 == "G11" && g10 == null) {
            tg08 = "Dada mulai tampak bidang";
            tg11 = "Terjadi peningkatan tinggi badan";
            ng06 = "66";
            s06 = "Gejala yang dialami:\n" +
                    "-Dada mulai tampak bidang\n" +
                    "-Terjadi peningkatan tinggi badan\n" +
                    "\n" +
                    "Jikakamu mengalami perubahan fisik seperti dada tampak bidang dan peningkatan tinggi badan, maka kemungkinan besarkamu sedang mengalami pubertas. Selama masa pubertas, tubuh mengalami perubahan fisik karena adanya perubahan hormonal. \n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Berbicara dengan orang tua atau teman-teman kamu tentang perubahan yang terjadi pada tubuh kamu dan bagaimana mengatasi perasaan yang muncul.\n" +
                    "2. Berolahraga secara teratur untuk membantu menjaga kesehatan tubuh dan meningkatkan kepercayaan diri\n" +
                    "3. Mengonsumsi makanan yang sehat dan seimbang untuk membantu memenuhi kebutuhan nutrisi selama masa pertumbuhan\n" +
                    "4. Tidur yang cukup untuk membantu tubuh pulih dan tumbuh dengan baik\n" +
                    "5. Menjaga kebersihan diri dan menjaga area genital tetap bersih\n" +
                    "\n" +
                    "Jikakamu merasa kesulitan menghadapi perubahan fisik selama pubertas atau mengalami gejala yang mengkhawatirkan, sebaiknyakamu berkonsultasi dengan dokter atau profesional kesehatan untuk mendapatkan saran dan perawatan yang tepat.\n";
        }

        if (g10 == "G10" && g11 == "G11" && g08 == null) {
            tg10 = "Organ kelamin membesar";
            tg11 = "Terjadi peningkatan tinggi badan";
            ng06 = "66";
            s06 = "Gejala yang dialami:\n" +
                    "-Organ kelamin membesar\n" +
                    "-Terjadi peningkatan tinggi badan\n" +
                    "\n" +
                    "Jikakamu mengalami perubahan fisik seperti organ kelamin membesar dan peningkatan tinggi badan, maka kemungkinan besarkamu sedang mengalami pubertas. Selama masa pubertas, tubuh mengalami perubahan fisik karena adanya perubahan hormonal. \n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Berbicara dengan orang tua atau teman-teman kamu tentang perubahan yang terjadi pada tubuh kamu dan bagaimana mengatasi perasaan yang muncul.\n" +
                    "2. Berolahraga secara teratur untuk membantu menjaga kesehatan tubuh dan meningkatkan kepercayaan diri\n" +
                    "3. Mengonsumsi makanan yang sehat dan seimbang untuk membantu memenuhi kebutuhan nutrisi selama masa pertumbuhan\n" +
                    "4. Tidur yang cukup untuk membantu tubuh pulih dan tumbuh dengan baik\n" +
                    "5. Menjaga kebersihan diri dan menjaga area genital tetap bersih\n" +
                    "\n" +
                    "Jikakamu merasa kesulitan menghadapi perubahan fisik selama pubertas atau mengalami gejala yang mengkhawatirkan, sebaiknyakamu berkonsultasi dengan dokter atau profesional kesehatan untuk mendapatkan saran dan perawatan yang tepat.\n";
        }

        if (g08 == "G08" && g10 == null && g11 == null) {
            tg08 = "Dada mulai tampak bidang";
            ng06 = "33";
            s06 = "Gejala yang dialami:\n" +
                    "-Dada mulai tampak bidang\n" +
                    "\n" +
                    "Jikakamu mengalami perubahan fisik seperti dada tampak bidang, maka kemungkinan besarkamu sedang mengalami pubertas. Selama masa pubertas, tubuh mengalami perubahan fisik karena adanya perubahan hormonal. \n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Berbicara dengan orang tua atau teman-teman kamu tentang perubahan yang terjadi pada tubuh kamu dan bagaimana mengatasi perasaan yang muncul.\n" +
                    "2. Berolahraga secara teratur untuk membantu menjaga kesehatan tubuh dan meningkatkan kepercayaan diri\n" +
                    "3. Mengonsumsi makanan yang sehat dan seimbang untuk membantu memenuhi kebutuhan nutrisi selama masa pertumbuhan\n" +
                    "4. Tidur yang cukup untuk membantu tubuh pulih dan tumbuh dengan baik\n" +
                    "5. Menjaga kebersihan diri dan menjaga area genital tetap bersih\n" +
                    "\n" +
                    "Jikakamu merasa kesulitan menghadapi perubahan fisik selama pubertas atau mengalami gejala yang mengkhawatirkan, sebaiknyakamu berkonsultasi dengan dokter atau profesional kesehatan untuk mendapatkan saran dan perawatan yang tepat.\n";
        }

        if (g10 == "G10" && g08 == null && g11 == null) {
            tg10 = "Organ kelamin membesar";
            ng06 = "33";
            s06 = "Gejala yang dialami:\n" +
                    "-Organ kelamin membesar\n" +
                    "\n" +
                    "Jikakamu mengalami perubahan fisik seperti organ kelamin membesar, maka kemungkinan besarkamu sedang mengalami pubertas. Selama masa pubertas, tubuh mengalami perubahan fisik karena adanya perubahan hormonal. \n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Berbicara dengan orang tua atau teman-teman kamu tentang perubahan yang terjadi pada tubuh kamu dan bagaimana mengatasi perasaan yang muncul.\n" +
                    "2. Berolahraga secara teratur untuk membantu menjaga kesehatan tubuh dan meningkatkan kepercayaan diri\n" +
                    "3. Mengonsumsi makanan yang sehat dan seimbang untuk membantu memenuhi kebutuhan nutrisi selama masa pertumbuhan\n" +
                    "4. Tidur yang cukup untuk membantu tubuh pulih dan tumbuh dengan baik\n" +
                    "5. Menjaga kebersihan diri dan menjaga area genital tetap bersih\n" +
                    "\n" +
                    "Jikakamu merasa kesulitan menghadapi perubahan fisik selama pubertas atau mengalami gejala yang mengkhawatirkan, sebaiknyakamu berkonsultasi dengan dokter atau profesional kesehatan untuk mendapatkan saran dan perawatan yang tepat.\n";
        }

        if (g11 == "G11" && g10 == null && g08 == null) {
            tg11 = "Terjadi peningkatan tinggi badan";
            ng06 = "33";
            s06 = "Gejala yang dialami:\n" +
                    "-Terjadi peningkatan tinggi badan\n" +
                    "\n" +
                    "Jikakamu mengalami perubahan fisik seperti peningkatan tinggi badan, maka kemungkinan besarkamu sedang mengalami pubertas. Selama masa pubertas, tubuh mengalami perubahan fisik karena adanya perubahan hormonal. \n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Berbicara dengan orang tua atau teman-teman kamu tentang perubahan yang terjadi pada tubuh kamu dan bagaimana mengatasi perasaan yang muncul.\n" +
                    "2. Berolahraga secara teratur untuk membantu menjaga kesehatan tubuh dan meningkatkan kepercayaan diri\n" +
                    "3. Mengonsumsi makanan yang sehat dan seimbang untuk membantu memenuhi kebutuhan nutrisi selama masa pertumbuhan\n" +
                    "4. Tidur yang cukup untuk membantu tubuh pulih dan tumbuh dengan baik\n" +
                    "5. Menjaga kebersihan diri dan menjaga area genital tetap bersih\n" +
                    "\n" +
                    "Jikakamu merasa kesulitan menghadapi perubahan fisik selama pubertas atau mengalami gejala yang mengkhawatirkan, sebaiknyakamu berkonsultasi dengan dokter atau profesional kesehatan untuk mendapatkan saran dan perawatan yang tepat.\n";
        }

        if (g12 == "G12" && g13 == "G13" && g14 == "G14" && g15 == "G15") {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg13 = "Mudah mengekspresikan diri";
            tg14 = "Lebih sensitif terhadap perubahan fisik";
            tg15 = "Cenderung bergaul dengan teman sebaya";
            ng07 = "100";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "-Lebih sensitif terhadap perubahan fisik\n" +
                    "-Cenderung bergaul dengan teman sebaya\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mulai tertarik dengan lawan jenis, mudah mengekspresikan diri, lebih sensitif terhadap perubahan fisik, dan cenderung bergaul dengan teman sebaya adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g12 == "G12" && g13 == "G13" && g14 == "G14" && g15 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg13 = "Mudah mengekspresikan diri";
            tg14 = "Lebih sensitif terhadap perubahan fisik";
            ng07 = "75";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "-Lebih sensitif terhadap perubahan fisik\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mulai tertarik dengan lawan jenis, mudah mengekspresikan diri, dan lebih sensitif terhadap perubahan fisik adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g12 == "G12" && g13 == "G13" && g15 == "G15" && g14 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg13 = "Mudah mengekspresikan diri";
            tg15 = "Cenderung bergaul dengan teman sebaya";
            ng07 = "75";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "-Cenderung bergaul dengan teman sebaya\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mulai tertarik dengan lawan jenis, mudah mengekspresikan diri, dan cenderung bergaul dengan teman sebaya adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g12 == "G12" && g14 == "G14" && g15 == "G15" && g13 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg14 = "Lebih sensitif terhadap perubahan fisik";
            tg15 = "Cenderung bergaul dengan teman sebaya";
            ng07 = "75";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Lebih sensitif terhadap perubahan fisik\n" +
                    "-Cenderung bergaul dengan teman sebaya\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mulai tertarik dengan lawan jenis, lebih sensitif terhadap perubahan fisik, dan cenderung bergaul dengan teman sebaya adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g13 == "G13" && g14 == "G14" && g15 == "G15" && g12 == null) {
            tg13 = "Mudah mengekspresikan diri";
            tg14 = "Lebih sensitif terhadap perubahan fisik";
            tg15 = "Cenderung bergaul dengan teman sebaya";
            ng07 = "75";
            s07 = "Gejala yang dialami:\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "-Lebih sensitif terhadap perubahan fisik\n" +
                    "-Cenderung bergaul dengan teman sebaya\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mudah mengekspresikan diri, lebih sensitif terhadap perubahan fisik, dan cenderung bergaul dengan teman sebaya adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g12 == "G12" && g13 == "G13" && g14 == null && g15 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg13 = "Mudah mengekspresikan diri";
            ng07 = "50";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mulai tertarik dengan lawan jenis dan mudah mengekspresikan diri adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g14 == "G14" && g15 == "G15" && g12 == null && g13 == null) {
            tg14 = "Lebih sensitif terhadap perubahan fisik";
            tg15 = "Cenderung bergaul dengan teman sebaya";
            ng07 = "50";
            s07 = "Gejala yang dialami:\n" +
                    "-Lebih sensitif terhadap perubahan fisik\n" +
                    "-Cenderung bergaul dengan teman sebaya\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang lebih sensitif terhadap perubahan fisik dan cenderung bergaul dengan teman sebaya adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g12 == "G12" && g14 == "G14" && g13 == null && g15 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg14 = "Lebih sensitif terhadap perubahan fisik";
            ng07 = "50";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Lebih sensitif terhadap perubahan fisik\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mulai tertarik dengan lawan jenis dan lebih sensitif terhadap perubahan fisik adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g12 == "G12" && g15 == "G15" && g14 == null && g13 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg15 = "Cenderung bergaul dengan teman sebaya";
            ng07 = "50";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Cenderung bergaul dengan teman sebaya\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mulai tertarik dengan lawan jenis dan cenderung bergaul dengan teman sebaya adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g13 == "G13" && g14 == "G14" && g12 == null && g15 == null) {
            tg13 = "Mudah mengekspresikan diri";
            tg14 = "Lebih sensitif terhadap perubahan fisik";
            ng07 = "50";
            s07 = "Gejala yang dialami:\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "-Lebih sensitif terhadap perubahan fisik\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mudah mengekspresikan diri dan lebih sensitif terhadap perubahan fisik adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g13 == "G13" && g15 == "G15" && g12 == null && g14 == null) {
            tg13 = "Mudah mengekspresikan diri";
            tg15 = "Cenderung bergaul dengan teman sebaya";
            ng07 = "50";
            s07 = "Gejala yang dialami:\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "-Cenderung bergaul dengan teman sebaya\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mudah mengekspresikan diri dan cenderung bergaul dengan teman sebaya adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g12 == "G12" && g13 == null && g14 == null && g15 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            ng07 = "25";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mulai tertarik dengan lawan jenis adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g13 == "G13" && g12 == null && g14 == null && g15 == null) {
            tg13 = "Mudah mengekspresikan diri";
            ng07 = "25";
            s07 = "Gejala yang dialami:\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang mudah mengekspresikan diri adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g14 == "G14" && g13 == null && g12 == null && g15 == null) {
            tg14 = "Lebih sensitif terhadap perubahan fisik";
            ng07 = "25";
            s07 = "Gejala yang dialami:\n" +
                    "-Lebih sensitif terhadap perubahan fisik\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang lebih sensitif terhadap perubahan fisik adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        if (g15 == "G15" && g13 == null && g14 == null && g12 == null) {
            tg15 = "Cenderung bergaul dengan teman sebaya";
            ng07 = "25";
            s07 = "Gejala yang dialami:\n" +
                    "-Cenderung bergaul dengan teman sebaya\n" +
                    "\n" +
                    "Kemungkinan pada laki-laki yang cenderung bergaul dengan teman sebaya adalah tanda-tanda awal dari pubertas yang sedang terjadi.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Belajar dan mencari tau pendidikan seksual sehingga dapat memahami dan menghadapi perubahan fisik yang terjadi pada diri sendiri dengan lebih baik.\n" +
                    "2. Menjaga kebersihan diri, seperti mandi secara teratur dan mengganti pakaian yang sudah kotor atau basah.\n" +
                    "3. Berolahraga secara teratur, karena hal ini dapat membantu mengurangi stres dan kecemasan serta membantu menjaga kesehatan fisik dan mental.\n" +
                    "Jangan ragu untuk berkonsultasi dengan dokter atau ahli kesehatan jika memiliki kekhawatiran tentang perkembangan kamu.\n";
        }

        final String nama = this.tvNama.getText().toString().trim();
        final String usia = this.tvUsia.getText().toString().trim();
        final String jk = this.tvJk.getText().toString().trim();

        //String ig01 = (g01 == "G01") ? "G01" : "-";
        //String ig02 = (g02 == "G02") ? "G02" : "-";
        //String ig03 = (g03 == "G03") ? "G03" : "-";
        //String ig04 = (g04 == "G04") ? "G04" : "-";
        //String ig05 = (g05 == "G05") ? "G05" : "-";
        //String ig06 = (g06 == "G06") ? "G06" : "-";
        //String ig07 = (g07 == "G07") ? "G07" : "-";
        //String ig08 = (g08 == "G08") ? "G08" : "-";
        //String ig09 = (g09 == "G09") ? "G09" : "-";
        //String ig10 = (g10 == "G10") ? "G10" : "-";
        //String ig11 = (g11 == "G11") ? "G11" : "-";
        //String ig12 = (g12 == "G12") ? "G12" : "-";
        //String ig13 = (g13 == "G13") ? "G13" : "-";
        //String ig14 = (g14 == "G14") ? "G14" : "-";
        //String ig15 = (g15 == "G15") ? "G15" : "-";

        String gejala = g01;

        Boolean checkInsertData = databaseHelper.insertDataUsers(nama, Integer.valueOf(usia), jk, gejala);

        if (checkInsertData == true) {
            String pesan = "Gejala Berhasil diolah!";
            showToast(pesan);
        } else {
            String pesan = "Gejala tidak Berhasil diolah!";
            showToast(pesan);
        }

        Intent lanjut = new Intent(LakiLakiActivity.this, HasilScreeningActivity.class);

        lanjut.putExtra(HasilScreeningActivity.EXTRA_NAME, nama);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_AGE, usia);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_JK, jk);

        lanjut.putExtra(HasilScreeningActivity.EXTRA_N01, ng01);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_N02, ng02);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_N03, ng03);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_N04, ng04);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_N05, ng05);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_N06, ng06);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_N07, ng07);

        lanjut.putExtra(HasilScreeningActivity.EXTRA_S01, s01);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S02, s02);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S03, s03);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S04, s04);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S05, s05);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S06, s06);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S07, s07);

        startActivity(lanjut);
        finish();
    }

    //private void getListData() {
    //    listL = databaseHelper.getDaftarGejalaLaki();
    //    if (listL.size() == 0) {
    //        recyclerView.setVisibility(View.GONE);
    //    } else {
    //        recyclerView.setVisibility(View.VISIBLE);
    //        adapterL = new AdapterLaki(this, listL);
    //        recyclerView.setAdapter(adapterL);
    //    }
    //}
}