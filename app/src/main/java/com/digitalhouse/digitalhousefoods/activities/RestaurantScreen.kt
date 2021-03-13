package com.digitalhouse.digitalhousefoods.activities

import android.icu.lang.UCharacter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.adapters.PlateAdapter
import com.digitalhouse.digitalhousefoods.adapters.RestaurantAdpater
import com.digitalhouse.digitalhousefoods.model.Plate
import com.digitalhouse.digitalhousefoods.model.Restaurant

class RestaurantScreen : AppCompatActivity() {
    private val recyclerPlate by lazy { findViewById<RecyclerView>(R.id.rv_tela_restaurante) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurant_screen)
        setupRecyclerView()
    }

    private fun getPlates(): MutableList<Plate> {
        val plates = mutableListOf<Plate>()

        for (pla in 0..15) {
            plates.add(Plate("PRATO $pla"))
        }
        return plates
    }

    private fun setupRecyclerView() {
        val plates = getPlates()
        val adapter = PlateAdapter(plates, this)
        recyclerPlate.layoutManager = GridLayoutManager(this, 2)
        recyclerPlate.adapter = adapter
        recyclerPlate.isNestedScrollingEnabled
    }
}

