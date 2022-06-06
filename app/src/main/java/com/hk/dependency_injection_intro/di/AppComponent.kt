package com.hk.dependency_injection_intro.di

import com.hk.dependency_injection_intro.data.models.Product
import com.hk.dependency_injection_intro.data.models.User
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

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

        @BindsInstance
        fun quantity(@Named("quantity") quantity: Int): Builder

        @BindsInstance
        fun price(@Named("price") price: Int): Builder

        fun build(): AppComponent
    }
}