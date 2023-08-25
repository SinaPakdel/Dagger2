package com.sina.dagger.db

import android.content.Context
import android.util.Log
import com.sina.dagger.utils.Zcrypt
import javax.inject.Inject

class SafePref @Inject constructor(private val context: Context, private val zcrypt: Zcrypt) {


    private val pref = context.getSharedPreferences("dagger", Context.MODE_PRIVATE)
    private val editor = pref.edit()


    fun put(key: String, value: String) {
        val encrypt = zcrypt.encrypt(value)
        Log.e("TAG", "put: $encrypt")
        editor.putString(key, encrypt)
        editor.commit()
    }

    fun get(key: String, default: String): String {
        return zcrypt.decrypt(pref.getString(key, default) ?: default)
    }
}