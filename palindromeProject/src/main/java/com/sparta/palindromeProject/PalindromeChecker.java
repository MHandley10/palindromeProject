package com.sparta.palindromeProject;

public class PalindromeChecker {
    public static String palindromeChecker(String newStringIn){
        String longestPalindrome = "";
        String[] wordArray = newStringIn.split(" ");
        for (String word : wordArray) {
            if (IsPalindrome.isPalindrome(word)) {
                if (word.length() > longestPalindrome.length()) {
                    longestPalindrome = word;
                }
            }
        }
        return longestPalindrome;  }
}
