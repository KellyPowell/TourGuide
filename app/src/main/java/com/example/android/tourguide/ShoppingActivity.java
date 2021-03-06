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
                "For over three decades, they continue to offer the best " +
                        "selection of high quality, American-made crafts and fine jewelry anywhere " +
                        "on the Central Coast. Whether it's art glass, custom jewelry, wood, " +
                        "ceramics or enamel sculpture, they sell unique, fine quality crafts and " +
                        "provide exceptional personal service.",
                "geo:0,0?q=By+The+Bay+Gallery+Morro+Bay+CA", R.drawable.btb,
                "https://www.bythebaygallery.com/", "805-772-5563"));
        destinations.add(new Destination("COVE", "Pismo Beach",
                "COVE by Van Rozeboom Interiors is a full service interior " +
                        "design studio and home decor boutique in beautiful Pismo Beach.",
                "geo:0,0?q=880+Price+St+Pismo+Beach+California+93449", R.drawable.cove,
                "http://www.cove805.com/", "805-556-4325"));
        destinations.add(new Destination("BoltAbout", "San Luis Obispo",
                "BoltAbout leases electric bicycles on a monthly basis to provide" +
                        " customers with fun, fast, and sustainable transportation. The bikes reach " +
                        "speeds of 22 mph and have a battery range of 20-40 miles.",
                "geo:0,0?q=880+Price+St+Pismo+Beach+California+93449", R.drawable.ba,
                "https://boltabout.com/", "805-858-9702"));
        destinations.add(new Destination("Place with no address or phone", "ATown",
                "this is a place with no phone, website or address", R.drawable.bluerose));


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
