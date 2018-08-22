package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

// This is a custom adapter class that can provide the layout for each list item based
// on a data source, which is a list of Destination objects

public class DestinationAdapter extends ArrayAdapter<Destination> {

    // Resource ID for the background color for this list of words
    private int colorResourceId;


    // Create a new Destination object
    // @param context is the current context (i.e. Activity) that the adapter is being created in
    // @param destinationList is the list of Destinations to be displayed
    // @param colorResourceId is the resource ID for the background color for this list of word

    public DestinationAdapter(Activity context, ArrayList<Destination> destinationList, int colorResourceId) {
        super(context, 0, destinationList);
        this.colorResourceId = colorResourceId;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        // check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // set a click listener on the overall view
        listItemView.setOnClickListener(new View.OnClickListener() {
            // boolean to determine whether a list item has already been expanded
            private boolean isExpanded = false;

            @Override
            public void onClick(View v) {
                if (!isExpanded) {
                    v.findViewById(R.id.description_container).setVisibility(View.VISIBLE);
                    v.findViewById(R.id.collapse_arrow).setVisibility(View.VISIBLE);
                    v.findViewById(R.id.expand_arrow).setVisibility(View.GONE);
                    isExpanded = true;
                } else {
                    v.findViewById(R.id.description_container).setVisibility(View.GONE);
                    v.findViewById(R.id.collapse_arrow).setVisibility(View.GONE);
                    v.findViewById(R.id.expand_arrow).setVisibility(View.VISIBLE);
                    isExpanded = false;
                }
            }
        });

        // Get the Destination object located at this position in the list
        final Destination currentDestination = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID name_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Set this text on the name TextView
        nameTextView.setText(currentDestination.getDestinationName());

        // Find the TextView in the list_item.xml layout with the city text view
        TextView cityTextView = (TextView) listItemView.findViewById(R.id.city_text_view);
        // set this text on the city TextView
        cityTextView.setText(currentDestination.getCity());


        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Set this image on the ImageView
        imageView.setImageResource(currentDestination.getImageResourceId());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentDestination.getDestinationDescription());

        if (currentDestination.getHasPhone()) {
            // Find the ImageView in the list_item.xml layout with the ID phone_icon
            ImageView phoneIcon = (ImageView) listItemView.findViewById(R.id.phone_icon);

            // Set this image on the ImageView
            phoneIcon.setImageResource(R.drawable.baseline_phone_white_24dp);

        /*set a click listener to dial the phone number
        phoneIcon.setOnClickListener(new View.OnClickListener() {
            String phoneNumber = currentDestination.getDestinationPhone();
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
            }
        });*/

        }


        if (currentDestination.getHasWebsite()) {
            // Find the ImageView in the list_item.xml layout with the ID email_icon
            ImageView emailIcon = (ImageView) listItemView.findViewById(R.id.email_icon);

            // Set this image on the ImageView
            emailIcon.setImageResource(R.drawable.baseline_email_white_24dp);
        }


        if (currentDestination.getHasAddress()) {
            // Find the ImageView in the list_item.xml layout with the ID map_icon
            ImageView mapIcon = (ImageView) listItemView.findViewById(R.id.map_icon);

            // Set this image on the ImageView
            mapIcon.setImageResource(R.drawable.baseline_map_white_24dp);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        // set the background color of the text container View
        textContainer.setBackgroundColor(color);


        // Set the theme color for the description container
        View descriptionContainer = listItemView.findViewById(R.id.description_container);
        descriptionContainer.setBackgroundColor(color);


        // Return the whole list item layout so it can be shown in the ListView
        return listItemView;

    }
}
