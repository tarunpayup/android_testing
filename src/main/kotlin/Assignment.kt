package org.example

class Assignment {
    fun getStudentName( studentId: Int ): String? { return when (studentId) { 101 -> "Tarun Bansal" 102 -> "Riya Sharma" 103 -> "Rahul Gupta" else -> null } }

    fun getEmployeeName( employeeId: Int ): String? { return when (employeeId) { 1001 -> "Aman Verma" 1002 -> "Priya Singh" 1003 -> "Rohit Sharma" else -> null } }

    fun getProductName( productId: Int ): String? { return when (productId) { 501 -> "Laptop" 502 -> "Keyboard" 503 -> "Smart Watch" else -> null } }

    fun getUserEmail( username: String ): String? { return when (username) { "tarun" -> "tarun@gmail.com" "riya" -> "riya@gmail.com" "rahul" -> "rahul@gmail.com" else -> null } }

    fun getBookName( isbnNumber: String ): String? { return when (isbnNumber) { "ISBN101" -> "Android Development" "ISBN102" -> "Kotlin Programming" "ISBN103" -> "Software Testing" else -> null } }

    fun getCourseName( courseId: Int ): String? { return when (courseId) { 201 -> "Android Development" 202 -> "Flutter Development" 203 -> "Data Science" else -> null } }
}


/*Rules
* For 1st function - Valid Student ID, Invalid Student ID, Student Does Not Exist
*For 2nd function - Valid emp id, Invalid em id, Employee does not exist
* For 3rd function - Valid product id, Invalid product id, Product does not exist
* For 4th function - Valid username, Invalid username, Username does not exist
* For 5th function - Valid ISBN Number, Invalid ISBN Number, ISBN Number does not exist
* For 6th function - Valid course id, Invalid course id, Course id does not exist
*
* */