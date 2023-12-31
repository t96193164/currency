// Generated by Dagger (https://dagger.dev).
package com.example.mvvmexample.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideOkHttp();
  }

  public static NetworkModule_ProvideOkHttpFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideOkHttp() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttp());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideOkHttpFactory INSTANCE = new NetworkModule_ProvideOkHttpFactory();
  }
}
