package com.hk.dependency_injection_intro.di

import com.hk.dependency_injection_intro.data.models.User
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by hassankhamis on 06,June,2022
 */

@Module
class AppModule {
    @Singleton
    @Provides
    fun getUser(): User = User()
}