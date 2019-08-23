package com.zygo.gde.android

import android.app.Application
import com.zygo.gde.android.inyection.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * @author Santiago Carrillo
 * 2019-08-23.
 */
class KKApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Iniciar Koin
        startKoin {
            androidLogger()
            androidContext(this@KKApplication)
            modules(appModule)
        }
    }
}