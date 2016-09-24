package com.varun.topprevents.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Creator: vbarad
 * Date: 2016-09-24
 * Project: TopprEvents
 */

public final class Helper {
  public static boolean isConnectedToInternet(Context context) {
    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();

    boolean isConnected;

    isConnected = (activeNetwork != null) && activeNetwork.isConnected();

    return isConnected;
  }
}
