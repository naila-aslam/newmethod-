package com.example.toasting

import android.content.Context
import android.widget.Toast

object Toaster {
    fun simpleToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}
