package org.example
import org.junit.Assert.*
import org.junit.Test

class ATMTest {
    private val atm = ATM()

    @Test
    fun successWithdrawlTest(){
        val result = atm.withdraw(2000)
        assertEquals(8000,result)
    }

    @Test
    fun invalidWithdrawlAmountTest(){
        assertThrows(IllegalArgumentException::class.java){
            atm.withdraw(-10)
        }
    }

    @Test
    fun insufficientBalanceTestCase(){
        assertThrows(IllegalArgumentException::class.java){
            atm.withdraw(11000)
        }
    }
}