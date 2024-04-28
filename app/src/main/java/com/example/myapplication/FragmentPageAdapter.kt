package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fm: FragmentManager, lf: Lifecycle) : FragmentStateAdapter(fm, lf) {

    override fun getItemCount(): Int {
        // Return the number of fragments you want to display
        // For example:
        return 2;
    }

    override fun createFragment(position: Int): Fragment {
        // Return the fragment instance for each position
        // For example:
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }
}
