package com.hk.dependency_injection_intro

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hk.dependency_injection_intro.data.models.User
import com.hk.dependency_injection_intro.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {
    private val TAG = "Dependency_Injection_Intro_Using_Dagger2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val product = DaggerAppComponent.builder().bindUser(User()).price(500).quantity(3).build().product
        Log.d(TAG, "onCreate: product = $product and user = ${product.user}")
        Log.d(TAG, "onCreate: quantity = ${product.quantity}")
        Log.d(TAG, "onCreate: price = ${product.price}")
    }
}