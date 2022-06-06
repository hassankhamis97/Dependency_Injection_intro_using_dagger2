package com.hk.dependency_injection_intro

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hk.dependency_injection_intro.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {
    private val TAG = "Dependency_Injection_Intro_Using_Dagger2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val product = DaggerAppComponent.create().product
        Log.d(TAG, "onCreate: product = $product and user = ${product.user}")
    }
}