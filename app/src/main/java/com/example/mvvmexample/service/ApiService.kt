package com.example.mvvmexample.service


import com.example.mvvmexample.models.ExchangeRatesResponse
import com.example.mvvmexample.models.IbanRequest
import com.example.mvvmexample.models.IbanResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("bank_data/iban_validate?")
    suspend fun getLoginResponse( @Query("iban_number") iban_number: String): IbanResponse


    @GET("/fixer/latest")
    fun currencyConverter(
        @Query("base") baseCurrency: String,
        @Query("symbols") symbols: String
    ): ExchangeRatesResponse

    companion object {
        val BASE_URL ="https://api.apilayer.com/"
    }
}