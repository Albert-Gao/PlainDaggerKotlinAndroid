package xyz.akbertgao.daggerkotlin

import android.app.Application

class MyRepo(
    private val application: Application
) {
    fun getPackagePath():String = application.packageCodePath
}