package com.uxd.androidhour;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.v4.app.Fragment;
=======
>>>>>>> 5aeeb8afe1c671c741d762403b1ff16b57a2f39e
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

<<<<<<< HEAD
public class PackageManagerFragment extends Fragment {
=======
/**
 * Created by banelson on 6/21/13.
 */
public class PackageManagerFragment extends android.support.v4.app.Fragment {


>>>>>>> 5aeeb8afe1c671c741d762403b1ff16b57a2f39e
    private View v;
    private Intent intent = new Intent().setClassName("com.htc.showme", "com.htc.showme.ui.MainPage");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
<<<<<<< HEAD
        v = inflater.inflate(R.layout.package_fragment, container, false);
=======
        v = inflater.inflate(R.layout.intent_fragment, container, false);
>>>>>>> 5aeeb8afe1c671c741d762403b1ff16b57a2f39e

        PackageManager packageManager = getActivity().getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(intent, 0);
        boolean isIntentSafe = activities.size() > 0;

<<<<<<< HEAD
        if (isIntentSafe)
        {
            v.findViewById(R.id.button_explicit).setEnabled(true);
        }

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button explicitButton = (Button) v.findViewById(R.id.button_explicit);
        explicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
=======
        if (!isIntentSafe)
        {
            v.findViewById(R.id.button_explicit).setEnabled(false);
        }


        return v;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button explicitButton = (Button) v.findViewById(R.id.button_explicit);
        explicitButton.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View vew){
            startActivity(intent);
            }

        });
    }

>>>>>>> 5aeeb8afe1c671c741d762403b1ff16b57a2f39e
}
