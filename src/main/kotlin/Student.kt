package org.example

class Student {
    fun getStudentName(
        rollNumber:Int
    ):String?{
        return when(rollNumber){
            101 -> "Aarthi"
            102 -> "Vimal"
            103 -> "Manoj"
            104 -> "Utpal"
            105 -> "Deeksha"
            else -> null
        }
    }

    fun getStudentEmail(rollNumber: Int):String?{
        return when(rollNumber){
            101 -> "aarthi@gmail.com"
            102 -> "vimal@gmail.com"
            103 -> "manoj@gmail.com"
            104 -> "utpal@gmail.com"
            105 -> "deeksha@gmail.com"
            else -> null

        }
    }
}