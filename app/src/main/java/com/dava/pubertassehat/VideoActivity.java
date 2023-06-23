package com.dava.pubertassehat;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    public Button btnKembali;
    VideoView vvPuber;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        btnKembali = findViewById(R.id.btn_kembali);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        vvPuber = findViewById(R.id.vv_puber);
        //String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        //Uri uri = Uri.parse(videoPath);
        //vvPuber.setVideoURI(uri);

        mediaController = new MediaController(this);
        vvPuber.setMediaController(mediaController);
        mediaController.setAnchorView(vvPuber);
        vvPuber.start();
    }
}