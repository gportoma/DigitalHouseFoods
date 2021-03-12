package com.digitalhouse.digitalhousefoods.holders

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R

class PlateViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val ibPlate by lazy { view.findViewById<ImageButton>(R.id.ib_prato_viewholder) }
    val tvPlate by lazy { view.findViewById<TextView>(R.id.tv_prato_viewholder) }
}