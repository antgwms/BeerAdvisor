package com.hfad.beeradvisor;

// Unspecified imports were part of the project template

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

//import androidx.appcompat.widget.Toolbar;

// I should of added the below but leaving out for now as we have .AppCompatActivity
// import android.app.Activity;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {

    public void onClickFindBeer(View view) {
           //Get a reference to the Text View
          TextView brands = (TextView) findViewById(R.id.brands);
           //Get a reference to the spinner
           Spinner color = (Spinner) findViewById(R.id.color);
           //Get the selected item in the Spinner
           String beerType = String.valueOf(color.getSelectedItem());
           //Display the selected item;
           brands.setText(beerType);

      }
}