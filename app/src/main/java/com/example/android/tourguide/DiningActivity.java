package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DiningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // create a list of Desinations
        final ArrayList<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination("El Tapatio", "Guadalupe",
                "The best Mexican food I've ever had, period. No kidding. Hole " +
                        "in the wall family place in a sleepy little town. Trust me, it's worth the drive!",
                "geo:0,0?q=El+Tapatio+Guadalupe+CA", R.drawable.et,
                "https://www.yelp.com/biz/el-tapatio-guadalupe",
                "805-343-2850"));
        destinations.add(new Destination("Taco Temple", "Morro Bay",
                "Amazing fresh seafood, Mexican meals, and desserts.",
                "geo:0,0?q=Taco+Temple+Morro+Bay+CA", R.drawable.tt,
                "http://tacotemple.com", "805-772-4965"));
        destinations.add(new Destination("Wow Yanagi Sushi", "Pismo Beach",
                "My favorite Sushi spot on the Central Coast. Always fresh and " +
                        "delicious, with great service.",
                "geo:0,0?q=Wow+Yanagi+Sushi+Pismo+Beach+CA", R.drawable.sushi,
                "http://www.yanagisushigrill.com/", "805-489-6358"));
        destinations.add(new Destination("High Street Deli", "San Luis Obispo",
                "They're busy for a reason. My favorite sandwich is the Heisenburger. " +
                        "Do yourself a favor and get one!",
                "geo:0,0?q=High+Street+Deli+San+Luis+Obispo+CA",
                R.drawable.highst, "https://www.highstdeli.com/",
                "805-541-4738"));

        // Create an DestinationAdapater, whose data source is a list of Destinations. The
        // adapter knows how to create list items for each item in the list.
        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.DiningColor);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the DestinationAdapter we created above, so that the
        // ListView will display list items for each Destination in the list.
        listView.setAdapter(adapter);
    }

}