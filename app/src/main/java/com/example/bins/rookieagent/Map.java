package com.example.bins.rookieagent;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_about:
                new AlertDialog.Builder(this)
                        .setMessage(R.string.police_desc)
                        .setIcon(R.drawable.ic_policeman).setTitle(R.string.police_name)
                        .setPositiveButton(R.string.ok, null)
                        .show();
                break;
        }
        return true;
    }

    public void Ville(View view) {
        Intent intent = new Intent(this, Jeu.class);
        intent.putExtra("quartier", "Ville");
        startActivity(intent);
    }

    public void Police(View view) {
        Intent intent = new Intent(this, Jeu.class);
        intent.putExtra("quartier", "Police");
        startActivity(intent);
    }

    public void Gare(View view) {
        Intent intent = new Intent(this, Jeu.class);
        intent.putExtra("quartier", "Gare");
        startActivity(intent);
    }

    public void Hopital(View view) {
        Intent intent = new Intent(this, Jeu.class);
        intent.putExtra("quartier", "Hopital");
        startActivity(intent);
    }

    public void Plage(View view) {
        Intent intent = new Intent(this, Jeu.class);
        intent.putExtra("quartier", "Plage");
        startActivity(intent);
    }

    public void Port(View view) {
        Intent intent = new Intent(this, Jeu.class);
        intent.putExtra("quartier", "Port");
        startActivity(intent);
    }
}
