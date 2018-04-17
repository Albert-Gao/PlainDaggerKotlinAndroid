package xyz.akbertgao.daggerkotlin.app

import dagger.Component
import xyz.akbertgao.daggerkotlin.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [MyAppModule::class])
interface MyAppComponent {
    fun inject(target: MainActivity)
}