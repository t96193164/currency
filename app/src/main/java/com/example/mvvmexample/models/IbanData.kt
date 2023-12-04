package com.example.mvvmexample.models

import com.google.gson.annotations.SerializedName

class IbanData {


    @SerializedName("country")
    val country: String? = null

    @SerializedName("country_code")
    val countryCode: String? = null

    @SerializedName("sepa_country")
    val sepaCountry: Boolean?= null

    @SerializedName("checksum")
    val checksum: String?= null

    @SerializedName("BBAN")
    val bban: String?= null

    @SerializedName("bank_code")
    val bankCode: String?= null

    @SerializedName("account_number")
    val accountNumber: String?= null

    @SerializedName("branch")
    val branch: String?= null

    @SerializedName("national_checksum")
    val nationalChecksum: String?= null

    @SerializedName("country_iban_format_as_swift")
    val countryIbanFormatAsSwift: String?= null

    @SerializedName("country_iban_format_as_regex")
    val countryIbanFormatAsRegex: String?= null

}
