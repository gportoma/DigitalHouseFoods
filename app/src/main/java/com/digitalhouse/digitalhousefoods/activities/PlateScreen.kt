package com.digitalhouse.digitalhousefoods.activities

import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.digitalhouse.digitalhousefoods.R

class PlateScreen : AppCompatActivity() {
    private val titlePlate by lazy { findViewById<TextView>(R.id.tv_prato_tela_detalhe_prato) }
    private val descriptionPlate by lazy { findViewById<TextView>(R.id.tv_descricao_prato) }
    private val imagePlate by lazy { findViewById<ImageView>(R.id.iv_tela_detalhe_prato) }
    private val btBack by lazy { findViewById<ImageButton>(R.id.bt_voltar_detalhe_prato) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plate_details_screen)
        initViews()
        btBack.setOnClickListener { onBackPressed() }

    }

    private fun initViews(){
        val extras = intent.extras
        val name = extras?.getString("NAME_PLATE")
        val image = extras?.getInt("IMAGE_PLATE")
        val description = extras?.getString("DESCRIPTION_PLATE")

        titlePlate.text = name
        descriptionPlate.text = description
        if (image != null) {
            imagePlate.setImageResource(image)
        }
    }

}