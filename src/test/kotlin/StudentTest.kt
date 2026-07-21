package org.example
import org.junit.Assert
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class StudentTest {
    private val student = Student()
    @Test
    fun studentNameShouldNotBeNull(){
        val result = student.getStudentName(101)
        assertNotNull(result)
    }
    @Test
    fun studentEmailShouldNotBeNull(){
        val result = student.getStudentEmail(101)
        assertNotNull(result)
    }

    @Test
    fun studentNameShouldBeNull(){
        val result = student.getStudentName(107)
        assertNull(result)
    }
    @Test
    fun studentEmailShouldBeNull(){
        val result = student.getStudentEmail(107)
        assertNull(result)
    }

}