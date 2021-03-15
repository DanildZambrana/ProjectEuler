package io.github.danildzambrana.projecteuler.problem3;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <br/>
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @see <a href="https://projecteuler.net/problem=3">Problem 3</a>
 */
public class Problem3 {
    public static void main(String[] args) {
        System.out.println(bigPrimeFactor(600851475143L));
    }

    /**
     * Get the max prime factor to number.
     *
     * @param number the number to get the prime factor.
     * @return number with the max prime factor.
     */
    private static long bigPrimeFactor(long number) {
        int index = 2;
        long max = 1;

        while (number > 1) {
            if (isPrime(index) && number % index == 0) {
                number /= index;
                if (index > max) {
                    max = index;
                }
                index = 2;
            } else {
                index++;
            }
        }

        return max;
    }

    /**
     * Check if the value is a prime number.
     * Using Sieve of Eratosthenes.
     * @see <a href="https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes">Sieve of Eratosthenes</a>
     *
     * @param number The number to test.
     * @return true if the number is prime, otherwise return false.
     */
    private static boolean isPrime(long number) {
        return (number == 2 || number == 3 || number == 5 || number == 7) || (number % 2 != 0
                                                                                      && number % 3 != 0
                                                                                      && number % 5 != 0
                                                                                      && number % 7 != 0);
    }
}
