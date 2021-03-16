package io.github.danildzambrana.projecteuler.problem4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @see <a href="https://projecteuler.net/problem=4">Problem 4</a>
 */
public class Problem4 {
    public static void main(String[] args) {
        System.out.println(maxPalindrome(999));
    }

    /**
     * Get the max palindrome number in multiplies up to maxMultiplier
     * @param maxMultiplier the max number to multiply.
     * @return the max palindrome number founded.
     */
    private static long maxPalindrome(long maxMultiplier) {
        long maxValue = 0;

        for (long i = 2; i <= maxMultiplier; i++) {
            for (long x = 2; x <= maxMultiplier; x++) {
                long result = i * x;
                if (isPalindrome(result + "") && result > maxValue) {
                    maxValue = result;
                }
            }
        }

        return maxValue;
    }

    /**
     * Check if value is palindrome.
     *
     * @see <a href="https://en.wikipedia.org/wiki/Palindrome">Palindrome</a>
     * @param value the value to check.
     * @return true if the value is palindrome, otherwise return false.
     */
    private static boolean isPalindrome(String value) {
        StringBuilder builder = new StringBuilder();

        char[] chars = value.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            builder.append(chars[i]);
        }

        return builder.toString().equalsIgnoreCase(value);
    }
}
