package com.uxd.androidhour;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by grahamsysko on 1/31/14.
 */
public class BroadcastFragment extends Fragment {
    private View v;
    private BroadcastReceiver receiver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.broadcast_fragment, container, false);

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();
        receiver = new WifiReceiver(v);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION);
        getActivity().registerReceiver(receiver, intentFilter);
    }

    @Override
    public void onStop() {
        super.onStop();
        getActivity().unregisterReceiver(receiver);
    }
}
