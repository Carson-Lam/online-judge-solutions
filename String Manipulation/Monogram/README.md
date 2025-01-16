# Monogram
Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
People can have a first, middle, and last name. From these names, monograms can be formed by combining the first letter from each of their names. The monogram is the **lowercase** version of the first name's first letter, followed by the **uppercase** version of the middle name's first letter, then the **lowercase** version of the last name's first letter. 

For example, for someone named `George paul Alberto`, their monogram is `gPa`.

### Bonus
For an additional bonus point, the person's names can begin with any case. Instead of always using lowercase, uppercase, and lowercase in order, print the **opposite case** of each first letter. For example, for someone named `jOe Y RaBBit`, the monogram is `Jyr`.

## Input Specifications
- The first line of input is the person's first name.
- The second line of input is their middle name.
- The third line is their last name.
- The first name will always begin with a capital letter, the middle name will begin with a lowercase letter, and the last name will begin with a capital letter. The names will only contain lowercase and capital letters.

## Output Specifications
- Print their monogram as specified in the problem description.

## Sample I/O

### Sample Input
`Albert`  
`bert`  
`Corey`  

### Sample Output
`aBc`  

### Bonus Input
`jOe`  
`Y`  
`RaBBit`  

### Bonus Output
`Jyr`
