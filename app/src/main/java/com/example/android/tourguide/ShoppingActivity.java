package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // create a list of Desinations
        final ArrayList<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination("By the Bay Gallery", "Morro Bay",
                ";lkadsg;kljads;lgkjadsg;lkjads;lgkjasd;glkjadsg;lkj",
                "895 Embarcadero, Morro Bay, CA 93442", R.drawable.btb,
                "https://www.bythebaygallery.com/", "805-772-5563"));
        destinations.add(new Destination("COVE", "Pismo Beach",
                ";lkadsg;kljads;lgkjadsg;lkjads;lgkjasd;glkjadsg;lkj",
                "880 Price St, Pismo Beach, California 93449", R.drawable.cove,
                "http://www.cove805.com/", "805-556-4325"));


        // Create an DestinationAdapater, whose data source is a list of Destinations. The
        // adapter knows how to create list items for each item in the list.
        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.ShoppingColor);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the DestinationAdapter we created above, so that the
        // ListView will display list items for each Destination in the list.
        listView.setAdapter(adapter);
    }

}
