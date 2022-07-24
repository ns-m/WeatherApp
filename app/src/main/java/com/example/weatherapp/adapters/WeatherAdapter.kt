package com.example.weatherapp.adapters

import android.view.View
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.databinding.ListItemBinding

class WeatherAdapter: ListAdapter<WeatherModel, > {

    class Holder(view: View): RecyclerView.ViewHolder(view){
        val binding = ListItemBinding.bind(view)
        fun bind(item: WeatherModel) = with(binding){
            txVwDate.text = item.time
            txVwConditionItem.text = item.condition
            txVwTempC.text = item.currentTempC
        }
    }
}