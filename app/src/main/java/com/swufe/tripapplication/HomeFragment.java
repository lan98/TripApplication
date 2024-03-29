package com.swufe.tripapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment{
    private Button btnChina;
    private Button btnKroea;
    private Button btnUSA;
    private Button btnFrance;
    private Button btnUK;
    private Button btnJapan;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frame_home, container);
        btnChina= (Button)view.findViewById(R.id.btnChina);
        btnKroea=(Button)view.findViewById(R.id.btnKroea);
        btnUSA =(Button)view.findViewById(R.id.btnUSA);
        btnFrance =(Button)view.findViewById(R.id.btnFrance);
        btnUK = (Button)view.findViewById(R.id.btnUK );
        btnJapan = (Button)view.findViewById(R.id.btnJapan);
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
                Intent intentKroea=new Intent(getActivity(), KroeaActivity.class);
                startActivity(intentKroea);
            }

        });
        btnUSA.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intentUSA=new Intent(getActivity(), USAActivity.class);
                startActivity(intentUSA);
            }
        });
        btnFrance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFrance=new Intent(getActivity(), FranceActivity.class);
                startActivity(intentFrance);
            }
        });
        btnUK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentUK=new Intent(getActivity(), UKActivity.class);
                startActivity(intentUK);
            }
        }) ;
        btnJapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJapan=new Intent(getActivity(), JapanActivity.class);
                startActivity(intentJapan);
            }
        });

        return view;


    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView tv = (TextView)getActivity().findViewById(R.id.homeTextView1);


    }
}
