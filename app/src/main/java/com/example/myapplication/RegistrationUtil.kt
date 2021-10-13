package com.example.myapplication

object RegistrationUtil {
    private val existingUsers = listOf("Peter", "Carl")
    fun validRegistrationInput(
        username: String,
        password: String,
        confirmpassword: String

    ): Boolean {
        if(username.isEmpty() || password.isEmpty()) {
            return false
        }
        if(username in existingUsers) {
            return false
        }
        if(password != confirmpassword) {
            return false
        }
        if(password.count { it.isDigit() } < 2) {
            return false
        }
        return true

    }
}