
package com.digitalhouse.digitalhousefoods.model

import kotlinx.parcelize.RawValue

data class Restaurant(val nome: String, val image: Int, val address: String, val opening: String,val plates: @RawValue List<Plate>)