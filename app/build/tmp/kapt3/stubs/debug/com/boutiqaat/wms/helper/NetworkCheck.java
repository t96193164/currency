package com.boutiqaat.wms.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import okhttp3.OkHttpClient;
import okhttp3.Request;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/boutiqaat/wms/helper/NetworkCheck;", "", "()V", "isInternetAvailable", "", "mcontext", "Landroid/content/Context;", "isInternetConnectedWithOkHttp", "app_debug"})
public final class NetworkCheck {
    @org.jetbrains.annotations.NotNull()
    public static final com.boutiqaat.wms.helper.NetworkCheck INSTANCE = null;
    
    private NetworkCheck() {
        super();
    }
    
    public final boolean isInternetConnectedWithOkHttp() {
        return false;
    }
    
    public final boolean isInternetAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context mcontext) {
        return false;
    }
}