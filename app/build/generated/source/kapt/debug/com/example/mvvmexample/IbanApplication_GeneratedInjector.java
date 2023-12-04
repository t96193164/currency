package com.example.mvvmexample;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = IbanApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface IbanApplication_GeneratedInjector {
  void injectIbanApplication(IbanApplication ibanApplication);
}
