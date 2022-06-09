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
        val engine1 = Engine()
        val tire1 = Tire()
        val car1 = Car(engine1, tire1)

        val engine2 = Engine()
        val tire2 = Tire()
        val car2 = Car(engine2, tire2)

        val engine3 = Engine()
        val tire3 = Tire()
        val car3 = Car(engine3, tire3)

        val engine4 = Engine()
        val tire4 = Tire()
        val car4 = Car(engine4, tire4)
    }
}