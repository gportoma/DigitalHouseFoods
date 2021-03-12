package com.digitalhouse.digitalhousefoods.holders

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R

class RestaurantViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val ibButton by lazy { view.findViewById<ImageButton>(R.id.ib_restaurante_viewholder) }
    val tvRestaurant by lazy { view.findViewById<TextView>(R.id.tv_restaurante_viewholder) }
    val tvRestaurantAdress by lazy { view.findViewById<TextView>(R.id.tv_endereco_viewholder) }
    val tvOpeningHours by lazy { view.findViewById<TextView>(R.id.tv_horario_funcionamento_viewholder) }

}