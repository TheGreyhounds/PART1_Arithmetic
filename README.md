# PART1_Arithmetic
Java is very similar to other programming languages in its syntax of arithmetic, so doing maths won't be so bad.

To manipulate numerical values, as almost any program you write will have to, Java - like any programming language -
provides standard "arithmetic operators," which perform all of your basic math functions.

Arithmetic Operators:
- Addition: '+'
- Subtraction: '-'
- Multiplication: '*'
- Division '/'
- Modular '%'

All of these should be familiar to you, except perhaps the modulo: '%'. This operator returns the remainder of a
division, not the division itself. For example, say we told Java to find "7 % 3". 3 goes into 7 evenly two times,
so we subtract 3 x 2 = 6 from 7 and get 1. That is our answer.

If the second number is larger than the first, the the modulo operator will simply return the first number, because
if the second number can't even go once into the first, then there's nothing to subtract. For example, "3 % 7" returns 3.

This code snippet contained more than arithmetic operators, however; it also contained *assignment operators*.
Their form is very similar to to the arithmetic operators. You just have to remember the fundamental difference
between arithmetic operators and assignment operators: arithmetic operators perform their mathematical function,
assignment operators perform their mathematical function *and* save it to the variable. Their syntax is shown below.

Assignment Operators:
- Addition: "+="
- Subtraction: "-="
- Multiplication: "*="
- Division "/="
- Modulo "%="

Since arithmetic is something you've done since preschool, the critical takeaway from this section is recognizing that 
Java doesn't store functions, it stores value. If you set variable 'A' to some value that uses variable 'B' to initialize its
value, and later change variable 'B' to a different value, variable 'A' still stores the exact same value; it does not change
because variable 'B' was changed. You were also likely first introduced to the idea of modular arithmetic in this code snippet, 
and understanding its use is another key takeaway from this repository. If modular arithmetic still confuses you, feel free to 
play around with different modulo expressions and try to get a feel for it. A general formula that may help you is that:
'''
// The "| |" marks signify absolute value
if |a| > |b|:
	a % b = a - (b * n) // where n is the largest integer that also makes |a| > |b * n| true
if |a| < |b|:
	a % b = a
if |a| == |b|:
	a % b = 0
'''