package com.example.mvvmexample.models

data class ExchangeRatesResponse(
    val base: String,
    val date: String,
    val rates: Map<String, Double>
)