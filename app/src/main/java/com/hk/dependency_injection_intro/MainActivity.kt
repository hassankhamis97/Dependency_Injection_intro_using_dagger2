package com.hk.dependency_injection_intro

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hk.dependency_injection_intro.data.models.Product
import com.hk.dependency_injection_intro.data.models.User
import com.hk.dependency_injection_intro.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "Dependency_Injection_Intro_Using_Dagger2"
    }

    @Inject
    lateinit var userTest: User

    @Inject
    lateinit var product1: Product
    @Inject
    lateinit var product2: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val appComponent = DaggerAppComponent.builder().price(500).quantity(3).build()
        val appComponent = (application as BaseApplication).appComponent
        val productComponent = appComponent.getProductComponentBuilder().price(500).quantity(3).build()
        val product = productComponent.product
        productComponent.injectMainActivity(this)

        Log.d(TAG, "onCreate: --------------------- product1 ---------------------")
        Log.d(TAG, "onCreate: product1 $product1")
        Log.d(TAG, "onCreate: product1 seller = ${product1.user}")
        Log.d(TAG, "onCreate: product1 seller = ${product1.seller}")
        Log.d(TAG, "onCreate: --------------------- product2 ---------------------")
        Log.d(TAG, "onCreate: product1 $product2")
        Log.d(TAG, "onCreate: product1 seller = ${product2.user}")
        Log.d(TAG, "onCreate: product1 seller = ${product2.seller}")


    }
}