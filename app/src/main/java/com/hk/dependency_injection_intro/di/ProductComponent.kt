package com.hk.dependency_injection_intro.di

import com.hk.dependency_injection_intro.MainActivity
import com.hk.dependency_injection_intro.data.models.Product
import com.hk.dependency_injection_intro.di.scopes.ProductScope
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named

/**
 * Created by hassankhamis on 06,June,2022
 */
@ProductScope
@Subcomponent(modules = [ProductModule::class])
interface ProductComponent {
    val product: Product

    fun injectMainActivity(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun quantity(@Named("quantity") quantity: Int): Builder

        @BindsInstance
        fun price(@Named("price") price: Int): Builder

//        fun appComponent(appComponent: AppComponent): Builder

        fun build(): ProductComponent
    }
}