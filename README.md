# Exercises for coursera

### Week 1

Create a Calculator class that has the following methods: 

* int add(int a, int b)
* int subtract(int a, int b)
* int intAverage(int a, int b) - gives the integer average of 2 numbers (ignores the remainder)
* double doubleAverage(int a, int b) - gives the actual average of 2 numbers as a double
* boolean isPositive(int x) - returns a boolean (true/false) stating whether a number is positive or not.
Note: 0 should return false
* void printPositive(int x) - prints whether a number is positive, negative or 0
* boolean isBigger(int a, int b) - returns a boolean representing whether a is bigger than b.
Note: When a == b, it should return false
* void printBigger(int a, int b) - prints whether a is bigger than b, b is bigger than a, or a ==b
* int hypotenuse(int a, int b) - returns the hypotenuse of a triangle given the 2 other sides.
Note: a^2 + b^2 = h^2
* void nestedIf(int x) - Prints if a number is positive/negative and odd/even. 
Note: For 0 should have a special case, as it is neither positive or negative
* ADVANCED: int sumAll(int[] nums) - Given an array of integers, print their sum
* ADVANCED: double averageAll(int[] nums) - Given an array of integers, prints the average   

### Week 2

Create a class called BasicStringReader that has the following methods
* boolean isFirstOccurrence(String str, int i) - finds whether the character at index i is the first occurrence of the
character. Eg. "abca" i=3 would be false, because 'a' appears at index 0 and 3, so 3 is not the first occurrence 
* boolean hasMultipleOccurrences(String str, char c) - finds whether the character c appears in the string more than once
* boolean countOccurrences(String str, char c) - Counts the number of occurrences of char c in the string str
* boolean startsAndEndsWith(String str, String start, String end) - Returns whether the string starts AND ends with the 
respective strings. NOTE: Both must be true for the method to return true (&&)
* boolean startsOrEndsWith(String str, String startOrEnd) - Returns whether the string starts OR ends with a specific
string. NOTE: Only one has to be true for the method to return true (||)
* boolean comesBefore(String str, char first, char second) - Returns whether the first occurrence of "first" occurs 
before the first occurrence of the string "second".
* boolean occursNextTo(String str, char first, char second) - Returns whether any occurrence of second appears exactly 
one index after any occurrence of first. Note: For this method, first must occur BEFORE second. 
Although technically they could occur next to eachother if second occurs first, this is not what this method 
is supposed to return i.e. if str = "abcabcabc" first = "a" second = "c" should return false, but
if str = "abcabcabc" first = "c" second = "a" should return true
