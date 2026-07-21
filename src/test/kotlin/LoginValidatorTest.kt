package org.example
import org.junit.Assert
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LoginValidatorTest {
    private val loginValidator = LoginValidator()

    @Test
    fun successfulLoginTest(){
        val result = loginValidator.validateLogin("abc@gmail.com","1234567")
        assertTrue(result)
    }

    @Test
    fun emptyEmailLoginTest(){
        val result = loginValidator.validateLogin("","1234567")
        assertFalse(result)
    }

    @Test
    fun emptyPasswordLoginTest(){
        val result = loginValidator.validateLogin("abc@gmail.com","")
        assertFalse(result)
    }

    @Test
    fun shortLengthPasswordLoginTest(){
        val result = loginValidator.validateLogin("abc@gmail.com","12345")
        assertFalse(result)
    }
}