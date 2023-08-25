package com.sina.dagger.utils

import android.util.Base64
import android.util.Log
import com.sina.dagger.di.qualifier.CustomQualifier
import javax.inject.Inject

class Zcrypt @Inject constructor() {


    @Inject
    @CustomQualifier
    lateinit var zsecure: Zsecure

    fun encrypt(string: String): String {
        Log.e("TAG", "encrypt: ${zsecure.Z_KEY}")
        return Base64.encodeToString(string.toByteArray(), Base64.DEFAULT)
    }

    fun decrypt(string: String): String {
        return String(Base64.decode(string, Base64.DEFAULT))
    }

}