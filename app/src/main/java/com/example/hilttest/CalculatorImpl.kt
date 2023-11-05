package com.example.hilttest

import javax.inject.Inject

class CalculatorImpl @Inject constructor() : Calculator {
    override fun add(a: Int, b: Int) = a + b
}