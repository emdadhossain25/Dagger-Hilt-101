package com.example.daggerhilt101.repository

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(val repo: MyRepo) : ViewModel() {
    fun startCar() {
        repo.car.startCar()
    }
}