package com.digitalhouse.digitalhousefoods.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.holders.PlateViewHolder
import com.digitalhouse.digitalhousefoods.holders.RestaurantViewHolder
import com.digitalhouse.digitalhousefoods.model.Plate

class PlateAdapter(val pratos: MutableList<Plate>):RecyclerView.Adapter<PlateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlateViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.prato_item, parent, false)
        return PlateViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlateViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return pratos.size
    }
}