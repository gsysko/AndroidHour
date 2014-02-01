package com.uxd.androidhour;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by grahamsysko on 1/21/14.
 */
public class WifiReceiver extends BroadcastReceiver {
    private final View v;

    public WifiReceiver(View v) {
        super();
        this.v = v;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("uxd", "WIFI:~~");
        NetworkInfo networkInfo = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);
        Log.d("uxd", "~~" + networkInfo.getState().name());
        TextView tv = (TextView) v.findViewById(R.id.wifi_tv);
        if (networkInfo.getState().equals(NetworkInfo.State.CONNECTED)){
            tv.setText("Wi-Fi Connected");
        } else {
            tv.setText("Wi-Fi Disconnected");
        }
    }
}
