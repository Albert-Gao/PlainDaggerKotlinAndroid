package xyz.akbertgao.daggerkotlin.app

import android.app.Application
import dagger.Module
import dagger.Provides
import xyz.akbertgao.daggerkotlin.MyRepo
import javax.inject.Singleton

@Module
class MyAppModule(
    private val app: Application
) {
    @Provides
    @Singleton
    fun provideMyRepo(): MyRepo = MyRepo(app)
}