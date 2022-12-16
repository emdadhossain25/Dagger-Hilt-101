package com.example.daggerhilt101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    // field injection
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //here Car class is dependent on engine class which is created alongside Car
        // not a good real world immitation. as real world engine is created separately
        // and when car is being made engine or any other parts are fitted not created
//        val engine = Engine()
//        val car = Car(engine)
        car.startCar()
    }
}