package com.example.bins.rookieagent;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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

    public void Commencer(View view) {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }

    public void Option(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Get the layout inflater
        LayoutInflater inflater = this.getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.alert_dialog_option, null))
                .setIcon(R.drawable.option).setTitle(R.string.option)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(Home.this, "Option enregistré", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    public void Quitte(View view) {
        new AlertDialog.Builder(this)
                .setMessage(R.string.exit_message)
                .setIcon(R.drawable.ic_police).setTitle(R.string.exit)
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton(R.string.cancel, null)
                .show();
    }

    public void sons(View view) {
        if (view.isActivated()){
            Toast.makeText(Home.this, "Sons déactivé", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(Home.this, "Sons activé", Toast.LENGTH_SHORT).show();
        }
    }
}