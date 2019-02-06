package com.example.android.android_me.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by Vicuko on 6/2/19.
 */
// TODO (2) Create a new class called MasterListFragment which will display the GridView list of ALL AndroidMe images - Done
// In the fragment class, you'll need to implement an empty constructor, and onCreateView

// TODO (3) In the MasterListFragment class, create a new MasterListAdapter and set it on the GridView - Done
// The MasterListAdapter code is provided; it creates the ImageViews that are contained in the GridView
// The adapter takes as parameters (Context context, List<Integer> imageIds)
public class MasterListFragment extends Fragment {

    public MasterListFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        // Get a reference to the GridView in the fragment_master_list xml layout file
        GridView gridView = (GridView) rootView.findViewById(R.id.images_grid_view);

        // Create the adapter
        // This adapter takes in the context and an ArrayList of ALL the image resources to display
        MasterListAdapter mAdapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        // Set the adapter on the GridView
        gridView.setAdapter(mAdapter);

        // Return the root view
        return rootView;
    }
}
