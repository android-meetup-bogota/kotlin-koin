package com.zygo.gde.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zygo.gde.android.analytics.AnalyticsTracker
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

@Suppress("MemberVisibilityCanBePrivate")



class MainActivity : AppCompatActivity() {

    val analyticsTracker: AnalyticsTracker by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {

            analyticsTracker
                .sendEvent("Evento Prueba", null)
        }
    }
}
