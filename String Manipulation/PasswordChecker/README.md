# Password Checker
Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
Create a password checker that takes a user's attempts at guessing the password and determines whether or not they guessed correctly. The user is given 3 chances to guess. After that, if they have not guessed correctly, they are locked out from further attempts.

## Input Specifications
The first line of input is a string consisting of no more than 500 ASCII characters representing the actual password.  
There will be up to 3 additional lines representing the user's guess.

## Output Specifications
If the guess matches the password exactly, output `Access granted.` and end the program.  
Otherwise, output `Incorrect.` After the third incorrect guess, output `Access denied.` and end the program.  
**Note**: Passwords can have spaces so if you are using Java and the Scanner class, use `nextLine()` for input.

## Sample I/O

### Sample Input 1
`abc`  
`acd`  
`abc`

### Sample Output 1
`Incorrect.`  
`Access granted.`

### Sample Input 2
`abc def`  
`a`  
`b`  
`c`

### Sample Output 2
`Incorrect.`  
`Incorrect.`  
`Incorrect.`  
`Access denied.`
