package org.example

interface UserRepository {
    fun getUserName(userId:Int):String?
}