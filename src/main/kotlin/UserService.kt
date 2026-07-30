package org.example

class UserService(
    private val repository: UserRepository
) {
    fun getWelcomeMessage(userId:Int):String{
        val name = repository.getUserName(userId)
        return if (name != null){
            "Welcome $name"
        }else{
            "User not found"
        }
    }
}