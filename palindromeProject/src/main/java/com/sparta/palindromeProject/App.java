package com.sparta.palindromeProject;

public class App {
    public static void main(String[] args) {
        String palindrome = "radar";
        System.out.println(IsPalindrome.isPalindrome(palindrome));
        String palindromeSentence = "This sentence contains 4 palindromes: radar aibohphobia ailihphilia and Bob";
        System.out.println(PalindromeChecker.palindromeChecker(palindromeSentence));
    }

}

