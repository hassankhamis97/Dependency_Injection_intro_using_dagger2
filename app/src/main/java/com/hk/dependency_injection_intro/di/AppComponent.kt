package com.hk.dependency_injection_intro.di

import com.hk.dependency_injection_intro.data.models.Product
import com.hk.dependency_injection_intro.data.models.User
import dagger.BindsInstance
import dagger.Component

/**
 * Created by hassankhamis on 06,June,2022
 */

@Component
interface AppComponent {
    val product: Product
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun bindUser(user: User): Builder

        fun build(): AppComponent
    }
}