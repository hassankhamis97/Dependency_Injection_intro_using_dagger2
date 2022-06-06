package com.hk.dependency_injection_intro.data.models

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
    )