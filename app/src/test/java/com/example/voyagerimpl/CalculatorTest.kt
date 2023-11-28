package com.example.voyagerimpl

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalculatorTest {
    @Test
    fun isAdditionCorrect(){
        val calculator = Calculator()

        // Test case: Add positive numbers
        var result = calculator.add(3, 4)
        assertEquals(7, result)

    }
}