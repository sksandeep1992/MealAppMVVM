package sk.sandeep.easyfood.api

import retrofit2.Call
import retrofit2.http.GET
import sk.sandeep.easyfood.model.MealList

interface MealApi {


    @GET("random.php")
    fun getRandomMeal() :Call<MealList>
}