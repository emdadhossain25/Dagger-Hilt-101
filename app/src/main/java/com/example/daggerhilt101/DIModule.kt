package com.example.daggerhilt101

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
class DIModule {


    @Provides
    fun providePiston():Piston{
        return Piston()
    }

    @Provides
    fun provideEngine(piston: Piston): Engine {
        return Engine(piston)
    }

    @Provides
    fun provideCar(engine: Engine): Car {
        return Car(engine)
    }
}