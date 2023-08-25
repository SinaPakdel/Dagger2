package com.sina.dagger.di

import android.content.Context
import com.sina.dagger.db.SafePref
import com.sina.dagger.utils.Zcrypt
import com.sina.dagger.di.module.AppModule
import dagger.BindsInstance
import dagger.Component


@Component(modules = [AppModule::class])
interface AppComponent {


    fun provideZcript(): Zcrypt


    fun getSafePref(): SafePref


    @Component.Builder
    interface Builder {

        @BindsInstance
        fun setContext(context: Context):Builder

        fun build(): AppComponent
    }
}