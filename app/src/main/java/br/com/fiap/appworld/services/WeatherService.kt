package br.com.fiap.appworld.services

import br.com.fiap.appworld.model.Weather
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    @GET("weather?q={city}&units=metric&APPID=56a50941076f404846b75bba2873e0cb")
    fun getWeather(@Path("city") city: String): Call<Weather>
}