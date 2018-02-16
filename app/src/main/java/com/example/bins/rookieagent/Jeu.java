package com.example.bins.rookieagent;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Jeu extends AppCompatActivity {

    private TextView textViewLocalisation;
    private ImageView imageViewMap;
    private Button btn_1_1;
    private Button btn_1_2;
    private Button btn_2_1;
    private Button btn_2_2;

    private ImageView imageViewPerso;
    private TextView textViewSurnom;
    private TextView textViewVie;
    private TextView textViewNiveau;
    private TextView textViewWeapon;
    private TextView textViewStress;
    private TextView textViewMoral;
    private TextView textViewLogic;

    Personnage perso = new Personnage(0, 1, 0, 0, 100, 0, 0, "Steven", "Yon");
    String quartier;
    int img;
    String localisation;
    String[] tab = {"btn1", "btn2", "btn3", "btn4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu);

        textViewLocalisation = findViewById(R.id.textViewLocalisation);
        imageViewMap = findViewById(R.id.imageViewMap);
        btn_1_1 = findViewById(R.id.btn_1_1);
        btn_1_2 = findViewById(R.id.btn_1_2);
        btn_2_1 = findViewById(R.id.btn_2_1);
        btn_2_2 = findViewById(R.id.btn_2_2);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                quartier = null;
            } else {
                quartier = extras.getString("quartier");
            }
        } else {
            quartier = (String) savedInstanceState.getSerializable("quartier");
        }

        assert quartier != null;
        switch (quartier) {
            case "Ville":
                img = R.drawable.map_part1;
                localisation = getString(R.string.circulation);
                tab = new String[]{"Faire la circulation", "Surveiller le quartier", "Faire de la prévention", "Evènement"};
                break;
            case "Police":
                img = R.drawable.map_part1;
                localisation = getString(R.string.police_station);
                tab = new String[]{"Entrainement", "Lécher les bottes du capitaine", "Apporter le café", "Trouver une enquête"};
                //region click
                btn_1_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(RandomNumber());
                        perso.addGunControl(RandomNumber());
                        perso.addLogic(RandomNumber());
                        Toast.makeText(Jeu.this, "Vous venez d'évoluer", Toast.LENGTH_SHORT).show();
                    }
                });
                btn_1_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addStressControl(RandomLecheur());
                        perso.addMoral(RandomLecheur());
                        perso.addExperience(RandomLecheur());
                    }
                });
                btn_2_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(2);
                    }
                });
                btn_2_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TO-DO
                    }
                });
                //endregion
                break;
            case "Gare":
                img = R.drawable.map_part2;
                localisation = getString(R.string.gare);
                tab = new String[]{"Surveiller la foule", "Aider des touristes", "Enqueter", "Evènement"};
                //region click
                btn_1_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addStressControl(RandomNumber());
                        perso.addLogic(RandomNumber());
                    }
                });
                btn_1_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addStressControl(RandomNumber());
                        perso.addMoral(RandomNumber());
                        perso.addExperience(RandomNumber());
                    }
                });
                btn_2_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(2);
                    }
                });
                btn_2_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TO-DO
                    }
                });
                //endregion
                break;
            case "Hopital":
                img = R.drawable.map_part2;
                localisation = getString(R.string.hopital);
                tab = new String[]{"Se soigner", "Parler au légiste", "Enqueter", "Evènement"};
                //region click
                btn_1_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(RandomNumber());
                        perso.addGunControl(RandomNumber());
                        perso.addLogic(RandomNumber());
                    }
                });
                btn_1_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addStressControl(RandomNumber());//TO-DO Valeur négatif
                        perso.addMoral(RandomNumber());//TO-DO Valeur négatif
                        perso.addExperience(RandomNumber());//TO-DO Valeur négatif
                    }
                });
                btn_2_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(2);
                    }
                });
                btn_2_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TO-DO
                    }
                });
                //endregion
                break;
            case "Plage":
                img = R.drawable.map_part3;
                localisation = getString(R.string.plage);
                tab = new String[]{"Surveiller les jeunes", "Faire un jogging", "Enqueter", "Evènement"};
                //region click
                btn_1_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(RandomNumber());
                        perso.addGunControl(RandomNumber());
                        perso.addLogic(RandomNumber());
                    }
                });
                btn_1_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addStressControl(RandomNumber());//TO-DO Valeur négatif
                        perso.addMoral(RandomNumber());//TO-DO Valeur négatif
                        perso.addExperience(RandomNumber());//TO-DO Valeur négatif
                    }
                });
                btn_2_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(2);
                    }
                });
                btn_2_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TO-DO
                    }
                });
                //endregion
                break;
            case "Port":
                img = R.drawable.map_part3;
                localisation = getString(R.string.port);
                tab = new String[]{"Aider la douane", "Surveiller les docks", "Enqueter", "Evènement"};
                //region click
                btn_1_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(RandomNumber());
                        perso.addGunControl(RandomNumber());
                        perso.addLogic(RandomNumber());
                    }
                });
                btn_1_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addStressControl(RandomNumber());//TO-DO Valeur négatif
                        perso.addMoral(RandomNumber());//TO-DO Valeur négatif
                        perso.addExperience(RandomNumber());//TO-DO Valeur négatif
                    }
                });
                btn_2_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        perso.addExperience(2);
                    }
                });
                btn_2_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TO-DO
                    }
                });
                //endregion
                break;
            default:
                img = R.drawable.img_404;
                localisation = "Vous êtes perdu";
                break;
        }
        textViewLocalisation.setText(localisation);
        imageViewMap.setImageResource(img);
        btn_1_1.setText(tab[0]);
        btn_1_2.setText(tab[1]);
        btn_2_1.setText(tab[2]);
        btn_2_2.setText(tab[3]);
    }

    public int RandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(15);
    }

    public int RandomLecheur() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(15 + 1 - 15) + 15;
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
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                LayoutInflater inflater = this.getLayoutInflater();
                View caracter_card = inflater.inflate(R.layout.alert_dialog_perso, null);

                builder.setView(caracter_card)
                        .setIcon(R.drawable.ic_contact).setTitle(perso.getName())
                        .setPositiveButton(R.string.ok, null)
                        .show();

                // récupération des objet de la pop-up
                imageViewPerso = caracter_card.findViewById(R.id.imageViewPerso);
                textViewSurnom = caracter_card.findViewById(R.id.textViewSurnom);
                textViewVie = caracter_card.findViewById(R.id.textViewVie);
                textViewNiveau = caracter_card.findViewById(R.id.textViewNiveau);
                textViewWeapon = caracter_card.findViewById(R.id.textViewWeapon);
                textViewStress = caracter_card.findViewById(R.id.textViewStress);
                textViewMoral = caracter_card.findViewById(R.id.textViewMoral);
                textViewLogic = caracter_card.findViewById(R.id.textViewLogic);

                // Mise a jour des champs avce les données du joueur
//                imageViewPerso
                textViewSurnom.setText(perso.getSurname());
                textViewVie.setText("" + perso.getHealth());
                textViewNiveau.setText("" + perso.getLevel());
                textViewWeapon.setText("" + perso.getGunControl());
                textViewStress.setText("" + perso.getStressControl());
                textViewMoral.setText("" + perso.getMoral());
                textViewLogic.setText("" + perso.getLogic());
                break;
        }
        return true;
    }

    // Cycle de vie
    @Override
    public void onSaveInstanceState(Bundle bagOfData) {
        bagOfData.putString("quartier", quartier);
        bagOfData.putString("localisation", localisation);
        super.onSaveInstanceState(bagOfData);
    }

    @Override
    public void onRestoreInstanceState(Bundle bagOfData) {
        super.onRestoreInstanceState(bagOfData);
        quartier = bagOfData.getString("quartier");
        quartier = bagOfData.getString("localisation");

    }
}