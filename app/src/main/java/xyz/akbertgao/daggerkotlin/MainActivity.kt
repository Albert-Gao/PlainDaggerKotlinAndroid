package xyz.akbertgao.daggerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import xyz.akbertgao.daggerkotlin.app.MyApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var myRepo: MyRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApp).myAppComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(myRepo.getPackagePath())
    }
}
