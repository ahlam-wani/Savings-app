package com.example.savings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class AppSummaryActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_summary)
       var pager= findViewById<ViewPager>(R.id.pager)
          pager.adapter=ViewPagerAdapter(supportFragmentManager)
    }
}