package com.example.unittest

import android.content.Context

class ResourceComparer {

    fun isEqual(context: Context, resId:Int, string: String): Boolean =
        context.getString(resId) == string
}