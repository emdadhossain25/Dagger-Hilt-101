package com.example.daggerhilt101

import com.example.daggerhilt101.repository.MyRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier


@InstallIn(SingletonComponent::class)
@Module
class DIModule {


    @Provides
    fun providesNumberOfPiston(): NumberOfPiston {
        return NumberOfPistonImpl()
    }

    @Provides
    fun providePiston(numberOfPiston: NumberOfPiston): Piston {
        return Piston(numberOfPiston)
    }

    @Provides
    fun provideEngine(piston: Piston): Engine {
        return Engine(piston)
    }

    @Provides
    fun provideCar(engine: Engine, @SIX number: Int): Car {
        return Car(engine, number)
    }



    @Provides
    fun provideMyRepo(car: Car):MyRepo{
        return MyRepo(car)
    }

    @Provides
    @FOUR
    fun provideFourNumber(): Int {
        return 4
    }

    @Provides
    @SIX
    fun provideSixNumber(): Int {
        return 6
    }


}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FOUR


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SIX