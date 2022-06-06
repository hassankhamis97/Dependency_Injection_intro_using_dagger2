package com.hk.dependency_injection_intro.data.models

import android.util.Log
import com.hk.dependency_injection_intro.MainActivity.Companion.TAG
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by hassankhamis on 06,June,2022
 */
class Product @Inject constructor(
    val user: User,
    @Named("quantity")
    var quantity: Int,
    @Named("price")
    var price: Int
) {
    init {
        Log.d(TAG, "init: product")
    }
    @Inject
    fun cost() {
        Log.d(TAG, "cost: ${quantity * price}")
    }
}