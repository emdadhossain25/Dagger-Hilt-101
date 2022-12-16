package com.example.daggerhilt101

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication(): Application() {
}