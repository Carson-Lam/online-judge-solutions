# Package Delivery

Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
The Package Delivery service will only deliver packages that fit within their constraints. A package will not be delivered if:
- It is greater than 27 kilograms in weight or
- Its size exceeds 100,000 centimeters cubed.

Determine if a given package will be accepted by the delivery service.

## Input Specification
Four lines of input will each contain an integer. The first line will be the weight of the package in kilograms.  
The next 3 lines will be the dimensions of the package, the length, width, and height.

## Output Specification
If the package is too heavy and too large, output `Too heavy and too large`.

If the package is too heavy but not too large, output `Too heavy`.

If the package is too large but not too heavy, output `Too large`.

If the package can be delivered, output `Pass`.

## Sample I/O 

### Sample Input
```
5
23
1
5
```
### Sample Output
```
Pass.
```