package com.example.daggerhilt101

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(val piston: Piston) {

    fun startEngine(){
        piston.startPiston()
        Log.d("TAG", "startEngine")
    }
}