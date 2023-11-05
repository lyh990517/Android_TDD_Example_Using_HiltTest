package com.example.hilttest

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class CalculatorTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var calculator: Calculator

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun `숫자를_더한다`() {
        val a = 1
        val b = 2

        val result = calculator.add(a, b)

        assertEquals(3, result)
    }
}