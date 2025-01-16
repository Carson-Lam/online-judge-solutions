# Greatest Common Divisor
Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
A famous algorithm for finding the greatest common divisor (GCD) of two numbers is **Euclid's algorithm**. The algorithm works as follows:  
1. Get the remainder of `num1 / num2`.  
2. Set `num1` to `num2`.  
3. Set `num2` to the remainder found above.  
4. Repeat while `num2` is not zero.  

## Input Specifications
- The input consists of two lines, each containing a positive integer no greater than 1,000,000.

## Output Specifications
- Print the greatest common divisor of the two numbers.

## Sample I/O

### Sample Input
`4`  
`6`

### Sample Output
`2`
