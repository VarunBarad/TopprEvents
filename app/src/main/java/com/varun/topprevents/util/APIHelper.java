package com.varun.topprevents.util;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

/**
 * Creator: vbarad
 * Date: 2016-09-24
 * Project: TopprEvents
 */

public final class APIHelper {
  private static final String endpointEventDetails = "https://hackerearth.0x10.info/api/toppr_events?type=json&query=list_events";

  private static String getEventDetailsUrl() {
    return endpointEventDetails;
  }

  public static void fetchEventDetails(Context context, Response.Listener<JSONObject> responseListener, Response.ErrorListener errorListener) {
    String url = APIHelper.getEventDetailsUrl();

    JsonObjectRequest eventDetailsRequest =
        new JsonObjectRequest(Request.Method.GET, url, null, responseListener, errorListener);
    VolleySingleton.getInstance(context).addToRequestQueue(eventDetailsRequest);
  }
}
