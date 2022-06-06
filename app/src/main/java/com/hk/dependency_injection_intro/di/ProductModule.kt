package com.hk.dependency_injection_intro.di

import com.hk.dependency_injection_intro.data.models.User
import com.hk.dependency_injection_intro.di.scopes.ProductScope
import dagger.Module
import dagger.Provides

/**
 * Created by hassankhamis on 06,June,2022
 */
@Module
class ProductModule {
    @ProductScope
    @Provides
    fun getUser(): User = User()
}