package org.example

class LoginValidator {
    fun validateLogin(email:String, password:String): Boolean{
        if (email.isEmpty()){
            return false
        }
        if(password.isEmpty()){
            return false
        }
        if(password.length < 6){
            return  false
        }
        return true
    }
}