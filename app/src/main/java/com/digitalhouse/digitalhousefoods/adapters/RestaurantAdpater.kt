package com.digitalhouse.digitalhousefoods.adapters

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.activities.HomeScreen
import com.digitalhouse.digitalhousefoods.activities.RestaurantScreen
import com.digitalhouse.digitalhousefoods.holders.RestaurantViewHolder
import com.digitalhouse.digitalhousefoods.model.Restaurant

class RestaurantAdpater(val restaurants: MutableList<Restaurant>, var context: Context) :
    RecyclerView.Adapter<RestaurantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_item, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val nameRestaurant = holder.tvRestaurant
        nameRestaurant.text = restaurants[position].nome

        holder.cvRestaurant.setOnClickListener {
            val intent = Intent(context, RestaurantScreen::class.java)
            startActivity(context, intent, Bundle())
        }
    }

    override fun getItemCount(): Int {
        return restaurants.size
    }
}