package com.fossatamrita.lifeline.lifeline;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link layout1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link layout1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class layout1 extends Fragment {
    public layout1() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.emergency_fab);
        fab.show();
        return inflater.inflate(R.layout.fragment_layout1, container, false);
    }
}
