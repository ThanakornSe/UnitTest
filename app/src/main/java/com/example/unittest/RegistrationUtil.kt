package com.example.unittest

object RegistrationUtil {

    /**
     * the input is not valid if
     * ..username/password is empty
     * ..username is already taken
     * ..the confirm password != password
     * ..password contain less than 2 digits
     */

    val existingUser = listOf("Peter","Carl")

    fun validateRegistrationInput(
        username:String,
        password:String,
        confirmedPassword:String
    ):Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUser) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count {it.isDigit()} < 2 ){
            return false
        }
        return true
    }
}