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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.restaurant1_name, R.string.restaurant1_address,
                R.string.restaurant1_phone, R.string.restaurant1_prices, R.string.restaurant1_cuisine,
                R.drawable.restaurant1, R.drawable.restaurant_map1));
        places.add(new Places(R.string.restaurant2_name, R.string.restaurant2_address,
                R.string.restaurant2_phone, R.string.restaurant2_prices, R.string.restaurant2_cuisine,
                R.drawable.restaurant2, R.drawable.restaurant_map2));
        places.add(new Places(R.string.restaurant3_name, R.string.restaurant3_address,
                R.string.restaurant3_phone, R.string.restaurant3_prices, R.string.restaurant3_cuisine,
                R.drawable.restaurant3, R.drawable.restaurant_map3));
        places.add(new Places(R.string.restaurant4_name, R.string.restaurant4_address,
                R.string.restaurant4_phone, R.string.restaurant4_prices, R.string.restaurant4_cuisine,
                R.drawable.restaurant4, R.drawable.restaurant_map4));
        places.add(new Places(R.string.restaurant5_name, R.string.restaurant5_address,
                R.string.restaurant5_phone, R.string.restaurant5_prices, R.string.restaurant5_cuisine,
                R.drawable.restaurant5, R.drawable.restaurant_map5));
        places.add(new Places(R.string.restaurant6_name, R.string.restaurant6_address,
                R.string.restaurant6_phone, R.string.restaurant6_prices, R.string.restaurant6_cuisine,
                R.drawable.restaurant6, R.drawable.restaurant_map6));
        places.add(new Places(R.string.restaurant7_name, R.string.restaurant7_address,
                R.string.restaurant7_phone, R.string.restaurant7_prices, R.string.restaurant7_cuisine,
                R.drawable.restaurant7, R.drawable.restaurant_map7));
        places.add(new Places(R.string.restaurant8_name, R.string.restaurant8_address,
                R.string.restaurant8_phone, R.string.restaurant8_prices, R.string.restaurant8_cuisine,
                R.drawable.restaurant8, R.drawable.restaurant_map8));
        places.add(new Places(R.string.restaurant9_name, R.string.restaurant9_address,
                R.string.restaurant9_phone, R.string.restaurant9_prices, R.string.restaurant9_cuisine,
                R.drawable.restaurant9, R.drawable.restaurant_map9));
        places.add(new Places(R.string.restaurant10_name, R.string.restaurant10_address,
                R.string.restaurant10_phone, R.string.restaurant10_prices, R.string.restaurant10_cuisine,
                R.drawable.restaurant10, R.drawable.restaurant_map10));

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