package com.hk.dependency_injection_intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hk.dependency_injection_intro.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {
    private val TAG = "Dependency_Injection_Intro_Using_Dagger2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerAppComponent.create()
    }
}