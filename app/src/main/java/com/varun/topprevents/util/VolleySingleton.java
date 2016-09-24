package com.varun.topprevents.util;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Creator: vbarad
 * Date: 2016-09-24
 * Project: TopprEvents
 */

public final class VolleySingleton {
  private static VolleySingleton instance;
  private Context context;
  private RequestQueue requestQueue;

  private VolleySingleton(Context context) {
    this.context = context;
    this.requestQueue = getRequestQueue();
  }

  public static synchronized VolleySingleton getInstance(Context context) {
    if (instance == null) {
      instance = new VolleySingleton(context);
    }
    return instance;
  }

  public RequestQueue getRequestQueue() {
    if (requestQueue == null) {
      requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }
    return requestQueue;
  }

  public <T> void addToRequestQueue(Request<T> req) {
    getRequestQueue().add(req);
  }
}
