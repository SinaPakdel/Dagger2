package com.sina.dagger.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sina.dagger.R
import com.sina.dagger.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val build = DaggerAppComponent.builder().setContext(this).build()
        val safePref = build.getSafePref()
        safePref.put("dagger", "sina")

        val get = safePref.get("dagger", "default")
        Log.e("TAG", "decrypt: $get")

    }
}