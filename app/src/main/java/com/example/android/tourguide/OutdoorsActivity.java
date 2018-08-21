package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class OutdoorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_list);

        // create a list of Desinations
        final ArrayList<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination("Montana de Oro", "Los Osos",
                "blah blah blah state park etc ",
                "3550 Pecho Valley Rd, Los Osos, CA 93402", R.drawable.mdo,
                "http://www.parks.ca.gov/?page_id=592"));
        destinations.add(new Destination("Oso Flaco Lake Trail", "Nipomo",
                ";lkadsg;kljads;lgkjadsg;lkjads;lgkjasd;glkjadsg;lkj",
                "Oso Flaco Lake Rd, Nipomo, CA 93420", R.drawable.oso,
                "https://www.alltrails.com/trail/us/california/oso-flaco-lake-trail"));
        destinations.add(new Destination("Morro Rock", "Morro Bay",
                "asd;flkjasdf;lkjasdf;lkjasdf;lkjasdf;lkjadsf;lkj",
                "1300 Embarcadero, Morro Bay, CA, 93442", R.drawable.morro_rock,
                "www.morrobay.org/things-to-do/outdoors/morro-rock"));
        destinations.add(new Destination("Elephant Seal Rookery", "San Simeon",
                "asd;flkasdflkjadsf;lkjasdfl;kajsdlk;ahhahhhhhh",
                "Piedras Blancas, San Simeon, CA 93452-9715", R.drawable.seal,
                "http://www.elephantseal.org/"));
        destinations.add(new Destination("Monarch Butterfly Grove", "Pismo Beach",
                "monarachs monarchs monarchs",
                "400 S Dolliver St, Pismo Beach, CA 93449", R.drawable.monarch,
                "http://www.monarchbutterfly.org/"));

        // Create an DestinationAdapater, whose data source is a list of Destinations. The
        // adapter knows how to create list items for each item in the list.
        DestinationAdapter adapter = new DestinationAdapter(this, destinations, R.color.OutdoorsColor);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the DestinationAdapter we created above, so that the
        // ListView will display list items for each Destination in the list.
        listView.setAdapter(adapter);

        View phoneIcon = (ImageView) findViewById(R.id.phone_icon);

        
    }

}