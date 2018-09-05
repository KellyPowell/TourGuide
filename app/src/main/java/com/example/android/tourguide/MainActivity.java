package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openOutdoorsActivity(View view) {
        Intent intent = new Intent(this, OutdoorsActivity.class);
        startActivity(intent);

    }

    public void openArtActivity(View view) {
        Intent intent = new Intent(this, ArtActivity.class);
        startActivity(intent);

    }

    public void openDiningActivity(View view) {
        Intent intent = new Intent(this, DiningActivity.class);
        startActivity(intent);

    }

    public void openShoppingActivity(View view) {
        Intent intent = new Intent(this, ShoppingActivity.class);
        startActivity(intent);

    }

}
