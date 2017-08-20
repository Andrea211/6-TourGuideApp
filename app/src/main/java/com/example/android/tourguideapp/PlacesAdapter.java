package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlacesAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Places} objects.
 */
public class PlacesAdapter extends ArrayAdapter<Places> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    /**
     * Create a new {@link PlacesAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param places          is the list of {@link Places}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public PlacesAdapter(Context context, ArrayList<Places> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Places currentPlaces = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID header_text_view.
        TextView headerTextView = (TextView) listItemView.findViewById(R.id.header_text_view);
        // Get the header from the currentPlace object and set this text on the TextView.
        headerTextView.setText(currentPlaces.getHeader());

        // Find the TextView in the list_item.xml layout with the ID address.
        TextView addressView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Check if an address is provided for this place or not
        if (currentPlaces.hasAddress()) {
            // If an address is available, display the provided address based on the resource ID
            addressView.setText(currentPlaces.getAddress());
            // Make sure the view is visible
            addressView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            LinearLayout addressLayout = (LinearLayout) listItemView.findViewById(R.id.address_layout);
            addressLayout.setVisibility(LinearLayout.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID phone.
        TextView phoneView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        // Check if a phone is provided for this place or not
        if (currentPlaces.hasPhone()) {
            // If a phone is available, display the provided phone based on the resource ID
            phoneView.setText(currentPlaces.getPhone());
            // Make sure the view is visible
            phoneView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            LinearLayout phoneLayout = (LinearLayout) listItemView.findViewById(R.id.phone_layout);
            phoneLayout.setVisibility(LinearLayout.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID prices.
        TextView pricesView = (TextView) listItemView.findViewById(R.id.prices_text_view);
        // Check if prices is provided for this place or not
        if (currentPlaces.hasPrices()) {
            // If prices is available, display the provided prices based on the resource ID
            pricesView.setText(currentPlaces.getPrices());
            // Make sure the view is visible
            pricesView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            LinearLayout pricesLayout = (LinearLayout) listItemView.findViewById(R.id.prices_layout);
            pricesLayout.setVisibility(LinearLayout.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID cuisine.
        TextView cuisineView = (TextView) listItemView.findViewById(R.id.cuisine_text_view);
        // Check if cuisine is provided for this place or not
        if (currentPlaces.hasCuisine()) {
            // If cuisine is available, display the provided cuisine based on the resource ID
            cuisineView.setText(currentPlaces.getCuisine());
            // Make sure the view is visible
            cuisineView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            LinearLayout cuisineLayout = (LinearLayout) listItemView.findViewById(R.id.cuisine_layout);
            cuisineLayout.setVisibility(LinearLayout.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID description.
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Check if description is provided for this place or not
        if (currentPlaces.hasDescription()) {
            // If description is available, display the provided description based on the resource ID
            descriptionView.setText(currentPlaces.getDescription());
            // Make sure the view is visible
            descriptionView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            LinearLayout descriptionLayout = (LinearLayout) listItemView.findViewById(R.id.description_layout);
            descriptionLayout.setVisibility(LinearLayout.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentPlaces.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlaces.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID map.
        ImageView mapView = (ImageView) listItemView.findViewById(R.id.map);
        // Check if an image is provided for this word or not
        if (currentPlaces.hasMap()) {
            // If a map is available, display the provided map based on the resource ID
            mapView.setImageResource(currentPlaces.getMap());
            // Make sure the view is visible
            mapView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            mapView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}