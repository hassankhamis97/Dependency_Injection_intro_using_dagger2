package com.hk.dependency_injection_intro.di

import com.hk.dependency_injection_intro.data.models.Product
import dagger.Component

/**
 * Created by hassankhamis on 06,June,2022
 */

@Component
interface AppComponent {
    val product: Product
    @Component.Builder
    interface Builder {

        fun build(): AppComponent
    }
}