package com.hk.dependency_injection_intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hk.dependency_injection_intro.models.Car
import com.hk.dependency_injection_intro.models.Engine
import com.hk.dependency_injection_intro.models.Tire

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inversion of control
        val engine = Engine()
        val tire = Tire()
        val car = Car(engine, tire)
    }
}