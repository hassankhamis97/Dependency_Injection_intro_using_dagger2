package com.hk.dependency_injection_intro.di

import com.hk.dependency_injection_intro.MainActivity
import com.hk.dependency_injection_intro.data.models.Product
import com.hk.dependency_injection_intro.data.models.User
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by hassankhamis on 06,June,2022
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    val product: Product

    fun injectMainActivity(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun quantity(@Named("quantity") quantity: Int): Builder

        @BindsInstance
        fun price(@Named("price") price: Int): Builder

        fun build(): AppComponent
    }
}