package com.example.hilttest.di

import com.example.hilttest.Calculator
import com.example.hilttest.CalculatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CalculatorModule {
    @Binds
    abstract fun bindsCalculator(calculatorImpl: CalculatorImpl) : Calculator
}