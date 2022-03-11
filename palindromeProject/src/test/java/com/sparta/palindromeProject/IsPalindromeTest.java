package com.sparta.palindromeProject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPalindromeTest {

    @Test
    @DisplayName("TestName")
    void testName() {
        assertEquals(false, IsPalindrome.isPalindrome("a"));
    }
}
