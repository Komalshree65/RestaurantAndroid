package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity6 : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activitymain6)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager) // Changed to use ViewPager2
        adapter = FragmentAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        // Attach ViewPager2 to TabLayout
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            // Set the text for each tab
            tab.text = when (position) {
                0 -> "Veg"
                1 -> "Non-Veg"
                2-> "Third"
                else -> null
            }
        }.attach()
    }
}