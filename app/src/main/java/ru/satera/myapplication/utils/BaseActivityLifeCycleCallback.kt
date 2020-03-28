package ru.satera.myapplication.utils

import android.app.Activity
import android.app.Application
import android.os.Bundle
import timber.log.Timber

class BaseActivityLifeCycleCallback : Application.ActivityLifecycleCallbacks {

    override fun onActivityPaused(activity: Activity) {

    }

    override fun onActivityStarted(activity: Activity) {

    }

    override fun onActivityDestroyed(activity: Activity) {

    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

    }

    override fun onActivityStopped(activity: Activity) {

    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        Timber.d("onActivityCreated")
    }

    override fun onActivityResumed(activity: Activity) {

    }
}
