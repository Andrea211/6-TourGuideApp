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
public class ThingsToDoFragment extends Fragment {

    public ThingsToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.thingsToDo1_name, R.string.thingsToDo1_description,
                R.drawable.thingstodo1, R.drawable.thingstodo_map1));
        places.add(new Places(R.string.thingsToDo2_name, R.string.thingsToDo2_description,
                R.drawable.thingstodo2, R.drawable.thingstodo_map2));
        places.add(new Places(R.string.thingsToDo3_name, R.string.thingsToDo3_description,
                R.drawable.thingstodo3, R.drawable.thingstodo_map3));
        places.add(new Places(R.string.thingsToDo4_name, R.string.thingsToDo4_description,
                R.drawable.thingstodo4, R.drawable.thingstodo_map4));
        places.add(new Places(R.string.thingsToDo5_name, R.string.thingsToDo5_description,
                R.drawable.thingstodo5, R.drawable.thingstodo_map5));
        places.add(new Places(R.string.thingsToDo6_name, R.string.thingsToDo6_description,
                R.drawable.thingstodo6, R.drawable.thingstodo_map6));
        places.add(new Places(R.string.thingsToDo7_name, R.string.thingsToDo7_description,
                R.drawable.thingstodo7, R.drawable.thingstodo_map7));
        places.add(new Places(R.string.thingsToDo8_name, R.string.thingsToDo8_description,
                R.drawable.thingstodo8, R.drawable.thingstodo_map8));
        places.add(new Places(R.string.thingsToDo9_name, R.string.thingsToDo9_description,
                R.drawable.thingstodo9, R.drawable.thingstodo_map9));
        places.add(new Places(R.string.thingsToDo10_name, R.string.thingsToDo10_description,
                R.drawable.thingstodo10, R.drawable.thingstodo_map10));

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