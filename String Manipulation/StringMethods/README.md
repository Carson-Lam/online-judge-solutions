# String Methods
Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
The `String` class has boolean methods `startsWith(String prefix)` and `endsWith(String suffix)`. `startsWith` tests whether a string starts with a given substring; `endsWith` tests whether a string ends with a given substring. Pretending that these methods do not exist, write them using other string methods (but no iterations or recursion).

In this problem, you will be given a base string, `S`, and 10 test strings, `T`. Both strings will be composed solely of lowercase letters.

## Input Specifications
- The first line will contain the string `S`.
- The next 10 lines will each contain a string, `T`.

## Output Specifications
- Output `yes` if `S` starts or ends with `T`.
- Output `no` otherwise.

## Sample I/O

### Sample Input
`recursion`  
`rec`  
`recur`  
`ion`  
`on`  
`n`  
`ecur`  
`io`  
`sio`  
`random`  
`a`  

### Sample Output
`yes`  
`yes`  
`yes`  
`yes`  
`yes`  
`no`  
`no`  
`no`  
`no`  
`no`  


