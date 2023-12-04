package com.example.mvvmexample.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class IbanResponse(


    @SerializedName("valid")
    @Expose
    val valid: Boolean?,

    @SerializedName("iban")
    @Expose
    val iban: String?,

    @SerializedName("iban_data")
    @Expose
    val ibanData: IbanData?,

    @SerializedName("bank_data")
    @Expose
    val bankData: BankData?,

    @SerializedName("country_iban_example")
    @Expose
    val countryIbanExample: String?


)