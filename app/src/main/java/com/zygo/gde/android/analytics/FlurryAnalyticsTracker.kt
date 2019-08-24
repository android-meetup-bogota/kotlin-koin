package com.zygo.gde.android.analytics

import android.content.Context
import android.util.Log

/**
 * @author Santiago Carrillo
 * 2019-08-23.
 */

class FlurryAnalyticsTracker : AnalyticsTracker {
    override fun sendEvent(name: String, properties: Map<String, String>?) {
        Log.d("FlurryAnalyticsTracker",
            "Sending event $name with properties $properties")
    }

    override fun initConfig(context: Context) {
        Log.d("FlurryAnalyticsTracker", "initConfig!!")
    }
}