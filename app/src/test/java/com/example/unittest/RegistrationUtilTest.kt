package com.example.unittest



import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Philip",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `confirm pass word incorrectly return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "222"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contain less than 2 digits return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "12",
            "12"
        )
        assertThat(result).isFalse()
    }

    // password is empty
    // confirm pass word incorrectly
    // password contain less than 2 regits
}