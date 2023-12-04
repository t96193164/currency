package com.example.mvvmexample.iban;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mvvmexample.R;
import com.example.mvvmexample.models.IbanRequest;
import com.example.mvvmexample.models.IbanResponse;
import com.example.mvvmexample.service.NetworkResult;
import com.example.mvvmexample.utility.Helper;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0003J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#H\u0015J\u0006\u0010$\u001a\u00020%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006&"}, d2 = {"Lcom/example/mvvmexample/iban/IbanActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "edtIban", "Landroid/widget/EditText;", "getEdtIban", "()Landroid/widget/EditText;", "setEdtIban", "(Landroid/widget/EditText;)V", "ibanRequest", "Lcom/example/mvvmexample/models/IbanRequest;", "loginBtn", "Landroid/widget/Button;", "getLoginBtn", "()Landroid/widget/Button;", "setLoginBtn", "(Landroid/widget/Button;)V", "mainViewModel", "Lcom/example/mvvmexample/iban/IbanViewModel;", "getMainViewModel", "()Lcom/example/mvvmexample/iban/IbanViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "changeTypeFont", "", "getLoginData", "handleLoginSuccessData", "data", "Lcom/example/mvvmexample/models/IbanResponse;", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "validation", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class IbanActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.example.mvvmexample.models.IbanRequest ibanRequest;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText edtIban;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button loginBtn;
    
    public IbanActivity() {
        super();
    }
    
    private final com.example.mvvmexample.iban.IbanViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getEdtIban() {
        return null;
    }
    
    public final void setEdtIban(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getLoginBtn() {
        return null;
    }
    
    public final void setLoginBtn(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void changeTypeFont() {
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    private final void handleLoginSuccessData(com.example.mvvmexample.models.IbanResponse data) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public final boolean validation() {
        return false;
    }
    
    private final void getLoginData() {
    }
}