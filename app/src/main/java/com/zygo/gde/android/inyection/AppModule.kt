package com.zygo.gde.android.inyection

import com.zygo.gde.android.analytics.AnalyticsTracker
import com.zygo.gde.android.analytics.FlurryAnalyticsTracker
import org.koin.dsl.module

/**
 * @author Santiago Carrillo
 * 2019-08-23.
 */
val appModule = module {

    // instancia única AnalyticsTracker
    single<AnalyticsTracker> { FlurryAnalyticsTracker() }

}