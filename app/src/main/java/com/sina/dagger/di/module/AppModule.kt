package com.sina.dagger.di.module

import com.sina.dagger.di.qualifier.CustomQualifier
import com.sina.dagger.utils.Zsecure
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @CustomQualifier
    @Provides
    fun provideZsecure1(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "67890"
        return zsecure
    }

    @Provides
    fun provideZsecure2(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "12345"
        return zsecure
    }
}