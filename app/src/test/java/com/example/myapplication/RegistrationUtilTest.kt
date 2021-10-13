package com.example.myapplication


import org.junit.Test
import com.google.common.truth.Truth.assertThat

class RegistrationUtilTest{
@Test
fun `empty username returns false`(){
    val result = RegistrationUtil.validRegistrationInput(
        "","123","123"
    )
    assertThat(result).isFalse()
}@Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validRegistrationInput(
            "Phillip","123","123"
        )
        assertThat(result).isTrue()
    }
@Test
    fun `user already exists`(){
        val result = RegistrationUtil.validRegistrationInput(
            "Curl","123","123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validRegistrationInput(
            "Phillip","",""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password with less than 2-digits returns false`(){
        val result = RegistrationUtil.validRegistrationInput(
            "Phillip","abcdef3","abcdef3"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `incorrectly confirmed password return false`(){
        val result = RegistrationUtil.validRegistrationInput(
            "Phillip","12345","abcdef"
        )
        assertThat(result).isFalse()
    }
}