package com.example.weatherapp.fragments

import android.Manifest
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.FragmentActivity
import com.example.weatherapp.R
import com.example.weatherapp.adapters.ViewPagerAdapter
import com.example.weatherapp.databinding.FragmentMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var pLauncher: ActivityResultLauncher<String>
    private val fragList = listOf(
        HoursFragment.newInstance(),
        DaysFragment.newInstance()
    )
    private val bttnList = listOf(
        getString(R.string.temp_text_hours),
        getString(R.string.temp_text_days)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkPermission()
        init()
    }

    private fun init() = with(binding){
        val adapter = ViewPagerAdapter(activity as FragmentActivity, fragList)
        vwPgrDetails.adapter = adapter
        TabLayoutMediator(tabLayout, vwPgrDetails){
            tab, pos -> tab.text = bttnList[pos]
        }.attach()
    }

    private fun permissionListener(){

        pLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){

        }
    }

    private fun checkPermission(){
        if (!isPermissionGranted(Manifest.permission.ACCESS_FINE_LOCATION)){
            permissionListener()
            pLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()
    }
}