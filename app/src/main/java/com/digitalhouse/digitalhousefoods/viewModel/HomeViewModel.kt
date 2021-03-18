package com.digitalhouse.digitalhousefoods.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.digitalhouse.digitalhousefoods.model.DadosRestaurantes
import com.digitalhouse.digitalhousefoods.model.Restaurant

class HomeViewModel: ViewModel() {

    val restaurauntsLivedata: MutableLiveData<List<Restaurant>> by lazy { MutableLiveData<List<Restaurant>>() }
    val restaurantsService = DadosRestaurantes

    init {
        getRestaurants()
    }

    fun getRestaurants(){
        val list = restaurantsService.getRestaurants()
        restaurauntsLivedata.postValue(list)
    }

    fun addIten(restaurant: Restaurant) {
        TODO("Not yet implemented")
    }
}