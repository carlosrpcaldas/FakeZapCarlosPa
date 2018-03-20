package com.example.logonrm.fakezapcarlospa

import android.app.Fragment
import android.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


/**
 * Created by logonrm on 19/03/2018.
 */
class NewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    val meusFragments = ArrayList<Fragment>()


    override fun getItem(position: Int): Fragment {
        return meusFragments[position]
    }

    override fun getCount(): Int {
        return meusFragments.size
    }

    fun adcionar(fragment: Fragment){
        meusFragments.add(fragment)
    }


}