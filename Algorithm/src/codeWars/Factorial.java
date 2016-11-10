package codeWars;

/**
 * In mathematics, the factorial of a non-negative integer n, 
 * denoted by n!, is the product of all positive integers less than or equal to n. 
 * 
 * For example: 5! = 5 * 4 * 3 * 2 * 1 = 120. By convention the value of 0! is 1.
 * 
 * Write a function to calculate factorial for a given input. 
 * If input is below 0 or above 12 
 * throw an exception of type ArgumentOutOfRangeException (C#) 
 * or IllegalArgumentException (Java).
 * More details about factorial can be found here: 
 * (http://en.wikipedia.org/wiki/Factorial)
 * 
 * @author 이민규
 * @date 2016-11-10
 * @ref https://www.codewars.com/kata/factorial/java
 */
public class Factorial {

	  public int factorial(int n) {
	    if(n < 0 || n > 12) throw new IllegalArgumentException();
	    int ret = 1;
	    for(int i = n; i >= 1; i--) {
	      ret = ret * i;
	    }
	    return ret;
	  }
}