package com.digitalhouse.digitalhousefoods.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.model.DadosRestaurantes
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.adapters.RestaurantAdpater
import com.digitalhouse.digitalhousefoods.model.Plate
import com.digitalhouse.digitalhousefoods.model.Restaurant
import com.digitalhouse.digitalhousefoods.viewModel.HomeViewModel
import java.util.ArrayList

class HomeScreen : AppCompatActivity() {
    private val recyclerRestaurant by lazy { findViewById<RecyclerView>(R.id.rv_tela_inicio) }

    private lateinit var viewModel: HomeViewModel
    private lateinit var adapter: RestaurantAdpater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        configureView()
        setupRecyclerView()
    }

    private fun configureView() {
        recyclerRestaurant.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun setupRecyclerView() {
        viewModel.restaurauntsLivedata.observe(this){restaurants ->

            adapter = RestaurantAdpater(restaurants) {restaurant->
                viewModel.addIten(restaurant)
                navigateToRestaurant(restaurant)
            }

            recyclerRestaurant.adapter = adapter
        }
    }

    private fun navigateToRestaurant(restaurant: Restaurant) {
        val intent = Intent(this, RestaurantScreen::class.java)
        val plateArray: ArrayList<Plate> = ArrayList(restaurant.plates)
        intent.putExtra("NAME", restaurant.nome)
        intent.putExtra("IMAGE", restaurant.image)
        intent.putExtra("PLATE", plateArray)
        startActivity(intent)
    }
}

