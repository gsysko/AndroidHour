package com.uxd.androidhour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class IntentSelectionFragment extends Fragment {
    private View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.intent_fragment, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button explicitButton = (Button) v.findViewById(R.id.button_explicit);
        explicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.htc.showme", "com.htc.showme.ui.MainPage");
                startActivity(intent);
            }
        });

        Button implicitButton = (Button) v.findViewById(R.id.button_implicit);
        implicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("http://m-support.verizonwireless.com");
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(implicitIntent);
            }
        });

        Button filterButton = (Button) v.findViewById(R.id.button_filter);
        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent filterableIntent = new Intent();
//                startActivity(filterableIntent);
            }
        });
    }

}