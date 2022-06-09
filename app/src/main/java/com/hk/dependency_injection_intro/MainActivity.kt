package com.hk.dependency_injection_intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hk.dependency_injection_intro.models.Car

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val car = Car.makeCar()
    }
}