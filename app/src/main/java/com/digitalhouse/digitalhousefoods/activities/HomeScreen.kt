package com.digitalhouse.digitalhousefoods.activities

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.adapters.RestaurantAdpater
import com.digitalhouse.digitalhousefoods.model.Restaurant

class HomeScreen : AppCompatActivity() {
    private val recyclerRestaurant by lazy { findViewById<RecyclerView>(R.id.rv_tela_inicio) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)
        setupRecyclerView()
    }

    private fun getRestaurants(): MutableList<Restaurant> {
        val restaurants = mutableListOf<Restaurant>()
        for (res in 0..15) {

            restaurants.add(Restaurant("RESTAURANTE $res"))
        }
        return restaurants
    }

    private fun setupRecyclerView() {
        val restaurants = getRestaurants()
        val adapter = RestaurantAdpater(restaurants, this)
        recyclerRestaurant.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerRestaurant.adapter = adapter
    }

    override fun onBackPressed() {
    }
}

