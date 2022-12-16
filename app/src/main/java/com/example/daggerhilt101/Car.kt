package com.example.daggerhilt101

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val number: Int) {

    fun startCar() {
        engine.startEngine()
        Log.d("TAG", "${number} startCar")
    }
}