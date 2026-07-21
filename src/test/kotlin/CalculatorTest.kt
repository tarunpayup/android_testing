package org.example

import org.junit.Assert
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun additionTestCase1(){
        val result = calculator.addition(100,200)
        assertEquals(300,result)
    }

    @Test
    fun additionTestCase2(){
        val result = calculator.addition(-100,200)
        assertEquals(100,result)
    }

    @Test
    fun additionTestCase3(){
        val result = calculator.addition(-100,-200)
        assertEquals(-300,result)
    }



}