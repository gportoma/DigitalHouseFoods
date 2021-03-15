package com.digitalhouse.digitalhousefoods.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.model.DadosRestaurantes
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.adapters.RestaurantAdpater

class HomeScreen : AppCompatActivity() {
    private val recyclerRestaurant by lazy { findViewById<RecyclerView>(R.id.rv_tela_inicio) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val adapter = RestaurantAdpater(DadosRestaurantes.getRestaurants())
        recyclerRestaurant.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerRestaurant.adapter = adapter
    }

    override fun onBackPressed() {}
}

