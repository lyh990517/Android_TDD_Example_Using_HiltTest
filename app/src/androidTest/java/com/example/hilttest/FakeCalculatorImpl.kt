package com.example.hilttest

import javax.inject.Inject

class FakeCalculatorImpl @Inject constructor() : FakeCalculator {
    override fun add(a: Int, b: Int) = a + b
}