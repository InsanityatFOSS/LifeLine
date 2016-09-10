package com.fossatamrita.lifeline.lifeline;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link layout3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link layout3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class layout3 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    public layout3() {

    }

    private void findViewById(int webview) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layout3, container, false);
    }
}
