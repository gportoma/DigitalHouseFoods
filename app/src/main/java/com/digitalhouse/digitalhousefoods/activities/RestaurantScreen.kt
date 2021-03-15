package com.digitalhouse.digitalhousefoods.activities

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.adapters.PlateAdapter
import com.digitalhouse.digitalhousefoods.model.Plate
import java.io.Serializable

class RestaurantScreen : AppCompatActivity() {
    private val recyclerPlate by lazy { findViewById<RecyclerView>(R.id.rv_tela_restaurante) }
    private val tvRestaurant by lazy { findViewById<TextView>(R.id.tv_restaurante_tela_restaurante) }
    private val ivRestaurant by lazy { findViewById<ImageView>(R.id.iv_restaurante_tela_restaurante) }
    private val btBack by lazy { findViewById<ImageButton>(R.id.bt_voltar_restaurante) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurant_screen)
        setupRecyclerView()
        initiView()
        btBack.setOnClickListener { onBackPressed() }
    }

    private fun initiView() {
        val extras = intent.extras
        val nameRestaurant = extras?.getString("NAME")
        val imageRestaurant = extras?.getInt("IMAGE")
        val plateRestaurant = extras?.getSerializable("PLATE")
        tvRestaurant.text = nameRestaurant
        if (imageRestaurant != null) {
            ivRestaurant.setImageResource(imageRestaurant)
        }
        val adapter = PlateAdapter(getPlate(plateRestaurant))
        recyclerPlate.layoutManager = GridLayoutManager(this, 2)
        recyclerPlate.adapter = adapter
        recyclerPlate.isNestedScrollingEnabled
    }

    private fun setupRecyclerView() {

    }

    private fun getPlate(plateRestaurant: Serializable?): List<Plate> =
        plateRestaurant as List<Plate>

}

