package com.boutiqaat.wms.helper

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.NetworkInfo
import androidx.core.content.ContextCompat.getSystemService
import okhttp3.OkHttpClient
import okhttp3.Request

object NetworkCheck {

    fun isInternetConnectedWithOkHttp(): Boolean {
        val client = OkHttpClient()
        val request = Request.Builder().url("https://google.com").build()
        val response = client.newCall(request).execute()
        return response.isSuccessful
    }

    fun isInternetAvailable(mcontext:Context): Boolean {
        val connectivityManager =
            mcontext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        // Check for network availability using NetworkCapabilities
        val network = connectivityManager.activeNetwork
        val capabilities = connectivityManager.getNetworkCapabilities(network)
        return capabilities != null &&
                (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
                        capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR))
    }



}