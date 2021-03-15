package com.digitalhouse.digitalhousefoods.holders

import android.content.Intent
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.digitalhouse.digitalhousefoods.R
import com.digitalhouse.digitalhousefoods.activities.RestaurantScreen

class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val ivRestaurant by lazy { view.findViewById<ImageView>(R.id.iv_restaurante_viewholder) }
    val tvRestaurant by lazy { view.findViewById<TextView>(R.id.tv_restaurante_viewholder) }
    val tvRestaurantAdress by lazy { view.findViewById<TextView>(R.id.tv_endereco_viewholder) }
    val tvOpeningHours by lazy { view.findViewById<TextView>(R.id.tv_horario_funcionamento_viewholder) }
    val cvRestaurant by lazy { view.findViewById<CardView>(R.id.cv_restaurant) }

}