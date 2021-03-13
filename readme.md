# Project Euler Solutions

This project shares the solutions of problems in [Project Euler](https://projecteuler.net/)

Can you se the solutions below.

_Problems will be listed as they are solved._

* [Problem 1](src/main/java/io/github/danildzambrana/projecteuler/problem1/Problem1.java)
    * This solution es very simple, only need to use ```%``` to get the rest of the division of numbers. If the rest is
      0 then the number is multiple of other number.
      ```
      if(a % b == 0) {
        a is multiple of b
      }
      ```
* [Problem 2](src/main/java/io/github/danildzambrana/projecteuler/problem2/Problem2.java)
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
        - To get the number of the pair you need to `%` and compare with 2, if the result is `0` then the number is a pair..

```