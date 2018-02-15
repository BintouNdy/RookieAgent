package com.example.bins.rookieagent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    private ImageView homeLogo;
    private Button btnStart;
    private Button btnQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        homeLogo = findViewById(R.id.homeLogo);
        btnStart = findViewById(R.id.btnStart);
        btnQuit = findViewById(R.id.btnQuit);
    }

    public void Commencer(View view) {
        Toast.makeText(Home.this, "Commencer", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void Option(View view) {
        Toast.makeText(Home.this, "Option", Toast.LENGTH_SHORT).show();
    }

    public void Quitte(View view) {
        Toast.makeText(Home.this, "information: votre partie n'a pas été sauvegardé", Toast.LENGTH_SHORT).show();
        finish();
        System.exit(0);
    }

}