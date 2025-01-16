# Quadratic Equation
Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
The quadratic formula can be used to calculate the roots (values of `x`) for any equation of the format  
`a * x^2 + b * x + c = 0`.  
The quadratic formula is as follows:  
`x = (-b ± √(b^2 - 4ac)) / 2a`

Determine whether or not a quadratic equation has real roots, then determine if there are multiple. If there are multiple roots, find them.

## Input Specification
- The first line is the value of `a`.
- The second line is the value of `b`.
- The third line is the value of `c`.
These values will be between `-100` and `100`. They will not be `0`.

## Output Specification
- If there are no real roots, print `No real roots.`  
- If there is one real root, print `One real root.`  
- Otherwise, print the roots rounded to 2 decimal places, with each root on a new line with `x1` followed by `x2`.  
- **Do not print trailing zeros.**

## Sample I/O

### Sample Input 1
```
1
5
23
```
### Sample Output 1
```
No real roots.
```

### Sample Input 2
```
95
105
15
```

### Sample Output 2
```
-0.18
-0.88
```
