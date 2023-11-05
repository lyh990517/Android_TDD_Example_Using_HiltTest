package com.example.hilttest

import com.example.hilttest.di.CalculatorModule
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [CalculatorModule::class]
)
abstract class FakeCalculatorModule {

    @Binds
    abstract fun bindsCalculator(calculatorImpl: FakeCalculatorImpl): FakeCalculator
}