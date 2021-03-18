package com.digitalhouse.digitalhousefoods.adapters

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.activities.RestaurantScreen
import com.digitalhouse.digitalhousefoods.holders.RestaurantViewHolder
import com.digitalhouse.digitalhousefoods.model.Plate
import com.digitalhouse.digitalhousefoods.model.Restaurant
import java.util.ArrayList

class RestaurantAdpater(val restaurants: List<Restaurant>, val callback: (Restaurant) -> Unit) :
    RecyclerView.Adapter<RestaurantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_item, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val nameRestaurant = holder.tvRestaurant
        val imageRestaurant = holder.ivRestaurant
        val addresRestaurant = holder.tvRestaurantAdress
        val openingRestaurant = holder.tvOpeningHours

        nameRestaurant.text = restaurants[position].nome
        imageRestaurant.setImageResource(restaurants[position].image)
        addresRestaurant.text = restaurants[position].address
        openingRestaurant.text = restaurants[position].opening

        holder.cvRestaurant.setOnClickListener {
            callback(restaurants[position])
        }
    }

    override fun getItemCount() = restaurants.size

    fun addMoreItens(restaurants: List<Restaurant>?) {

    }
}