package com.digitalhouse.digitalhousefoods.model

import com.digitalhouse.digitalhousefoods.R

object DadosRestaurantes {

    fun getRestaurants(): List<Restaurant> {
        val restaurants = mutableListOf<Restaurant>()
        restaurants.add(Restaurant("Mc Donalds",
            R.drawable.restaurante_mcdonalds,"282 Streich Brooks Apt. 348 - Shawnee, MN / 10999","Fecha ás 22:00",
            getMcDonalds()
        ))
        restaurants.add(Restaurant("Burguer King",
            R.drawable.restaurante_burguerking,"188 Rosanna Ports Suite 944 - Washington, PA / 26449","Fecha ás 20:00",
            getBurguerKing()
        ))
        restaurants.add(Restaurant("Si Senor",
            R.drawable.restaurante_sisenor,"525 Macejkovic Villages Apt. 231 - Memphis, MD / 88377","Fecha ás 00:00",
            getSiSenor()
        ))
        restaurants.add(Restaurant("Outback",
            R.drawable.restaurante_outback,"91357 Ward Passage Apt. 852 - Honolulu, SC / 81807","Fecha ás 22:00",
            getOutback()
        ))
        restaurants.add(Restaurant("Paris 6",
            R.drawable.restaurante_paris,"91357 Ward Passage Apt. 852 - Honolulu, SC / 81807","Fecha ás 22:00",
            getParis()
        ))
        restaurants.add(Restaurant("Grilleto",
            R.drawable.restaurante_grilleto,"756 Baumbach Pine Suite 227 - Honolulu, MD / 84822","Fecha ás 22:00",
            getGrilleto()
        ))
        restaurants.add(Restaurant("Giraffas",
            R.drawable.restaurante_giraffas,"132 Morar Ways Suite 866 - Hagerstown, MT / 06166","Fecha ás 00:00",
            getGiraffas()
        ))
        restaurants.add(Restaurant("Spoleto",
            R.drawable.restaurante_spoleto,"27435 Gerson Greens Suite 695 - Montgomery, AL / 37875","Fecha ás 21:00",
            getSpoleto()
        ))
        restaurants.add(Restaurant("Divino Fogão",
            R.drawable.restaurante_divino,"1452 Ethel Ridge Apt. 743 - Great Falls, MS / 82780","Fecha ás 18:00",
            getDivinoFogao()
        ))
        return restaurants
    }

    private fun getMcDonalds(): List<Plate> {
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.restaurante_mcdonalds,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.restaurante_mcdonalds,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.restaurante_mcdonalds,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.restaurante_mcdonalds,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.restaurante_mcdonalds,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }

    private fun getBurguerKing(): List<Plate> {
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.prato_bk,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.prato_bk,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.prato_bk,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.prato_bk,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.prato_bk,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }

    private fun getSiSenor(): List<Plate> {
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.prato_ss,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.prato_ss,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.prato_ss,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.prato_ss,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.prato_ss,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }

    private fun getOutback(): List<Plate> {
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.prato_out,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.prato_out,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.prato_out,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.prato_out,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.prato_out,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }

    private fun getParis(): List<Plate> {
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.prato_paris,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.prato_paris,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.prato_paris,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.prato_paris,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.prato_paris,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }

    private fun getGrilleto(): List<Plate> {
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.prato_grileto,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.prato_grileto,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.prato_grileto,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.prato_grileto,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.prato_grileto,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }

    private fun getGiraffas(): List<Plate> {
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.prato_girafa,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.prato_girafa,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.prato_girafa,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.prato_girafa,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.prato_girafa,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }

    private fun getSpoleto(): List<Plate> {
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.prato_spoleto,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.prato_spoleto,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.prato_spoleto,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.prato_spoleto,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.prato_spoleto,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }

    private fun getDivinoFogao(): List<Plate>{
        val plates = mutableListOf<Plate>()
        plates.add(Plate("Cardápio 01", R.drawable.prato_divino,"Lorem ipsum suspendisse aenean condimentum leo rutrum quam nisi, nibh augue duis cras convallis nunc. "))
        plates.add(Plate("Cardápio 02", R.drawable.prato_divino,"Sodales metus lacinia posuere odio cursus, commodo ut vitae torquent lorem, condimentum cras ipsum sapien. "))
        plates.add(Plate("Cardápio 03", R.drawable.prato_divino,"Non primis sapien ad adipiscing ut, nulla molestie nulla dui lacus, imperdiet tempus sem turpis. "))
        plates.add(Plate("Cardápio 04", R.drawable.prato_divino,"Pellentesque eget mollis est sodales eleifend, adipiscing eros duis etiam quisque, odio aptent nullam porta. "))
        plates.add(Plate("Cardápio 05", R.drawable.prato_divino,"Litora dapibus mauris aliquet nisi ultrices porttitor turpis vestibulum, elit euismod quisque at torquent donec. "))
        return plates
    }
}