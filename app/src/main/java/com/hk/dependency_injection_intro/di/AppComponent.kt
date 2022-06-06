package com.hk.dependency_injection_intro.di

import dagger.Component

/**
 * Created by hassankhamis on 06,June,2022
 */

@Component
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }
}