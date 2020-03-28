package ru.satera.myapplication

import android.app.Application
import ru.satera.myapplication.utils.BaseActivityLifeCycleCallback
import timber.log.Timber

class BTSApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
        registerBaseActivityLifecycleCallback(BaseActivityLifeCycleCallback())
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }

    private fun registerBaseActivityLifecycleCallback(activityLifecycleCallbacks: ActivityLifecycleCallbacks) {
        registerActivityLifecycleCallbacks(activityLifecycleCallbacks)
    }


}