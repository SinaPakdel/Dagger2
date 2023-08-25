package com.sina.dagger.utils

import android.util.Base64
import javax.inject.Inject

class Zcrypt @Inject constructor() {


    @Inject
    lateinit var zsecure: Zsecure

    fun encrypt(string: String): String {
        return Base64.encodeToString(string.toByteArray(), Base64.DEFAULT)
    }

    fun decrypt(string: String): String {
        return String(Base64.decode(string, Base64.DEFAULT))
    }

}