package com.example.mvvmexample.models

import com.google.gson.annotations.SerializedName

class BankData {

    @SerializedName("bank_code")
    val bankCode: String?=null

    @SerializedName("name")
    val name: String? = null

    @SerializedName("zip")
    val zip: String? =null

    @SerializedName("city")
    val city: String? =null

    @SerializedName("bic")
    val bic: String? = null
}