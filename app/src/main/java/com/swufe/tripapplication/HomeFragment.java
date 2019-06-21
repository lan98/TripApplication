package com.swufe.tripapplication;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeFragment extends Fragment{
    private Button btnChina;
    private Button btnKroea;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_home, container);
        btnChina= (Button)view.findViewById(R.id.btnChina);
        btnKroea=(Button)view.findViewById(R.id.btnKroea);
        btnChina.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intentChina=new Intent(getActivity(), BeijingFirstActivity.class);
                startActivity(intentChina);

            }

        });
        btnKroea.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intentKroea=new Intent(getActivity(), ShanghaiActivity.class);
                startActivity(intentKroea);
            }
        });

        return view;


    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView tv = (TextView)getActivity().findViewById(R.id.homeTextView1);


    }
}
