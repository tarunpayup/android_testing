import org.example.Assignment
import org.junit.Test
import kotlin.test.assertEquals

class AssignmentTest {
    private val assignment = Assignment()

    @Test
    fun validStudentID(){
        val result = assignment.getStudentName(101)
        assertEquals(expected = "Tarun Bansal", actual = result)
    }
    @Test
    fun invalidStudentID(){
        val result = assignment.getStudentName(106)
        assertEquals(expected = null, actual = result)
    }


    @Test
    fun validEmployeeID(){
        val result = assignment.getEmployeeName(employeeId = 1001)
        assertEquals(expected = "Aman Verma", actual = result)
    }

    @Test
    fun invalidEmployeeID(){
        val result = assignment.getEmployeeName(employeeId = 1007)
        assertEquals(expected = null, actual = result)
    }

    @Test
    fun validProductID(){
        val result = assignment.getProductName(productId = 501 )
        assertEquals(expected = "Laptop", actual = result)
    }

    @Test
    fun invalidProductID(){
        val result = assignment.getProductName(productId = 505)
        assertEquals(expected = null, actual = result)
    }


    @Test
    fun validUserName(){
        val result = assignment.getUserEmail(username = "tarun" )
        assertEquals(expected = "tarun@gmail.com", actual = result)
    }

    @Test
    fun invalidUserName(){
        val result = assignment.getUserEmail(username = "aarthi")
        assertEquals(expected = null, actual = result)
    }
    @Test
    fun validIsbnNumber(){
        val result = assignment.getBookName(isbnNumber="ISBN101")
        assertEquals(expected = "Android Development", actual = result)
    }

    @Test
    fun invalidIsbnNumber(){
        val result = assignment.getBookName(isbnNumber = "ISBN108")
        assertEquals(expected = null, actual = result)
    }

    @Test
    fun validCourseName(){
        val result = assignment.getCourseName(201)
        assertEquals(expected = "Android Development", actual = result)
    }

    @Test
    fun invalidIDCourseName(){
        val result = assignment.getCourseName(courseId = 208)
        assertEquals(expected = null, actual = result)
    }


}