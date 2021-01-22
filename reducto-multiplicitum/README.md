# reducto-multiplicitum

The goal of the kata was to make a program that takes a sequence of numbers, and converts it
into a single digit number through a specific process.

The following pseudo code was given:

    sumDigProd(16, 28) -> 6
    16 + 28 = 44
    4 * 4 = 16
    1 * 6 = 6

The finished program starts by adding the sequence of numbers together, but only if
the sequence provided contains more than a single number and its value is greater than 10 (if the
number is less than 10, then it's already a single digit, so the number is simply returned). The 
sum is then passed into the *multiply* method, which wil iterate the digits of the numbers 
(by converting it to a String, and extracting each char), and multiply them together. This method will go on recursively, 
until the product only is a single digit number (< 10).

Tests to pass were given for this kata, and the program was created using the TDD practice. 