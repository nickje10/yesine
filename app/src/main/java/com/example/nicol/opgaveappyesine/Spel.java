package com.example.nicol.opgaveappyesine;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.Random;

public class Spel extends AppCompatActivity {
    String woorden[] = {"Kalasjnikov", "Polyethyleen", "Teleticketservice","draconisch"};
    String GekozenWoord;
    String DoorElkaarWoord;

    private String kiesWoord() {
        Random rn = new Random();
        int Rndidx = rn.nextInt(3);
                GekozenWoord = woorden[Rndidx] ;
        return GekozenWoord;
    }
    private String setLettersDoorElkaar(Gekozenwoord) {

        return  ;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}

