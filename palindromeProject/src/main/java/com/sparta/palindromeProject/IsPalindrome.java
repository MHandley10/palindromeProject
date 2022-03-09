package com.sparta.palindromeProject;

public class IsPalindrome {
    public static boolean isPalindrome(String stringIn) {
        String reverseStringIn = "";
        if (stringIn.length() < 3) {
            return false;
        } else {
            for (int num = stringIn.length() - 1; num >= 0; num--) {
                reverseStringIn = reverseStringIn + stringIn.charAt(num);
            }
            return stringIn.equals(reverseStringIn);
        }

    }
}
