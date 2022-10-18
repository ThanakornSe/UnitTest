package com.example.unittest

import com.example.unittest.HomeWork1.checkBraces
import com.example.unittest.HomeWork1.fib
import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeWork1Test {

    @Test
    fun `fib(0) = 0`() {
        val result = fib(
            0
        )
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `fib(1) = 1`() {
        val result = fib(
            1
        )
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fib(n) = fib(n-2) + fib(n-1)`() {
        val n = 2
        val result = fib(
            n
        )
        assertThat(result).isEqualTo(fib(n-2)+fib(n-1))
    }

    @Test
    fun `Checks if the braces are set correctly`(){
        val result = checkBraces("(abc)")
        assertThat(result).isTrue()
    }

    @Test
    fun `Checks if the braces are set incorrect`(){
        val result = checkBraces("(abc)))(")
        assertThat(result).isFalse()
    }
}