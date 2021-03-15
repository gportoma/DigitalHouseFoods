package com.digitalhouse.digitalhousefoods.adapters

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.activities.PlateScreen
import com.digitalhouse.digitalhousefoods.activities.RestaurantScreen
import com.digitalhouse.digitalhousefoods.holders.PlateViewHolder
import com.digitalhouse.digitalhousefoods.holders.RestaurantViewHolder
import com.digitalhouse.digitalhousefoods.model.Plate

class PlateAdapter(val plates: List<Plate>) :
    RecyclerView.Adapter<PlateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlateViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.plate_item, parent, false)
        return PlateViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlateViewHolder, position: Int) {
        val namePlate = holder.tvPlate
        val imagePlate = holder.ivPlate

        namePlate.text = plates[position].name
        imagePlate.setImageResource(plates[position].image)

        holder.cvPlate.setOnClickListener {
            val intent = Intent(it.context, PlateScreen::class.java)
            intent.putExtra("NAME_PLATE",plates[position].name)
            intent.putExtra("IMAGE_PLATE",plates[position].image)
            intent.putExtra("DESCRIPTION_PLATE",plates[position].description)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = plates.size
}