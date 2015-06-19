package com.example.sidv.imageviewer;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        TextView detailTextView = (TextView) rootView.findViewById(R.id.textview_detail);
        detailTextView.append(getActivity()
                .getIntent()
                .getCharSequenceExtra(Intent.EXTRA_TEXT));
        return rootView;
    }


}
