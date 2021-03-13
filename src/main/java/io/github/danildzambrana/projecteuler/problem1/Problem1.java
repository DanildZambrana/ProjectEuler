package io.github.danildzambrana.projecteuler.problem1;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @see <a href="https://projecteuler.net/problem=1">Problem 1</a>
 */
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("The sum of the multipliers of 3 and 5 before 1000 is: " + multiples(1000, 3, 5));
    }

    /**
     * Get multiples of provided numbers before max value.
     * @param max the max num to test.
     * @param nums the nums of multiple
     * @return the sum of all multiples of nums
     */
    private static long multiples(long max, int... nums) {
        long index = 0;
        long result = 0;

        while (index < max) {
            for (int num : nums) {
                if (index % num == 0) {
                    System.out.println(index);
                    result += index;
                    break;
                }
            }
            index++;
        }

        return result;
    }
}
