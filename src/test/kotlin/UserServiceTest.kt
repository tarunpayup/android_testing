package org.example
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever

class UserServiceTest {
    private val repository: UserRepository = mock()
    private val service = UserService(repository)

    @Test
    fun validUserTest(){
        whenever(
            repository.getUserName(101)
        ).thenReturn("Aarthi")
        val result = service.getWelcomeMessage(101)
        assertEquals("Welcome Aarthi",result)
        verify(repository).getUserName(101)
    }

    fun invalidUserTest(){
        whenever(
            repository.getUserName(999)
        ).thenReturn(null)
        val result = service.getWelcomeMessage(999)
        assertEquals("User not found",result)
        verify(repository).getUserName(999)
    }
}