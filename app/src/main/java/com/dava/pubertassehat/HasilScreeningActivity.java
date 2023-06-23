package com.dava.pubertassehat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class HasilScreeningActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_JK = "extra_jk";
    public static final String EXTRA_N01 = "extra_n01";
    public static final String EXTRA_N02 = "extra_n02";
    public static final String EXTRA_N03 = "extra_n03";
    public static final String EXTRA_N04 = "extra_n04";
    public static final String EXTRA_N05 = "extra_n05";
    public static final String EXTRA_N06 = "extra_n06";
    public static final String EXTRA_N07 = "extra_n07";
    public static final String EXTRA_N08 = "extra_n08";
    public static final String EXTRA_S01 = "extra_s01";
    public static final String EXTRA_S02 = "extra_s02";
    public static final String EXTRA_S03 = "extra_s03";
    public static final String EXTRA_S04 = "extra_s04";
    public static final String EXTRA_S05 = "extra_s05";
    public static final String EXTRA_S06 = "extra_s06";
    public static final String EXTRA_S07 = "extra_s07";
    public static final String EXTRA_S08 = "extra_s08";

    private TextView tvNama, tvUsia, tvJk;
    private TextView tvp01, tvp02, tvp03, tvp04, tvp05, tvp06, tvp07, tvp08;
    private TextView tvh01, tvh02, tvh03, tvh04, tvh05, tvh06, tvh07, tvh08;
    private ProgressBar pb01, pb02, pb03, pb04, pb05, pb06, pb07, pb08;
    private LinearLayout llnoGejala, llhasil01, llhasil02, llhasil03, llhasil04, llhasil05, llhasil06, llhasil07, llhasil08;

    private Button btnSelesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_screening);

        btnSelesai = findViewById(R.id.btn_selesai);
        btnSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selesai = new Intent(HasilScreeningActivity.this, MenuActivity.class);
                startActivity(selesai);
                finish();
            }
        });

        tvNama = findViewById(R.id.tv_nama);
        tvUsia = findViewById(R.id.tv_usia);
        tvJk = findViewById(R.id.tv_jk);

        tvh01 = findViewById(R.id.tv_h01);
        tvh02 = findViewById(R.id.tv_h02);
        tvh03 = findViewById(R.id.tv_h03);
        tvh04 = findViewById(R.id.tv_h04);
        tvh05 = findViewById(R.id.tv_h05);
        tvh06 = findViewById(R.id.tv_h06);
        tvh07 = findViewById(R.id.tv_h07);
        tvh08 = findViewById(R.id.tv_h08);

        tvp01 = findViewById(R.id.tv_p01);
        tvp02 = findViewById(R.id.tv_p02);
        tvp03 = findViewById(R.id.tv_p03);
        tvp04 = findViewById(R.id.tv_p04);
        tvp05 = findViewById(R.id.tv_p05);
        tvp06 = findViewById(R.id.tv_p06);
        tvp07 = findViewById(R.id.tv_p07);
        tvp08 = findViewById(R.id.tv_p08);

        pb01 = findViewById(R.id.pb01);
        pb02 = findViewById(R.id.pb02);
        pb03 = findViewById(R.id.pb03);
        pb04 = findViewById(R.id.pb04);
        pb05 = findViewById(R.id.pb05);
        pb06 = findViewById(R.id.pb06);
        pb07 = findViewById(R.id.pb07);
        pb08 = findViewById(R.id.pb08);

        llnoGejala = findViewById(R.id.ll_noGejala);
        llhasil01 = findViewById(R.id.ll_hasil01);
        llhasil02 = findViewById(R.id.ll_hasil02);
        llhasil03 = findViewById(R.id.ll_hasil03);
        llhasil04 = findViewById(R.id.ll_hasil04);
        llhasil05 = findViewById(R.id.ll_hasil05);
        llhasil06 = findViewById(R.id.ll_hasil06);
        llhasil07 = findViewById(R.id.ll_hasil07);
        llhasil08 = findViewById(R.id.ll_hasil08);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String age = getIntent().getStringExtra(EXTRA_AGE);
        String jk = getIntent().getStringExtra(EXTRA_JK);

        String pe01 = getIntent().getStringExtra(EXTRA_N01);
        String pe02 = getIntent().getStringExtra(EXTRA_N02);
        String pe03 = getIntent().getStringExtra(EXTRA_N03);
        String pe04 = getIntent().getStringExtra(EXTRA_N04);
        String pe05 = getIntent().getStringExtra(EXTRA_N05);
        String pe06 = getIntent().getStringExtra(EXTRA_N06);
        String pe07 = getIntent().getStringExtra(EXTRA_N07);
        String pe08 = getIntent().getStringExtra(EXTRA_N08);

        String se01 = getIntent().getStringExtra(EXTRA_S01);
        String se02 = getIntent().getStringExtra(EXTRA_S02);
        String se03 = getIntent().getStringExtra(EXTRA_S03);
        String se04 = getIntent().getStringExtra(EXTRA_S04);
        String se05 = getIntent().getStringExtra(EXTRA_S05);
        String se06 = getIntent().getStringExtra(EXTRA_S06);
        String se07 = getIntent().getStringExtra(EXTRA_S07);
        String se08 = getIntent().getStringExtra(EXTRA_S08);

        String nama = name;
        String usia = age;
        String kelamin = jk;

        String p01 = pe01;
        String p02 = pe02;
        String p03 = pe03;
        String p04 = pe04;
        String p05 = pe05;
        String p06 = pe06;
        String p07 = pe07;
        String p08 = pe08;

        String s01 = se01;
        String s02 = se02;
        String s03 = se03;
        String s04 = se04;
        String s05 = se05;
        String s06 = se06;
        String s07 = se07;
        String s08 = se08;

        tvNama.setText(nama);
        tvUsia.setText(usia);
        tvJk.setText(kelamin);

        if (s01 == null && s02 == null && s03 == null && s04 == null && s05 == null && s06 == null && s07 == null && s08 == null) {
            llnoGejala.setVisibility(View.VISIBLE);
        }

        if (!(s01 == null)) {
            llhasil01.setVisibility(View.VISIBLE);
            tvh01.setText(s01);
            pb01.setProgress(Integer.parseInt(p01));
            tvp01.setText("Persentase : " + p01 +"%");
        }

        if (!(s02 == null)) {
            llhasil02.setVisibility(View.VISIBLE);
            tvh02.setText(s02);
            pb02.setProgress(Integer.parseInt(p02));
            tvp02.setText("Persentase : " + p02 +"%");
        }

        if (!(s03 == null)) {
            llhasil03.setVisibility(View.VISIBLE);
            tvh03.setText(s03);
            pb03.setProgress(Integer.parseInt(p03));
            tvp03.setText("Persentase : " + p03 +"%");
        }

        if (!(s04 == null)) {
            llhasil04.setVisibility(View.VISIBLE);
            tvh04.setText(s04);
            pb04.setProgress(Integer.parseInt(p04));
            tvp04.setText("Persentase : " + p04 +"%");
        }

        if (!(s05 == null)) {
            llhasil05.setVisibility(View.VISIBLE);
            tvh05.setText(s05);
            pb05.setProgress(Integer.parseInt(p05));
            tvp05.setText("Persentase : " + p05 +"%");
        }

        if (!(s06 == null)) {
            llhasil06.setVisibility(View.VISIBLE);
            tvh06.setText(s06);
            pb06.setProgress(Integer.parseInt(p06));
            tvp06.setText("Persentase : " + p06 +"%");
        }

        if (!(s07 == null)) {
            llhasil07.setVisibility(View.VISIBLE);
            tvh07.setText(s07);
            pb07.setProgress(Integer.parseInt(p07));
            tvp07.setText("Persentase : " + p07 +"%");
        }

        if (!(s08 == null)) {
            llhasil08.setVisibility(View.VISIBLE);
            tvh08.setText(s08);
            pb08.setProgress(Integer.parseInt(p08));
            tvp08.setText("Persentase : " + p08 +"%");
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        showToast("Silahkan tekan tombol SELESAI untuk kembali ke Menu Utama");
    }
}