package com.example.mvvmexample.iban

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmexample.models.ExchangeRatesResponse
import com.example.mvvmexample.models.IbanRequest
import com.example.mvvmexample.models.IbanResponse
import com.example.mvvmexample.service.NetworkResult

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class IbanViewModel @Inject constructor(
    private val loginRepository: IbanRepository
) : ViewModel() {

    private var _IbanValidationResponse = MutableLiveData<NetworkResult<IbanResponse>>()
    val ibanValidationResponse: LiveData<NetworkResult<IbanResponse>> = _IbanValidationResponse


    private var _ExchangeResponse = MutableLiveData<NetworkResult<ExchangeRatesResponse>>()
    val ExchangeResponse: MutableLiveData<NetworkResult<ExchangeRatesResponse>> = _ExchangeResponse

//    init {
//        fetchLoginDetails()
//    }

    fun fetchLoginDetails(loginRequest: IbanRequest) {
        try {
            viewModelScope.launch {
                loginRepository.getLoginData(
                    loginRequest.iban_number,
                    loginRequest.iban_number.toString()
                ).collect {
                    _IbanValidationResponse.postValue(it)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun fetchCurrencyEXchange(exchangeCountry: String, s: String) {
        try {
            viewModelScope.launch {
                loginRepository.getCurrencyExchange(exchangeCountry,s).collect {
                    _ExchangeResponse.postValue(it)
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}