package org.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CalculatorTest {

    private val calculator = Calculator()
    @ParameterizedTest
    @CsvSource(
        "10,20,30",
        "5,5,10",
        "100,200,300",
        "50,10,60",
        "0,10,10",
        "10,0,10",
        "100,10,110"
    )
    fun additionTest(
        number1:Int,
        number2:Int,
        expected:Int
    ){
        val actual = calculator.addition(number1,number2)
        assertEquals(expected,actual)
    }

    @ParameterizedTest
    @CsvSource(
        "100,10,90",
        "1000,100,900",
        "-100,10,-90",
        "-100,-10,-110"
    )
    fun subtractionTest(
        number1:Int,
        number2:Int,
        expected:Int
    ){
        val result = calculator.subtraction(number1,number2)
        assertEquals(expected,result)
    }


}