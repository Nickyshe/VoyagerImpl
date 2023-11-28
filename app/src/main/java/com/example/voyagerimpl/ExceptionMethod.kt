package com.example.voyagerimpl

class ExceptionMethod {



    fun divide(dividend: Int, divisor: Int): Int {
            if (divisor == 0) {
                throw IllegalArgumentException("Cannot divide by zero")
            }
            return dividend / divisor
        }
    }

