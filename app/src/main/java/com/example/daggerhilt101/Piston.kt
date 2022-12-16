package com.example.daggerhilt101

import android.util.Log
import javax.inject.Inject

class Piston @Inject constructor(val numberOfPiston: NumberOfPiston) {
    fun startPiston(){
        numberOfPiston.numberOfPiston()
        Log.d("TAG", "startPiston")
    }
}