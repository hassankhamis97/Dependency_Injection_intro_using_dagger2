package com.hk.dependency_injection_intro

import android.app.Application
import com.hk.dependency_injection_intro.di.DaggerAppComponent

/**
 * Created by hassankhamis on 06,June,2022
 */
class BaseApplication: Application() {
    val appComponent = DaggerAppComponent.builder().quantity(5).price(8).build()
}