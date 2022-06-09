package com.hk.dependency_injection_intro.models

/**
 * Created by hassankhamis on 09,June,2022
 */
class Car() {
    val engine: Engine
    val tire: Tire
    init {
        engine = Engine()
        tire = Tire()
    }
}