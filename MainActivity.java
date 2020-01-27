// Carli Shires

package com.example.splatoon2randomier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

class Weapon {
    String name = "";
    String type = "";
}

public class MainActivity extends AppCompatActivity {

    public static final Weapon[] WEAPONS = new Weapon[139];



    public static void createArray(){
        // construct all objects in arrayr
        for (int i=0; i<WEAPONS.length; i++) {
            WEAPONS[i]= new Weapon();
        }

        // Brellas
        for (int i=0; i<9; i++ ) {
            WEAPONS[i].type = "Brella";
        }

        WEAPONS[0].name = "Hero Brella Replica";
        WEAPONS[1].name = "Kensa Undercover Brella";
        WEAPONS[2].name = "Sorella Brella";
        WEAPONS[3].name = "Splat Brella";
        WEAPONS[4].name = "Tenta Brella";
        WEAPONS[5].name = "Tenta Camo Brella";
        WEAPONS[6].name = "Tenta Sorella Brella";
        WEAPONS[7].name = "Undercover Brella";
        WEAPONS[8].name = "Undercover Sorella Brella";

        // Chargers
        for (int i=9; i<28; i++ ) {
            WEAPONS[i].type = "Charger";
        }

        WEAPONS[9].name =  "Bamboozler 14 Mk I";
        WEAPONS[10].name = "Bamboozler 14 Mk II";
        WEAPONS[11].name = "Bamboozler 14 Mk III";
        WEAPONS[12].name = "Classic Squiffer";
        WEAPONS[13].name =  "Custom E-Liter 4K";
        WEAPONS[14].name =  "Custom E-Liter 4K Scope";
        WEAPONS[15].name = "Custom Goo Tuber";
        WEAPONS[16].name = "E-liter 4k";
        WEAPONS[17].name = "E-liter 4k Scope";
        WEAPONS[18].name = "Firefin Splat Charger";
        WEAPONS[19].name = "Firefin Splatterscope";
        WEAPONS[20].name = "Fresh Squiffer";
        WEAPONS[21].name = "Goo Tuber";
        WEAPONS[22].name = "Hero Charger Replica";
        WEAPONS[23].name = "Kensa Charger";
        WEAPONS[24].name = "Kensa Splatterscope";
        WEAPONS[25].name = "New Squiffer";
        WEAPONS[26].name = "Splat Charger";
        WEAPONS[27].name = "Splatterscope";

        // Dualies
        for (int i=28; i<42; i++ ) {
            WEAPONS[i].type = "Dualie";
        }

        WEAPONS[28].name = "Clear Dapple Dualies";
        WEAPONS[29].name = "Custom Dualie Squelchers";
        WEAPONS[30].name = "Dapple Dualies";
        WEAPONS[31].name = "Dapple Dualies Nouveau";
        WEAPONS[32].name = "Dark Tetra Dualies";
        WEAPONS[33].name = "Dualie Squelchers";
        WEAPONS[34].name = "Enperry Splat Dualies";
        WEAPONS[35].name = "Glooga Dualies";
        WEAPONS[36].name = "Glooga Dualies Deco";
        WEAPONS[37].name = "Hero Dualie Replicas";
        WEAPONS[38].name = "Kensa Glooga Dualies";
        WEAPONS[39].name = "Kensa Splat Dualies";
        WEAPONS[40].name = "Light Tetra Dualies";
        WEAPONS[41].name = "Splat Dualies";

        // Rollers

        for (int i=42; i<60; i++ ) {
            WEAPONS[i].type = "Roller";
        }
        WEAPONS[42].name = "Carbon Roller";
        WEAPONS[43].name = "Carbon Roller Deco";
        WEAPONS[44].name = "Dynamo Roller";
        WEAPONS[45].name = "Flingza Roller";
        WEAPONS[46].name = "Foil Flingza Roller";
        WEAPONS[47].name = "Gold Dynamo Roller";
        WEAPONS[48].name = "Hero Roller Replica";
        WEAPONS[49].name = "Herobrush Replica";
        WEAPONS[50].name = "Inkbrush";
        WEAPONS[51].name = "Inkbrush Nouveau";
        WEAPONS[52].name = "Kensa Dynamo Roller";
        WEAPONS[53].name = "Kensa Octobrush";
        WEAPONS[54].name = "Kensa Splat Roller";
        WEAPONS[55].name = "Krak-On Splat Roller";
        WEAPONS[56].name = "Octobrush";
        WEAPONS[57].name = "Octobrush Nouveau";
        WEAPONS[58].name = "Permanent Inkbrush";
        WEAPONS[59].name = "Splat Roller";

        // Shooters
        for (int i=60; i<113; i++ ) {
            WEAPONS[i].type = "Shooter";
        }
        WEAPONS[60].name = ".52 Gal";
        WEAPONS[61].name = ".52 Gal Deco";
        WEAPONS[62].name = ".96 Gal";
        WEAPONS[63].name = ".96 Gal Deco";
        WEAPONS[64].name = "Aerospray MG";
        WEAPONS[65].name = "Aerospray PG";
        WEAPONS[66].name = "Arospray RG";
        WEAPONS[67].name = "Blaster";
        WEAPONS[68].name = "Cherry H-3 Nozzlenose";
        WEAPONS[69].name = "Clash Blaster";
        WEAPONS[70].name = "Clash Blaster Neo";
        WEAPONS[71].name = "Custom Blaster";
        WEAPONS[72].name = "Custom Jet Squelcher";
        WEAPONS[73].name = "Custom Range Blaster";
        WEAPONS[74].name = "Custom Splattershot Jr.";
        WEAPONS[75].name = "Foil Squeezer";
        WEAPONS[76].name = "Forge Splattershot Pro";
        WEAPONS[77].name = "Grim Range Blaster";
        WEAPONS[78].name = "H-3 Nozzlenoze";
        WEAPONS[79].name = "H-3 Nozzlenoze D";
        WEAPONS[80].name = "Hero Blaster Replica";
        WEAPONS[81].name = "Hero Shot Replica";
        WEAPONS[82].name = "Jet Squelcher";
        WEAPONS[83].name = "Kensa .52 Gal";
        WEAPONS[84].name = "Kensa L-3 Nozzlenose";
        WEAPONS[85].name = "Kensa Luna Blaster";
        WEAPONS[86].name = "Kensa Rapid Blaster";
        WEAPONS[87].name = "Kensa Splattershot";
        WEAPONS[88].name = "Kensa Splattershot Jr.";
        WEAPONS[89].name = "Kensa Splattershot Pro";
        WEAPONS[90].name = "L-3 Nozzlenose";
        WEAPONS[91].name = "L-3 Nozzlenose D";
        WEAPONS[92].name = "Luna Blaster";
        WEAPONS[93].name = "Luna Blaster Neo";
        WEAPONS[94].name = "N-ZAP '83";
        WEAPONS[95].name = "N-ZAP '85";
        WEAPONS[96].name = "N-ZAP '89";
        WEAPONS[97].name = "Neo Splash-o-matic";
        WEAPONS[98].name = "Neo Sploosh-o-matic";
        WEAPONS[99].name = "Octo Shot Replica";
        WEAPONS[100].name = "Range Blaster";
        WEAPONS[101].name = "Rapid Blaster";
        WEAPONS[102].name = "Rapid Blaster Deco";
        WEAPONS[103].name = "Rapid Blaster Pro";
        WEAPONS[104].name = "Rapid Blaster Pro Deco";
        WEAPONS[105].name = "Splash-o-matic";
        WEAPONS[106].name = "Splattershot";
        WEAPONS[107].name = "Splattershot Jr.";
        WEAPONS[108].name = "Splattershot Pro";
        WEAPONS[109].name = "Sploosh-o-matic";
        WEAPONS[110].name = "Sploosh-o-matic 7";
        WEAPONS[111].name = "Squeezer";
        WEAPONS[112].name = "Tentatek Splattershot";

        // Sloshers
        for (int i=113; i<126; i++ ) {
            WEAPONS[i].type = "Slosher";
        }

        WEAPONS[113].name = "Bloblobber";
        WEAPONS[114].name = "Bloblobber Deco";
        WEAPONS[115].name = "Custom Explosher";
        WEAPONS[116].name = "Explosher";
        WEAPONS[117].name = "Hero Slosher Replica";
        WEAPONS[118].name = "Kensa Sloshing Machine";
        WEAPONS[119].name = "Slosher";
        WEAPONS[120].name = "Slosher Deco";
        WEAPONS[121].name = "Sloshing Machine";
        WEAPONS[122].name = "Sloshing Machine Neo";
        WEAPONS[123].name = "Soda Slosher";
        WEAPONS[124].name = "Tri-Slosher";
        WEAPONS[125].name = "Tri-Slosher Nouveau";

        // Splattlings
        for (int i=126; i<139; i++ ) {
            WEAPONS[i].type = "Splattling";
        }
        WEAPONS[126].name = "Ballpoint Splattling";
        WEAPONS[127].name = "Ballpoint Splattling Nouveau";
        WEAPONS[128].name = "Custom Hydra Splattling";
        WEAPONS[129].name = "Heavy Splattling";
        WEAPONS[130].name = "Heavy Splattling Deco";
        WEAPONS[131].name = "Heavy Splattling Remix";
        WEAPONS[132].name = "Hero Splattling Replica";
        WEAPONS[133].name = "Hydra Splattling";
        WEAPONS[134].name = "Kensa Mini Splattling";
        WEAPONS[135].name = "Mini Splattling";
        WEAPONS[136].name = "Nautilus 47";
        WEAPONS[137].name = "Nautilus 79";
        WEAPONS[138].name = "Zink Mini Splattling";




    }

    public void showWeapon (View view) {

        TextView weaponView = (TextView)
                findViewById(R.id.textview_weapon);

        Random randnum = new Random();
        int randomInt = randnum.nextInt(139);

        weaponView.setText(WEAPONS[randomInt].name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createArray();
    }
}
