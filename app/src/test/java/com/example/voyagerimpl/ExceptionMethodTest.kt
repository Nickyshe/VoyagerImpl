package com.example.voyagerimpl

import androidx.compose.material3.Divider
import org.junit.Assert.assertThrows
import org.junit.Test

class ExceptionMethodTest {

    @Test
    fun testDivideByZero() {
        val exceptionMethod = ExceptionMethod()

        assertThrows(IllegalArgumentException::class.java) {
            exceptionMethod.divide(10, 0)
        }
    }
}