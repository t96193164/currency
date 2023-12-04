package com.example.mvvmexample.iban

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmexample.R
import com.example.mvvmexample.models.ExchangeRatesResponse
import com.example.mvvmexample.models.IbanRequest
import com.example.mvvmexample.models.IbanResponse
import com.example.mvvmexample.service.NetworkResult
import com.example.mvvmexample.utility.Helper

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IbanActivity : AppCompatActivity(), View.OnClickListener {
    private val mainViewModel: IbanViewModel by viewModels()
    private lateinit var ibanRequest: IbanRequest
    var edtIban: EditText? = null
    var loginBtn: Button? = null
    var btnCurrency :Button?= null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            setContentView(R.layout.activity_login)
            edtIban = findViewById(R.id.edtIban)

            loginBtn = findViewById(R.id.btnLogin)

            btnCurrency = findViewById(R.id.btnCurrency)

           changeTypeFont()

            loginBtn?.setOnClickListener(this)

            btnCurrency?.setOnClickListener { this }



            mainViewModel.ibanValidationResponse.observe(this){
                when(it){
                    is NetworkResult.Loading -> {
                        // show loading stuff

                    }

                    is NetworkResult.Success -> {
                        // 200 -300, 500
                        //                    Toast.makeText(this, it.data.message, Toast.LENGTH_SHORT).show()
                        handleLoginSuccessData(it.data)
                    }

                    is NetworkResult.Failure -> {
                        // Internet failure
                    }
                }
            }


            mainViewModel.ExchangeResponse.observe(this){
                when(it){
                    is NetworkResult.Loading -> {
                        // show loading stuff

                    }

                    is NetworkResult.Success -> {
                        // 200 -300, 500
    //                    Toast.makeText(this, it.data.message, Toast.LENGTH_SHORT).show()
                        handleValidationSuccessData(it.data)
                    }

                    is NetworkResult.Failure -> {
                        // Internet failure
                    }
                }
            }



        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun changeTypeFont() {
        try {

            Helper.hideSoftKeyBoard(this)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }



    @SuppressLint("SuspiciousIndentation")
    private fun handleLoginSuccessData(data: IbanResponse) {
        try {

            if(data!=null){

              var status=  data.valid

                if(status!!){
                    Toast.makeText(this,"Successfully Validated Iban",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this,"Not Valid Iban",Toast.LENGTH_SHORT).show()

                }


            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    private fun handleValidationSuccessData(data: ExchangeRatesResponse) {
        try {

            if(data!=null){





            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    override fun onClick(v: View?) {
        try {
            if (v != null) {
                when (v.id) {

                    R.id.btnLogin -> {

                        if(validation()){
                           getLoginData()
                        }


                    }

                    R.id.btnCurrency -> {

                        getCurrencyExchangeData()
                    }

                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun validation(): Boolean {

       var data= edtIban?.text?.toString();

        if(data.isNullOrEmpty() ){

            Toast.makeText(this,"enter value",Toast.LENGTH_SHORT).show()
            return  false
        }

        return true
    }


    private fun getCurrencyExchangeData() {
        try {

            var data= edtIban?.text?.toString();
            ibanRequest = IbanRequest(data!!)
            mainViewModel.fetchCurrencyEXchange("USD","EUR,GBP")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun getLoginData() {
        try {

            var data= edtIban?.text?.toString();
            ibanRequest = IbanRequest(data!!)
            mainViewModel.fetchLoginDetails(ibanRequest)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}
