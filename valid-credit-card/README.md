# valid-credit-card

This program checks if the provided credit card number is valid. To be valid, it needs to pass the 
Luhn test, which is described below: 

1. Remove the last digit (this is the "check digit").

2. Reverse the number.

3. Double the value of each digit in odd-numbered positions. If the doubled value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 ➞ 1 + 6 = 7).

4. Add all digits.

5. Subtract the last digit of the sum (from step 4) from 10. The result should be equal to the check digit from step 1.

The credit card numbers also have to be between 14-19 digits in length.
