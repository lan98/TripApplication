package com.swufe.tripapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BeijingAttractions1Fragment extends Fragment {

    private ScrollView scrollView ;

    public BeijingAttractions1Fragment() {
        // Required empty public constructor

        

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beijing_attractions1, container, false);
    }

}
