package com.zygo.gde.android.analytics

import android.content.Context

/**
 * @author Santiago Carrillo
 * 2019-08-23.
 */


interface AnalyticsTracker {

    fun sendEvent(name: String, properties: Map<String, String>)

    fun initConfig(context: Context)
}