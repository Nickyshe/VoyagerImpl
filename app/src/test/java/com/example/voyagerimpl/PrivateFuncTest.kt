package com.example.voyagerimpl

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.lang.reflect.Method

class PrivateFuncTest {


    @Test
    fun testMultiply() {
        val privateFunc = PrivateFunc()

        val multiplyMethod: Method = PrivateFunc::class.java.getDeclaredMethod("multiply", Int::class.java, Int::class.java)
        multiplyMethod.isAccessible = true // Allow access to the private method

        val result = multiplyMethod.invoke(privateFunc, 3, 4) as Int
        assertEquals(12, result)


    }
}