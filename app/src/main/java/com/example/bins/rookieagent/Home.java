package com.example.bins.rookieagent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    private ImageView homeLogo;
    private Button btnStart;
    private Button btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeLogo = (ImageView) findViewById(R.id.homeLogo);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnQuit = (Button) findViewById(R.id.btnQuit);

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
