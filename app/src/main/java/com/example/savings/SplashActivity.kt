package com.example.savings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
             private var handler:Handler?=null
             private var runnable:Runnable?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
          init()
    }
    private fun init(){
           handler= Handler()
           runnable= Runnable{
                  startActivity(Intent(this,AppSummaryActivity::class.java))
                  finish()
           }
    }

    override fun onStart() {
        super.onStart()
         handler?.postDelayed(runnable,1500)
    }
}