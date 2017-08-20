package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of events.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.hotel1_name, R.string.hotel1_address,
                R.string.hotel1_phone, R.drawable.hotel1, R.drawable.hotel_map1));
        places.add(new Places(R.string.hotel2_name, R.string.hotel2_address,
                R.string.hotel2_phone, R.drawable.hotel2, R.drawable.hotel_map2));
        places.add(new Places(R.string.hotel3_name, R.string.hotel3_address,
                R.string.hotel3_phone, R.drawable.hotel3, R.drawable.hotel_map3));
        places.add(new Places(R.string.hotel4_name, R.string.hotel4_address,
                R.string.hotel4_phone, R.drawable.hotel4, R.drawable.hotel_map4));
        places.add(new Places(R.string.hotel5_name, R.string.hotel5_address,
                R.string.hotel5_phone, R.drawable.hotel5, R.drawable.hotel_map5));
        places.add(new Places(R.string.hotel6_name, R.string.hotel6_address,
                R.string.hotel6_phone, R.drawable.hotel6, R.drawable.hotel_map6));
        places.add(new Places(R.string.hotel7_name, R.string.hotel7_address,
                R.string.hotel7_phone, R.drawable.hotel7, R.drawable.hotel_map7));
        places.add(new Places(R.string.hotel8_name, R.string.hotel8_address,
                R.string.hotel8_phone, R.drawable.hotel8, R.drawable.hotel_map8));
        places.add(new Places(R.string.hotel9_name, R.string.hotel9_address,
                R.string.hotel9_phone, R.drawable.hotel9, R.drawable.hotel_map9));
        places.add(new Places(R.string.hotel10_name, R.string.hotel10_address,
                R.string.hotel10_phone, R.drawable.hotel10, R.drawable.hotel_map10));


        // Create an {@link PlacesAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}