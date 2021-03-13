package com.digitalhouse.digitalhousefoods.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.holders.RestaurantViewHolder
import com.digitalhouse.digitalhousefoods.model.Restaurant

class RestaurantAdpater(val restaurants:MutableList<Restaurant>):RecyclerView.Adapter<RestaurantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurante_item, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val nameRestaurant = holder.tvRestaurant
        nameRestaurant.text = restaurants[position].nome
    }

    override fun getItemCount(): Int {
        return restaurants.size
    }
}