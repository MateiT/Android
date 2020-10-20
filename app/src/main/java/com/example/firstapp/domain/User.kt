package com.example.firstapp.domain


class User(userNume:String, userEmail:String, userPassword:String) {
    val Id=userEmail+"/"+userPassword
    val Nume=userNume
    val Email=userEmail
    val Password=userPassword

    override fun toString(): String {
        return Nume+", "+Email+", "+Password+"\n";
    }
}