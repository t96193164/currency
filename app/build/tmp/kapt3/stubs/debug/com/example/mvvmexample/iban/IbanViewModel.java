package com.example.mvvmexample.iban;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.mvvmexample.models.IbanRequest;
import com.example.mvvmexample.models.IbanResponse;
import com.example.mvvmexample.service.NetworkResult;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/mvvmexample/iban/IbanViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/example/mvvmexample/iban/IbanRepository;", "(Lcom/example/mvvmexample/iban/IbanRepository;)V", "_IbanValidationResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/mvvmexample/service/NetworkResult;", "Lcom/example/mvvmexample/models/IbanResponse;", "ibanValidationResponse", "Landroidx/lifecycle/LiveData;", "getIbanValidationResponse", "()Landroidx/lifecycle/LiveData;", "fetchLoginDetails", "", "loginRequest", "Lcom/example/mvvmexample/models/IbanRequest;", "app_debug"})
public final class IbanViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mvvmexample.iban.IbanRepository loginRepository = null;
    private androidx.lifecycle.MutableLiveData<com.example.mvvmexample.service.NetworkResult<com.example.mvvmexample.models.IbanResponse>> _IbanValidationResponse;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.mvvmexample.service.NetworkResult<com.example.mvvmexample.models.IbanResponse>> ibanValidationResponse = null;
    
    @javax.inject.Inject()
    public IbanViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mvvmexample.iban.IbanRepository loginRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mvvmexample.service.NetworkResult<com.example.mvvmexample.models.IbanResponse>> getIbanValidationResponse() {
        return null;
    }
    
    public final void fetchLoginDetails(@org.jetbrains.annotations.NotNull()
    com.example.mvvmexample.models.IbanRequest loginRequest) {
    }
}