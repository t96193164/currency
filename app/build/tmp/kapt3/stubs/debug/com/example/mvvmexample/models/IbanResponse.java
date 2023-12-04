package com.example.mvvmexample.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lcom/example/mvvmexample/models/IbanResponse;", "", "valid", "", "iban", "", "ibanData", "Lcom/example/mvvmexample/models/IbanData;", "bankData", "Lcom/example/mvvmexample/models/BankData;", "countryIbanExample", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/example/mvvmexample/models/IbanData;Lcom/example/mvvmexample/models/BankData;Ljava/lang/String;)V", "getBankData", "()Lcom/example/mvvmexample/models/BankData;", "getCountryIbanExample", "()Ljava/lang/String;", "getIban", "getIbanData", "()Lcom/example/mvvmexample/models/IbanData;", "getValid", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/example/mvvmexample/models/IbanData;Lcom/example/mvvmexample/models/BankData;Ljava/lang/String;)Lcom/example/mvvmexample/models/IbanResponse;", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class IbanResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "valid")
    private final java.lang.Boolean valid = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "iban")
    private final java.lang.String iban = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "iban_data")
    private final com.example.mvvmexample.models.IbanData ibanData = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "bank_data")
    private final com.example.mvvmexample.models.BankData bankData = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "country_iban_example")
    private final java.lang.String countryIbanExample = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mvvmexample.models.IbanResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean valid, @org.jetbrains.annotations.Nullable()
    java.lang.String iban, @org.jetbrains.annotations.Nullable()
    com.example.mvvmexample.models.IbanData ibanData, @org.jetbrains.annotations.Nullable()
    com.example.mvvmexample.models.BankData bankData, @org.jetbrains.annotations.Nullable()
    java.lang.String countryIbanExample) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public IbanResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean valid, @org.jetbrains.annotations.Nullable()
    java.lang.String iban, @org.jetbrains.annotations.Nullable()
    com.example.mvvmexample.models.IbanData ibanData, @org.jetbrains.annotations.Nullable()
    com.example.mvvmexample.models.BankData bankData, @org.jetbrains.annotations.Nullable()
    java.lang.String countryIbanExample) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getValid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIban() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.mvvmexample.models.IbanData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.mvvmexample.models.IbanData getIbanData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.mvvmexample.models.BankData component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.mvvmexample.models.BankData getBankData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountryIbanExample() {
        return null;
    }
}