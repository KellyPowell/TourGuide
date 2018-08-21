package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // create a list of Desinations
        final ArrayList<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination("Kelly Powell Glass", "Atascadero",
                "Kelly makes glass marbles. They're getting better.",
                "521 Buena Fortuna Cir, Atascadero, CA 93422", R.drawable.greenmib,
                "https://www.instagram.com/glassbykelly/", "715-379-1248"));
        destinations.add(new Destination("By the Bay Gallery", "Morro Bay",
                "For over three decades, they continue to offer the best selection" +
                        " of high quality, American-made crafts and fine jewelry anywhere on the " +
                        "Central Coast. Whether it's art glass, custom jewelry, wood, ceramics or " +
                        "enamel sculpture, they sell unique, fine quality crafts and provide " +
                        "exceptional personal service.",
                "895 Embarcadero, Morro Bay, CA 93442", R.drawable.btb,
                "https://www.bythebaygallery.com/", "805-772-5563"));
        destinations.add(new Destination("Kate Payne Glass", "Arroyo Grande",
                "Kate is an all-around bad motherfucker, and a natural at " +
                        "sculpting glass in the flame. Can't wait to see what she makes next!",
                "address", R.drawable.kate, "https://www.instagram.com/payne_inthe_glass/",
                "805-305-0505"));
        destinations.add(new Destination("Elevator Glass", "Pismo Beach",
                "OOhhh....that's how you fume. Damn, son.",R.drawable.brebes,
                "https://www.etsy.com/shop/Elevatorglass"));

        // Create an DestinationAdapater, whose data source is a list of Destinations. The
        // adapter knows how to create list items for each item in the list.
        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.ArtColor);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the DestinationAdapter we created above, so that the
        // ListView will display list items for each Destination in the list.
        listView.setAdapter(adapter);
    }

}
