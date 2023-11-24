package com.example.consumoapisuperhero.Dato

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Api {
    private var retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.214.70:8090/api/")
        .addConverterFactory(GsonConverterFactory.create()).build()
    var llamar = retrofit.create(LoguinInterface::class.java)
}