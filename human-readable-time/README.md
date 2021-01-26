# human-readable-time

A program that takes a non-negative integer (seconds), 
and returns the time in a human-readable format (HH:MM:SS). 
The maximum value it takes is 359999, which is 99:59:59
when converted.

This is accomplished by using modulo operations 
on the integer to find hours/minutes/seconds, and
then using String.format() to put together the output
string. 

