package com.sina.dagger.di.module

import com.sina.dagger.utils.Zsecure
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideZsecure(): Zsecure {

        return Zsecure()
    }
}