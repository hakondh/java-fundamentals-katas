# you shall not pass

Program that checks the strength of a password. The check follows different criteria: 

1. It contains at least one lowercase English (non-Nordic) character.
2. It contains at least one uppercase English (non-Nordic) character. 
3. It contains at least one special character.
4. Its length is at least 8.
5. It contains at least one digit. 

There are some strict rules as well, which will cause the suggested password to be invalid - the password *must* be at least 6 characters long, and it *cannot* contain whitespaces. 

The program will print the strength of the password (weak, moderate, strong), and will suggest how to improve the password, if it isn't as strong as possible. 

The check is done by a combination of iterating through the characters in the string (and using methods from the class Character), and some simple regex. 