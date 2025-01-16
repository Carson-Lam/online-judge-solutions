# Exponent Calculation
Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
In mathematics, there is a very special constant that can help with calculating exponents. The constant `e`, which is approximately 2.71828, can calculate `x^y` using the formula `e^(y * log(x))`. Using the following Java methods, use `e` to calculate an exponent, then use `Math.pow` to calculate it again.
```
Math.exp(double)
Math.log(double)
```

## Input Specification
The first line of input contains `x` (1 <= x <= 100).  
The next line of input contains `y` (1 <= y <= 100).

## Output Specification
On the first line, output the calculated value of `x^y` using the formula `e^(y * log(x))`.
On the next line, output the value of `x^y` using the `Math.pow` method.

## Sample I/O

### Sample Input
```
7
5
```
### Sample Output
```
16806.99999999998
16807.0
```