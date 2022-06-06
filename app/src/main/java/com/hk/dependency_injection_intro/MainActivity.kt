package com.hk.dependency_injection_intro

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hk.dependency_injection_intro.data.models.User
import com.hk.dependency_injection_intro.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "Dependency_Injection_Intro_Using_Dagger2"

    @Inject
    lateinit var userTest: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appComponent = DaggerAppComponent.builder().price(500).quantity(3).build()
        val product = appComponent.product
        appComponent.injectMainActivity(this)
        Log.d(TAG, "onCreate: product = $product and user = ${product.user}")
        Log.d(TAG, "onCreate: quantity = ${product.quantity}")
        Log.d(TAG, "onCreate: price = ${product.price}")
        Log.d(TAG, "onCreate: userTest = $userTest")

    }
}