package com.dava.pubertassehat;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
import java.util.List;

public class PerempuanActivity extends AppCompatActivity {

    public Button btnKembali;
    private Button btnSelanjutnya, btngy01, btngn01, btngy02, btngn02, btngy03, btngn03, btngy04, btngn04, btngy05, btngn05, btngy06, btngn06, btngy07, btngn07, btngy08, btngn08, btngy09, btngn09, btngy10, btngn10, btngy11, btngn11, btngy12, btngn12, btngy13, btngn13, btngy14, btngn14, btngy15, btngn15;
    private RelativeLayout rlg01, rlg02, rlg03, rlg04, rlg05, rlg06, rlg07, rlg08, rlg09, rlg10, rlg11, rlg12, rlg13, rlg14, rlg15;

    private String g01, g02, g03, g04, g05, g06, g07, g08, g09, g10, g11, g12, g13, g14, g15, n15;
    private String tg01, tg02, tg03, tg04, tg05, tg06, tg07, tg08, tg09, tg10, tg11, tg12, tg13, tg14, tg15;
    private String s01, s02, s03, s04, s05, s06, s07, s08;
    private String ng01, ng02, ng03, ng04, ng05, ng06, ng07, ng08;

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_JK = "extra_jk";

    private TextView tvNama, tvUsia, tvJk;

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<ModelDiagnosaPerempuan> listP;
    private AdapterPerempuan adapterP;
    SQLiteDatabase sqLiteDatabase;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perempuan);

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
        //listP = new ArrayList<>();

        //for (int i=1; i<=10; i++) {
        //    list.add("Gejala" + i);
        //}

        //databaseHelper = new DatabaseHelper(this);
        //if (databaseHelper.openDatabase())
        //    sqLiteDatabase = databaseHelper.getReadableDatabase();

        //linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //recyclerView.setLayoutManager(linearLayoutManager);

        //adapterP = new AdapterPerempuan(this, listP);
        //recyclerView.setAdapter(adapterP);
        //adapter.notifyDataSetChanged();

        //getListData();
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void getSolusi() {
        if (g01 == "G01") {
            tg01 = "Apakah telah mengalami menstruasi/haidh";
            ng01 = "100";
            s01 = "Gejala yang dialami:\n" +
                    "-Telah mengalami menstruasi/haidh" +
                    "\n" +
                    "Selamat atas datangnya masa pubertas yang baru dalam hidupmu! :) Hari ini, kamu memasuki fase yang penting dalam perjalanan menjadi wanita. Semoga kamu menjalani masa pubertas ini dengan kesehatan yang baik dan menerima perubahan-perubahan yang terjadi dengan penuh kepercayaan diri.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Gunakan pembalut atau tampon yang sesuai dengan kebutuhan dan kenyamanan kamu. Ganti pembalut atau tampon secara teratur untuk menjaga kebersihan dan mencegah infeksi.\n" +
                    "2. Hindari makanan pedas, berlemak, atau berminyak selama menstruasi untuk mengurangi perut kembung dan nyeri.\n" +
                    "3.Hindari stres yang berlebihan karena dapat memperburuk gejala menstruasi. \n" +
                    "4.Jaga kebersihan area kewanitaan dan hindari penggunaan produk yang mengandung bahan kimia keras.\n";
        }

        if (g02 == "G02" && g03 == "G03") {
            tg02 = "Muncul jerawat pada wajah";
            tg03 = "Kulit tampak berminyak";
            ng02 = "100";
            s02 = "Gejala yang dialami:\n" +
                    "-Muncul jerawat pada wajah\n" +
                    "-Kulit tampak berminyak\n" +
                    "\n" +
                    "Kemungkinan timbul Jerawat dan kulit berminyak pada muka disebabkan oleh perubahan hormon dalam tubuh, yang dapat terjadi selama masa kanak-kanak\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan kulit dengan rutin, membersihkan wajah dengan sabun wajah yang cocok untuk jenis kulitkamu. Hindari menggosok wajah terlalu keras karena dapat memperparah kondisi kulit. \n" +
                    "2. Perhatikan pola makankamu, hindari makanan berlemak dan berminyak serta makan makanan yang sehat seperti buah-buahan dan sayuran. Minum cukup air putih untuk menjaga hidrasi kulit.\n" +
                    "3. Jika masalah jerawat dan kulit berminyak masih berlanjut dan memburuk, konsultasikan dengan dokter kulit untuk mendapatkan saran perawatan yang tepat.\n";
        }

        if (g02 == "G02" && g03 == null) {
            tg02 = "Muncul jerawat pada wajah";
            ng02 = "50";
            s02 = "Gejala yang dialami:\n" +
                    "-Muncul jerawat pada wajah\n" +
                    "\n" +
                    "Kemungkinan timbul Jerawat pada muka disebabkan oleh perubahan hormon dalam tubuh, yang dapat terjadi selama masa kanak-kanak\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan kulit dengan rutin, membersihkan wajah dengan sabun wajah yang cocok untuk jenis kulitkamu. Hindari menggosok wajah terlalu keras karena dapat memperparah kondisi kulit. \n" +
                    "2. Perhatikan pola makankamu, hindari makanan berlemak dan berminyak serta makan makanan yang sehat seperti buah-buahan dan sayuran. Minum cukup air putih untuk menjaga hidrasi kulit.\n" +
                    "3. Jika masalah jerawat dan kulit berminyak masih berlanjut dan memburuk, konsultasikan dengan dokter kulit untuk mendapatkan saran perawatan yang tepat.\n";
        }

        if (g03 == "G03" && g02 == "G03") {
            tg03 = "Kulit tampak berminyak";
            ng02 = "50";
            s02 = "Gejala yang dialami:\n" +
                    "-Kulit tampak berminyak\n" +
                    "\n" +
                    "Kemungkinan kulit berminyak pada muka disebabkan oleh perubahan hormon dalam tubuh, yang dapat terjadi selama masa kanak-kanak\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan kulit dengan rutin, membersihkan wajah dengan sabun wajah yang cocok untuk jenis kulitkamu. Hindari menggosok wajah terlalu keras karena dapat memperparah kondisi kulit. \n" +
                    "2. Perhatikan pola makankamu, hindari makanan berlemak dan berminyak serta makan makanan yang sehat seperti buah-buahan dan sayuran. Minum cukup air putih untuk menjaga hidrasi kulit.\n" +
                    "3. Jika masalah jerawat dan kulit berminyak masih berlanjut dan memburuk, konsultasikan dengan dokter kulit untuk mendapatkan saran perawatan yang tepat.\n";
        }

        if (g04 == "G04" && g09 == "G09" && g10 == "G10") {
            tg04 = "Payudara mulai membesar kanan dan kiri";
            tg09 = "Terjadi peningkatan kenaikan berat badan";
            tg10 = "Terjadi peningkatan tinggi badan";
            ng03 = "100";
            s03 = "Gejala yang dialami:\n" +
                    "-Payudara mulai membesar kanan dan kiri\n" +
                    "-Terjadi peningkatan kenaikan berat badan\n" +
                    "-Terjadi peningkatan tinggi badan\n" +
                    "\n" +
                    "Pertumbuhan payudara, peningkatan berat badan, dan peningkatan tinggi badan yang terjadi sebelum masuknya pubertas adalah hal yang umum terjadi. Hal ini terjadi karena adanya perubahan hormon dalam tubuh.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kesehatan dengan rutin berolahraga dan mengonsumsi makanan yang sehat dan bergizi. Hindari makanan cepat saji dan minuman bersoda yang dapat memperburuk kondisi kesehatankamu.\n" +
                    "2. Jangan khawatir jika terjadi perbedaan ukuran payudara karena hal ini cukup umum terjadi dan tidak perlu menjadi suatu masalah yang serius. Namun, jika terdapat rasa sakit atau benjolan pada payudara, sebaiknya segera berkonsultasi dengan dokter.\n" +
                    "2. Perhatikan postur tubuhkamu dan hindari membungkuk atau mengenakan pakaian yang terlalu ketat untuk menjaga kesehatan tulang dan postur tubuh.\n" +
                    "3. Terakhir, jangan lupa untuk menjaga kesehatan mental dengan melakukan kegiatan yang menyenangkan dan meredakan stres, seperti olahraga, meditasi, atau kegiatan lain yangkamu sukai.\n";
        }

        if (g04 == "G04" && g09 == "G09" && g10 == null) {
            tg04 = "Payudara mulai membesar kanan dan kiri";
            tg09 = "Terjadi peningkatan kenaikan berat badan";
            ng03 = "66";
            s03 = "Gejala yang dialami:\n" +
                    "-Payudara mulai membesar kanan dan kiri\n" +
                    "-Terjadi peningkatan kenaikan berat badan\n" +
                    "\n" +
                    "Pertumbuhan payudara dan peningkatan berat badan yang terjadi sebelum masuknya pubertas adalah hal yang umum terjadi. Hal ini terjadi karena adanya perubahan hormon dalam tubuh.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kesehatan dengan rutin berolahraga dan mengonsumsi makanan yang sehat dan bergizi. Hindari makanan cepat saji dan minuman bersoda yang dapat memperburuk kondisi kesehatankamu.\n" +
                    "2. Jangan khawatir jika terjadi perbedaan ukuran payudara karena hal ini cukup umum terjadi dan tidak perlu menjadi suatu masalah yang serius. Namun, jika terdapat rasa sakit atau benjolan pada payudara, sebaiknya segera berkonsultasi dengan dokter.\n" +
                    "2. Perhatikan postur tubuhkamu dan hindari membungkuk atau mengenakan pakaian yang terlalu ketat untuk menjaga kesehatan tulang dan postur tubuh.\n" +
                    "3. Terakhir, jangan lupa untuk menjaga kesehatan mental dengan melakukan kegiatan yang menyenangkan dan meredakan stres, seperti olahraga, meditasi, atau kegiatan lain yangkamu sukai.\n";
        }

        if (g04 == "G04" && g10 == "G10" && g09 == null) {
            tg04 = "Payudara mulai membesar kanan dan kiri";
            tg10 = "Terjadi peningkatan tinggi badan";
            ng03 = "66";
            s03 = "Gejala yang dialami:\n" +
                    "-Payudara mulai membesar kanan dan kiri\n" +
                    "-Terjadi peningkatan tinggi badan\n" +
                    "\n" +
                    "Pertumbuhan payudara dan peningkatan tinggi badan yang terjadi sebelum masuknya pubertas adalah hal yang umum terjadi. Hal ini terjadi karena adanya perubahan hormon dalam tubuh.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kesehatan dengan rutin berolahraga dan mengonsumsi makanan yang sehat dan bergizi. Hindari makanan cepat saji dan minuman bersoda yang dapat memperburuk kondisi kesehatankamu.\n" +
                    "2. Jangan khawatir jika terjadi perbedaan ukuran payudara karena hal ini cukup umum terjadi dan tidak perlu menjadi suatu masalah yang serius. Namun, jika terdapat rasa sakit atau benjolan pada payudara, sebaiknya segera berkonsultasi dengan dokter.\n" +
                    "2. Perhatikan postur tubuhkamu dan hindari membungkuk atau mengenakan pakaian yang terlalu ketat untuk menjaga kesehatan tulang dan postur tubuh.\n" +
                    "3. Terakhir, jangan lupa untuk menjaga kesehatan mental dengan melakukan kegiatan yang menyenangkan dan meredakan stres, seperti olahraga, meditasi, atau kegiatan lain yangkamu sukai.\n";
        }

        if (g09 == "G09" && g10 == "G10" && g04 == null) {
            tg09 = "Terjadi peningkatan kenaikan berat badan";
            tg10 = "Terjadi peningkatan tinggi badan";
            ng03 = "66";
            s03 = "Gejala yang dialami:\n" +
                    "-Terjadi peningkatan kenaikan berat badan\n" +
                    "-Terjadi peningkatan tinggi badan\n" +
                    "\n" +
                    "Peningkatan berat badan dan peningkatan tinggi badan yang terjadi sebelum masuknya pubertas adalah hal yang umum terjadi. Hal ini terjadi karena adanya perubahan hormon dalam tubuh.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kesehatan dengan rutin berolahraga dan mengonsumsi makanan yang sehat dan bergizi. Hindari makanan cepat saji dan minuman bersoda yang dapat memperburuk kondisi kesehatankamu.\n" +
                    "2. Jangan khawatir jika terjadi perbedaan ukuran payudara karena hal ini cukup umum terjadi dan tidak perlu menjadi suatu masalah yang serius. Namun, jika terdapat rasa sakit atau benjolan pada payudara, sebaiknya segera berkonsultasi dengan dokter.\n" +
                    "2. Perhatikan postur tubuhkamu dan hindari membungkuk atau mengenakan pakaian yang terlalu ketat untuk menjaga kesehatan tulang dan postur tubuh.\n" +
                    "3. Terakhir, jangan lupa untuk menjaga kesehatan mental dengan melakukan kegiatan yang menyenangkan dan meredakan stres, seperti olahraga, meditasi, atau kegiatan lain yangkamu sukai.\n";
        }

        if (g04 == "G04" && g09 == null && g10 == null) {
            tg04 = "Payudara mulai membesar kanan dan kiri";
            ng03 = "33";
            s03 = "Gejala yang dialami:\n" +
                    "-Payudara mulai membesar kanan dan kiri\n" +
                    "\n" +
                    "Pertumbuhan payudara yang terjadi sebelum masuknya pubertas adalah hal yang umum terjadi. Hal ini terjadi karena adanya perubahan hormon dalam tubuh.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kesehatan dengan rutin berolahraga dan mengonsumsi makanan yang sehat dan bergizi. Hindari makanan cepat saji dan minuman bersoda yang dapat memperburuk kondisi kesehatankamu.\n" +
                    "2. Jangan khawatir jika terjadi perbedaan ukuran payudara karena hal ini cukup umum terjadi dan tidak perlu menjadi suatu masalah yang serius. Namun, jika terdapat rasa sakit atau benjolan pada payudara, sebaiknya segera berkonsultasi dengan dokter.\n" +
                    "2. Perhatikan postur tubuhkamu dan hindari membungkuk atau mengenakan pakaian yang terlalu ketat untuk menjaga kesehatan tulang dan postur tubuh.\n" +
                    "3. Terakhir, jangan lupa untuk menjaga kesehatan mental dengan melakukan kegiatan yang menyenangkan dan meredakan stres, seperti olahraga, meditasi, atau kegiatan lain yangkamu sukai.\n";
        }

        if (g09 == "G09" && g04 == null && g10 == null) {
            tg09 = "Terjadi peningkatan kenaikan berat badan";
            ng03 = "33";
            s03 = "Gejala yang dialami:\n" +
                    "-Terjadi peningkatan kenaikan berat badan\n" +
                    "\n" +
                    "Peningkatan berat badan yang terjadi sebelum masuknya pubertas adalah hal yang umum terjadi. Hal ini terjadi karena adanya perubahan hormon dalam tubuh.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kesehatan dengan rutin berolahraga dan mengonsumsi makanan yang sehat dan bergizi. Hindari makanan cepat saji dan minuman bersoda yang dapat memperburuk kondisi kesehatankamu.\n" +
                    "2. Jangan khawatir jika terjadi perbedaan ukuran payudara karena hal ini cukup umum terjadi dan tidak perlu menjadi suatu masalah yang serius. Namun, jika terdapat rasa sakit atau benjolan pada payudara, sebaiknya segera berkonsultasi dengan dokter.\n" +
                    "2. Perhatikan postur tubuhkamu dan hindari membungkuk atau mengenakan pakaian yang terlalu ketat untuk menjaga kesehatan tulang dan postur tubuh.\n" +
                    "3. Terakhir, jangan lupa untuk menjaga kesehatan mental dengan melakukan kegiatan yang menyenangkan dan meredakan stres, seperti olahraga, meditasi, atau kegiatan lain yangkamu sukai.\n";
        }

        if (g10 == "G10" && g09 == null && g04 == null) {
            tg10 = "Terjadi peningkatan tinggi badan";
            ng03 = "33";
            s03 = "Gejala yang dialami:\n" +
                    "-Terjadi peningkatan tinggi badan\n" +
                    "\n" +
                    "Peningkatan tinggi badan yang terjadi sebelum masuknya pubertas adalah hal yang umum terjadi. Hal ini terjadi karena adanya perubahan hormon dalam tubuh.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kesehatan dengan rutin berolahraga dan mengonsumsi makanan yang sehat dan bergizi. Hindari makanan cepat saji dan minuman bersoda yang dapat memperburuk kondisi kesehatankamu.\n" +
                    "2. Jangan khawatir jika terjadi perbedaan ukuran payudara karena hal ini cukup umum terjadi dan tidak perlu menjadi suatu masalah yang serius. Namun, jika terdapat rasa sakit atau benjolan pada payudara, sebaiknya segera berkonsultasi dengan dokter.\n" +
                    "2. Perhatikan postur tubuhkamu dan hindari membungkuk atau mengenakan pakaian yang terlalu ketat untuk menjaga kesehatan tulang dan postur tubuh.\n" +
                    "3. Terakhir, jangan lupa untuk menjaga kesehatan mental dengan melakukan kegiatan yang menyenangkan dan meredakan stres, seperti olahraga, meditasi, atau kegiatan lain yangkamu sukai.\n";
        }

        if (g05 == "G05" && g06 == "G06") {
            tg05 = "Pada area ketiak mulai tumbuh bulu halus";
            tg06 = "Pada organ kelamin mulai tumbuh bulu halus";
            ng04 = "100";
            s04 = "Gejala yang dialami:\n" +
                    "-Pada area ketiak mulai tumbuh bulu halus\n" +
                    "-Pada organ kelamin mulai tumbuh bulu halus\n" +
                    "\n" +
                    "Tumbuhnya bulu halus pada area ketiak dan kemaluan adalah tanda-tanda awal bahwa pubertas akan segera datang.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan dengan rutin membersihkan area tersebut.\n" +
                    "2. Hindari mencukur bulu di area tersebut terlalu sering, karena hal ini dapat menyebabkan iritasi kulit dan infeksi. Jikakamu ingin mencukur bulu, pastikankamu menggunakan alat yang bersih dan steril.\n" +
                    "3. Jangan lupa untuk menjaga kebersihan pribadi dengan mengganti pakaian dalam secara teratur dan hindari berbagi pakaian atau handuk dengan orang lain untuk mencegah penyebaran bakteri dan infeksi.\n" +
                    "4. Terakhir, jikakamu mengalami perubahan yang tidak biasa seperti gatal atau bengkak pada area tersebut, sebaiknya segera berkonsultasi dengan dokter untuk mendapatkan perawatan yang tepat.\n";
        }

        if (g05 == "G05" && g06 == null) {
            tg05 = "Pada area ketiak mulai tumbuh bulu halus";
            ng04 = "50";
            s04 = "Gejala yang dialami:\n" +
                    "-Pada area ketiak mulai tumbuh bulu halus\n" +
                    "\n" +
                    "Tumbuhnya bulu halus pada area ketiak adalah tanda-tanda awal bahwa pubertas akan segera datang.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan dengan rutin membersihkan area tersebut.\n" +
                    "2. Hindari mencukur bulu di area tersebut terlalu sering, karena hal ini dapat menyebabkan iritasi kulit dan infeksi. Jikakamu ingin mencukur bulu, pastikankamu menggunakan alat yang bersih dan steril.\n" +
                    "3. Jangan lupa untuk menjaga kebersihan pribadi dengan mengganti pakaian dalam secara teratur dan hindari berbagi pakaian atau handuk dengan orang lain untuk mencegah penyebaran bakteri dan infeksi.\n" +
                    "4. Terakhir, jikakamu mengalami perubahan yang tidak biasa seperti gatal atau bengkak pada area tersebut, sebaiknya segera berkonsultasi dengan dokter untuk mendapatkan perawatan yang tepat.\n";
        }

        if (g06 == "G06" && g05 == null) {
            tg06 = "Pada organ kelamin mulai tumbuh bulu halus";
            ng04 = "50";
            s04 = "Gejala yang dialami:\n" +
                    "-Pada organ kelamin mulai tumbuh bulu halus\n" +
                    "\n" +
                    "Tumbuhnya bulu halus pada area kemaluan adalah tanda-tanda awal bahwa pubertas akan segera datang.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kebersihan dengan rutin membersihkan area tersebut.\n" +
                    "2. Hindari mencukur bulu di area tersebut terlalu sering, karena hal ini dapat menyebabkan iritasi kulit dan infeksi. Jikakamu ingin mencukur bulu, pastikankamu menggunakan alat yang bersih dan steril.\n" +
                    "3. Jangan lupa untuk menjaga kebersihan pribadi dengan mengganti pakaian dalam secara teratur dan hindari berbagi pakaian atau handuk dengan orang lain untuk mencegah penyebaran bakteri dan infeksi.\n" +
                    "4. Terakhir, jikakamu mengalami perubahan yang tidak biasa seperti gatal atau bengkak pada area tersebut, sebaiknya segera berkonsultasi dengan dokter untuk mendapatkan perawatan yang tepat.\n";
        }

        if (g07 == "G07") {
            tg07 = "Ada perubahan suara yang lebih halus dan lembut";
            ng05 = "100";
            s05 = "Gejala yang dialami:\n" +
                    "-Ada perubahan suara yang lebih halus dan lembut\n" +
                    "\n" +
                    "Perubahan suara menjadi lebih halus dan lembut adalah salah satu ciri-ciri pubertas.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Solusi terbaik adalah menjaga kesehatan dengan mengonsumsi makanan yang sehat dan bergizi, serta rutin berolahraga untuk menjaga kesehatan tubuh secara keseluruhan.\n" +
                    "2. Jangan merasa khawatir jika terjadi perubahan suara karena hal ini merupakan proses yang normal terjadi saat pubertas.\n" +
                    "3. Jangan memaksakan suara saat berbicara atau bernyanyi karena hal ini dapat memperburuk kondisi suara dan menyebabkan iritasi pada tenggorokan.\n" +
                    "4. Terakhir, Jangan ragu untuk berkonsultasi dengan dokter atau spesialis kesehatan jikakamu memiliki pertanyaan atau kekhawatiran mengenai perubahan suarakamu.\n";
        }

        if (g08 == "G08") {
            tg08 = "Mengalami keputihan";
            ng06 = "100";
            s06 = "Gejala yang dialami:\n" +
                    "-Mengalami keputihan\n" +
                    "\n" +
                    "Keputihan adalah hal yang normal terjadi saat tubuhmu berkembang menjadi seorang wanita.\n" +
                    "Keputihan merupakan proses alami tubuh untuk membersihkan dan melindungi organ intimmu. Ini adalah tanda bahwa sistem reproduksi tubuhmu sedang berfungsi dengan baik. Keputihan biasanya memiliki warna yang jernih atau sedikit keruh, dan mungkin memiliki sedikit aroma yang lembut.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    "1. Rutin menjaga kebersihan daerah intim dengan mencuci area tersebut secara lembut menggunakan air bersih dan sabun yang lembut.\n" +
                    "2. Pakailah pakaian dalam yang bersih dan terbuat dari bahan yang menyerap keringat, seperti katun.\n" +
                    "3. Batasi konsumsi gula dan karbohidrat olahan, karena hal ini dapat meningkatkan risiko infeksi pada daerah intim.\n" +
                    "4. Jikakamu merasa khawatir atau mengalami gejala yang tidak normal, segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan diagnosis dan perawatan yang sesuai.\n";
        }
        if (g11 == "G11") {
            tg11 = "Mulai timbul bau badan";
            ng07 = "100";
            s07 = "Gejala yang dialami:\n" +
                    "-Mulai timbul bau badan\n" +
                    "\n" +
                    "Perubahan bau badan pada wanita sebenarnya merupakan tanda pubertas yang sudah terjadi. Pada masa pubertas, kelenjar keringat di tubuh mengalami perubahan dan memproduksi lebih banyak keringat yang mengandung bahan kimia yang memicu bau badan. Hal ini biasanya terjadi pada usia 8-13 tahun pada anak perempuan, meskipun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
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

        if (g12 == "G12" && g13 == "G13" && g14 == "G14" && g15 == "G15") {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg13 = "Suasana hati mudah berubah";
            tg14 = "Lebih memperhatikan penampilan";
            tg15 = "Mudah mengekspresikan diri";
            ng08 = "100";
            s08 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Suasana hati mudah berubah\n" +
                    "-Lebih memperhatikan penampilan\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Perubahan perilaku seperti tertarik pada lawan jenis, suasana hati yang mudah berubah, lebih memperhatikan penampilan, dan mudah mengekspresikan diri adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g12 == "G12" && g13 == "G13" && g14 == "G14" && g15 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg13 = "Suasana hati mudah berubah";
            tg14 = "Lebih memperhatikan penampilan";
            ng08 = "75";
            s08 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Suasana hati mudah berubah\n" +
                    "-Lebih memperhatikan penampilan\n" +
                    "\n" +
                    "Perubahan perilaku seperti tertarik pada lawan jenis, suasana hati yang mudah berubah, dan lebih memperhatikan penampilan adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g12 == "G12" && g13 == "G13" && g15 == "G15" && g14 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg13 = "Suasana hati mudah berubah";
            tg15 = "Mudah mengekspresikan diri";
            ng08 = "75";
            s08 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Suasana hati mudah berubah\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Perubahan perilaku seperti tertarik pada lawan jenis, suasana hati yang mudah berubah dan mudah mengekspresikan diri adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g13 == "G13" && g14 == "G14" && g15 == "G15" && g12 == null) {
            tg13 = "Suasana hati mudah berubah";
            tg14 = "Lebih memperhatikan penampilan";
            tg15 = "Mudah mengekspresikan diri";
            ng08 = "75";
            s08 = "Gejala yang dialami:\n" +
                    "-Suasana hati mudah berubah\n" +
                    "-Lebih memperhatikan penampilan\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Perubahan perilaku seperti suasana hati yang mudah berubah, lebih memperhatikan penampilan, dan mudah mengekspresikan diri adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g12 == "G12" && g14 == "G14" && g15 == "G15" && g13 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg14 = "Lebih memperhatikan penampilan";
            tg15 = "Mudah mengekspresikan diri";
            ng08 = "75";
            s08 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Lebih memperhatikan penampilan\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Perubahan perilaku seperti tertarik pada lawan jenis, lebih memperhatikan penampilan, dan mudah mengekspresikan diri adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g12 == "G12" && g13 == "G13" && g14 == null && g15 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg13 = "Suasana hati mudah berubah";
            ng08 = "50";
            s08 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Suasana hati mudah berubah\n" +
                    "\n" +
                    "Perubahan perilaku seperti tertarik pada lawan jenis dan suasana hati yang mudah berubah adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g12 == "G12" && g14 == "G14" && g13 == null && g15 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg14 = "Lebih memperhatikan penampilan";
            ng08 = "50";
            s08 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Lebih memperhatikan penampilan\n" +
                    "\n" +
                    "Perubahan perilaku seperti tertarik pada lawan jenis dan lebih memperhatikan penampilan adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g12 == "G12" && g15 == "G15" && g14 == null && g13 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            tg15 = "Mudah mengekspresikan diri";
            ng08 = "50";
            s08 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Perubahan perilaku seperti tertarik pada lawan jenis dan mudah mengekspresikan diri adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g13 == "G13" && g14 == "G14" && g12 == null && g15 == null) {
            tg13 = "Suasana hati mudah berubah";
            tg14 = "Lebih memperhatikan penampilan";
            ng08 = "50";
            s08 = "Gejala yang dialami:\n" +
                    "-Suasana hati mudah berubah\n" +
                    "-Lebih memperhatikan penampilan\n" +
                    "\n" +
                    "Perubahan perilaku seperti suasana hati yang mudah berubah dan lebih memperhatikan penampilan adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g13 == "G13" && g15 == "G15" && g14 == null && g12 == null) {
            tg13 = "Suasana hati mudah berubah";
            tg15 = "Mudah mengekspresikan diri";
            ng08 = "50";
            s08 = "Gejala yang dialami:\n" +
                    "-Suasana hati mudah berubah\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Perubahan perilaku seperti suasana hati yang mudah berubah dan mudah mengekspresikan diri adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g14 == "G14" && g15 == "G15" && g12 == null && g13 == null) {
            tg14 = "Lebih memperhatikan penampilan";
            tg15 = "Mudah mengekspresikan diri";
            ng08 = "50";
            s08 = "Gejala yang dialami:\n" +
                    "-Lebih memperhatikan penampilan\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Perubahan perilaku seperti lebih memperhatikan penampilan dan mudah mengekspresikan diri adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g12 == "G12" && g13 == null && g14 == null && g15 == null) {
            tg12 = "Mulai tertarik dengan lawan jenis";
            ng08 = "25";
            s08 = "Gejala yang dialami:\n" +
                    "-Mulai tertarik dengan lawan jenis\n" +
                    "\n" +
                    "Perubahan perilaku seperti tertarik pada lawan jenis adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g13 == "G13" && g12 == null && g14 == null && g15 == null) {
            tg13 = "Suasana hati mudah berubah";
            ng08 = "25";
            s08 = "Gejala yang dialami:\n" +
                    "-Suasana hati mudah berubah\n" +
                    "\n" +
                    "Perubahan perilaku seperti suasana hati yang mudah berubah adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g14 == "G14" && g13 == null && g12 == null && g15 == null) {
            tg14 = "Lebih memperhatikan penampilan";
            ng08 = "25";
            s08 = "Gejala yang dialami:\n" +
                    "-Lebih memperhatikan penampilan\n" +
                    "\n" +
                    "Perubahan perilaku seperti lebih memperhatikan penampilan adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        if (g15 == "G15" && g13 == null && g14 == null && g12 == null) {
            tg15 = "Mudah mengekspresikan diri";
            ng08 = "25";
            s08 = "Gejala yang dialami:\n" +
                    "-Mudah mengekspresikan diri\n" +
                    "\n" +
                    "Perubahan perilaku seperti mudah mengekspresikan diri adalah tanda-tanda bahwa pubertas sedang terjadi. Pada masa pubertas, anak mengalami perubahan fisik, emosional, dan psikologis yang memengaruhi bagaimana mereka berinteraksi dengan dunia di sekitar mereka. Perubahan ini sering kali terjadi pada usia 8-13 tahun pada anak perempuan, namun dapat terjadi pada usia yang lebih awal atau lebih lambat tergantung pada faktor individu.\n" +
                    "\n" +
                    "Berikut beberapa solusi:\n" +
                    " 1. Berikan dukungan emosional dan jangan ragu untuk berbicara dengan anak tentang perubahan yang terjadi pada tubuh dan emosinya.\n" +
                    " 2. memperhatikan aspek sosial seperti kegiatan sosial dan hubungan dengan teman sebaya.\n" +
                    " 3. Mengembangkan kepercayaan diri dan merasa nyaman dengan diri mereka sendiri dengan cara yang positif dan sehat.\n" +
                    " 4.Segera konsultasikan dengan dokter atau spesialis kesehatan yang dapat memberikan saran dan perawatan yang sesuai.\n";
        }

        final String nama = this.tvNama.getText().toString().trim();
        final String usia = this.tvUsia.getText().toString().trim();
        final String jk = this.tvJk.getText().toString().trim();

        Intent lanjut = new Intent(PerempuanActivity.this, HasilScreeningActivity.class);

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
        lanjut.putExtra(HasilScreeningActivity.EXTRA_N08, ng08);

        lanjut.putExtra(HasilScreeningActivity.EXTRA_S01, s01);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S02, s02);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S03, s03);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S04, s04);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S05, s05);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S06, s06);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S07, s07);
        lanjut.putExtra(HasilScreeningActivity.EXTRA_S08, s08);

        startActivity(lanjut);
        finish();
    }

    private void getListData() {
        listP = databaseHelper.getDaftarGejalaPerempuan();
        if (listP.size() == 0) {
            recyclerView.setVisibility(View.GONE);
        } else {
            recyclerView.setVisibility(View.VISIBLE);
            adapterP = new AdapterPerempuan(this, listP);
            recyclerView.setAdapter(adapterP);
        }
    }
}