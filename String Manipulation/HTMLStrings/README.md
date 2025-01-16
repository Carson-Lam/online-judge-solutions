
# HTML Tag Validator
Retrieved from [TSSOJ](https://tssoj.ca/)

## Problem Description
Web developers use HTML tags in angle brackets to format text on web pages.

Check whether a given string starts with an apparent HTML tag (a series of characters in angle brackets) and ends with a matching closing HTML tag (the same sequence preceded by the `/` character, all in angle brackets). If yes, remove both tags and return the result. Otherwise, return the original string unchanged.

## Input Specification
The first and only line of input will contain a sequence of no greater than 1000 ASCII characters.

## Output Specification
If the string is bounded by an HTML tag, output the string without the tags. Otherwise, output the original string.

## Sample I/O

### Sample Input 1
`<h1>Strings are immutable</h1>`

### Sample Output 1
`Strings are immutable`

### Sample Input 2
`<b>please help me with uploading these problems, thanks.`

### Sample Output 2
`<b>please help me with uploading these problems, thanks.`
