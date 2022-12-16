package com.example.daggerhilt101.repository

import com.example.daggerhilt101.Car
import javax.inject.Inject

class MyRepo @Inject constructor(val car: Car) {

}