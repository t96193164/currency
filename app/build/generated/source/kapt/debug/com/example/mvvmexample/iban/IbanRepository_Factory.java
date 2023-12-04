// Generated by Dagger (https://dagger.dev).
package com.example.mvvmexample.iban;

import com.example.mvvmexample.service.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class IbanRepository_Factory implements Factory<IbanRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public IbanRepository_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public IbanRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static IbanRepository_Factory create(Provider<ApiService> apiServiceProvider) {
    return new IbanRepository_Factory(apiServiceProvider);
  }

  public static IbanRepository newInstance(ApiService apiService) {
    return new IbanRepository(apiService);
  }
}
