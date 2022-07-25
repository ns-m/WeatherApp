package com.example.weatherapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapp.adapters.WeatherAdapter
import com.example.weatherapp.adapters.WeatherModel
import com.example.weatherapp.databinding.FragmentHoursBinding


class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding){
        rcVwHours.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcVwHours.adapter = adapter
        val tempList = listOf(
            WeatherModel(
                "11:00",
                "","",
                "20°C",
                "70°F",
                "Sunny",
                "","","",
                "","","",""
            ),
            WeatherModel(
                "12:00",
                "","",
                "28°C",
                "78°F",
                "Sunny",
                "","","",
                "","","",""
            ),
            WeatherModel(
                "13:00",
                "","",
                "18°C",
                "68°F",
                "Rain",
                "","","",
                "","","",""
            )

        )
        adapter.submitList(tempList)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}