package br.com.fiap.appworld.model

import com.google.gson.annotations.SerializedName

data class Weather(
    val main : String = "",
    @SerializedName("name") val city: String = ""
)
