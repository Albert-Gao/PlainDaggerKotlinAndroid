package xyz.akbertgao.daggerkotlin.app

import android.app.Application

class MyApp : Application() {
    lateinit var myAppComponent: MyAppComponent

    override fun onCreate() {
        super.onCreate()
        myAppComponent = initDagger(this)
    }

    private fun initDagger(app: MyApp): MyAppComponent =
        DaggerMyAppComponent
            .builder()
            .myAppModule(MyAppModule(app))
            .build()
}