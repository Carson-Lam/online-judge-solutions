# Car Payment
Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
Jack is trying to pay off his new car, a Toyota Corolla 2011. Write him a program that determines how much money he needs to pay each month to finish paying off his car in *m* months if the principal amount he owes *p* is provided and the rate of interest *r* is given. The monthly payment is calculated using the following formula:

![CarPayment formula](./pictures/CarPayment.png)


Given the principal amount, the annual interest rate, and the number of months to pay off the loan, calculate the monthly payment Jack should make.

## Input Specification
- The first line of input is the principal amount `p (1<= p <= 1,000,000)`.
- The second line is the annual interest rate `r (0<r<1)`.
- The third line is the number of months `m (1<=m<=10,000)` (the loan term in months).

## Output Specification
Rounded to 2 decimals and using double precision floating-point math, including trailing zeroes, print the monthly payment Jack should pay in order to pay off his car in `m` months.

**Note:** Do not use DecimalFormat for this question. Use `System.out.printf()`.

## Sample I/O

### Sample Input
```
20000
0.07
48
```
### Sample Output
`478.92`