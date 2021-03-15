# Project Euler Solutions

This project shares the solutions of problems in [Project Euler](https://projecteuler.net/)

Can you se the solutions below.

_Problems will be listed as they are solved._

* #### [Problem 1](src/main/java/io/github/danildzambrana/projecteuler/problem1/Problem1.java)
    * This solution es very simple, only need to use `%` to get the rest of the division of numbers. If the rest is 0
      then the number is multiple of other number.
      ```
      if(a % b == 0) {
        a is multiple of b
      }
      ```
* #### [Problem 2](src/main/java/io/github/danildzambrana/projecteuler/problem2/Problem2.java)
    * To find the solution to this problem you need to understand
      the [Fibonacci sequence](https://en.wikipedia.org/wiki/Fibonacci_sequence). After understanding this issue, the
      problem will be a piece of cake.
        - Example:
          Print all values less than 10.
          ```java
          public class Example {
              public static void main(String[] args){
                int before = 0; //The before value.
                int actual = 1; //The actual value.
              
                while(actual <= 10) { //Runs for values less than 10.
                  int result = before + actual; //This var is used to generate the new value.
                  if (result >= 10) { //If the result is 10 or more then break the loop.
                    break;
                  }
                  before = actual; //The actual value now is the before value.
                  actual = result; //The actual value is the value of result.
                  System.out.println("Value: " + actual); //Print the value.
                }
              }
          }
          ```
      Now you need to get pair numbers.
        - To get the number of the pair you need to `%` and compare with 2, if the result is `0` then the number is a
          pair.
* ### [Problem 3](src/main/java/io/github/danildzambrana/projecteuler/problem3/Problem3.java)
    * To find the solution I used the [Sieve of Eratosthenes](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
      algorithm. According to this algorithm, any number divisible by 2, 3, 5 and 7 cannot be a prime number, except for
      2, 3, 5 and 7.

        - You can generate a list of prime numbers using this algorithm, this can serve as a basis for understanding it:
          ```java
            public class SieveEratosthenesExample {
                private List<Long> getPrimeNumbers(long maxValue) {
                  List<Long> result = new ArrayList<>();
                  if (maxValue >= 2 ) { // First add the 2, 3, 5 and 7 to the list if is necesary.
                      result.add(2L);
                      if (maxValue >= 3) {
                          result.add(3L);
                          if (maxValue >= 5) {
                              result.add(5L);
                              if (maxValue >= 7) {
                                  result.add(7L);
                              }
                          }
                      }
                  }
  
                  for (long index = 8; index < maxValue; index++){ //Now generate the prime numbers
                      if (index % 2 == 0 || index % 3 == 0 || index % 5 == 0 || index % 7 == 0) {
                          continue;
                      }
                      result.add(index);
                  }
                return result;
                }
            }
          ```
  _Note: Using large emaciated numbers may cause a memory overflow, this code can only be used for reference._

