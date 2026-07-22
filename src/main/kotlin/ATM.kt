package org.example

class ATM{
    private var balance = 10000

    fun getBalance():Int{
        return balance
    }

    fun withdraw(amount:Int):Int{
        //Amount should be greater than 0
        // Amount should be equals to or lesser then the balance

        if(amount<=0){
            throw IllegalArgumentException(
                "Invalid withdrawl amount."
            )
        }

        if(amount> balance){
            throw IllegalArgumentException(
                "Insufficient Balance"
            )
        }

        balance -= amount // balance = balance - amount
        return balance
    }
}