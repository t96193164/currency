package com.example.mvvmexample.iban


import com.example.mvvmexample.service.ApiService
import com.example.mvvmexample.service.NetworkResult
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class IbanRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getLoginData(loginRequest: String, toString: String) = flow {
        emit(NetworkResult.Loading(true))
        val response = apiService.getLoginResponse(loginRequest)
        emit(NetworkResult.Success(response))
    }.catch { e ->
        emit(NetworkResult.Failure(e.message ?: "Unknown Error"))
    }

    suspend fun getCurrencyExchange(loginRequest: String, symbol: String) = flow {
        emit(NetworkResult.Loading(true))
        val response = apiService.currencyConverter(loginRequest,symbol)
        emit(NetworkResult.Success(response))
    }.catch { e ->
        emit(NetworkResult.Failure(e.message ?: "Unknown Error"))
    }
}