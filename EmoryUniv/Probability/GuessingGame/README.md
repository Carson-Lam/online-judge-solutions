# GuessingGame

## Problem Description
Simulate a guessing game where the user attempts to guess a randomly generated value from 0 to 50. Allow the user 5 tries and prompt the user to replay the game after a successful guess or all tries have been used
## Input Specifications
The input will be 5 positive integer guesses that attempt to guess the hidden value based on post-guess feedback.

## Output Specifications
The output will be based on the user's guess; the system will attempt to guide the user towards the true value and inform the user when their guess is correct/they have used all of their tries.

## Sample I/O

### Sample Input
```
30
20
10
15
17
N
```

### Sample Output
```
Welcome to the guessing game.
Input #1 - Please guess a number (0-50):
30
Your guess is too high
Input #2 - Please guess a number (0-50):
20
Your guess is too high
Input #3 - Please guess a number (0-50):
10
Your guess is too low
Input #4 - Please guess a number (0-50):
15
Your guess is too low
Input #5 - Please guess a number (0-50):
17
Your guess is too low
You use all of your chances. The correct number is: 19
Do you want to play one more time? (Y/N)
```

