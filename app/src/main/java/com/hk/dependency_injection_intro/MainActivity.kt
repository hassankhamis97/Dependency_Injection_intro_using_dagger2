package com.hk.dependency_injection_intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hk.dependency_injection_intro.models.Car
import com.hk.dependency_injection_intro.models.Engine
import com.hk.dependency_injection_intro.models.Tire

class MainActivity : AppCompatActivity() {
    private val TAG = "Dependency_Injection_Intro_Using_Dagger2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val car = Car()

        Log.d(TAG, "onCreate: engine = ${car.engine}")
        Log.d(TAG, "onCreate: tire = ${car.tire}")
    }
}