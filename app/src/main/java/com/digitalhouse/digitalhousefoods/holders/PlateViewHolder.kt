package com.digitalhouse.digitalhousefoods.holders

import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R

class PlateViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val ivPlate by lazy { view.findViewById<ImageView>(R.id.iv_prato_viewholder) }
    val tvPlate by lazy { view.findViewById<TextView>(R.id.tv_prato_viewholder) }
    val cvPlate by lazy { view.findViewById<CardView>(R.id.cv_plate) }
}