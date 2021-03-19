# Assignment 5

### Q1	(10 Marks)

The U.S. Census Bureau projects population based on the following assumptions:

- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds

Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and one year has 365 days.

### Q2	(10 Marks)

Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB to  U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. The latest exchange rate can be found on http://www.xe.com. Here are the sample runs: 

 ```bash
 Enter the exchange rate from dollars to RMB: 6.11 [Enter]
 Enter 0 to convert dollars to RMB and 1 vice versa: 0 [Enter]
 Enter the dollar amount: 100
 $100.0 is 611.0 yuan
 ```
```bash
 Enter the exchange rate from dollars to RMB: 6.11 [Enter]
 Enter 0 to convert dollars to RMB and 1 vice versa: 1 [Enter]
 Enter the RMB amount: 10000 [Enter]
 10000.0 yuan is $1636.66
```

The program should detect when incorrect input is entered at each step and prompt the user to re-enter the required value without requiring the re-running of the program. An example run is shown below: 

```bash
Enter the exchange rate from dollars to RMB: 6.81 
Enter 0 to convert dollars to RMB and 1 vice versa: 5 
Incorrect input, please enter 0 to convert dollars to RMB and 1 vice versa: 1 

Enter the RMB amount: 10000
10000.0 yuan is $1636.66
```

### Q3	(10 Marks)

Write a program that prompts the user to enter the number of seconds, displays a message at every second, and terminates when the time expires. Here is a sample run: 

```bash
Enter the number of seconds: 3 [Enter]
2 Seconds remaining
1 Second remaining
Stopped
```

### Q4	(20 Marks)

 Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is
$$
h = \big(q+\frac{26(m+1)}{10}+k+\frac{k}{4}+\frac{j}{4}+5j\big)\%7
$$

- **h** is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
- **q** is the day of the month.
- **m** is the month (3: March, 4: April, . . ., 12: December). January and February are counted as months 13 and 14 of the previous year.
- **j** is the century (i.e., year / 100).
- **k** is the year of the century (i.e., year % 100).

Note: that the division in the formula performs an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week. Here are some sample runs:

 ```bash
Enter year (i.g., YYYY ): 2015 [Enter]
Enter Month 1-12: 1 [Enter]
Enter the day of the month 1-31: 25 [Enter]

Day of the week is Saturday
 ```
```bash
Enter year (i.g., YYYY ): 2012 [Enter]
Enter Month 1-12: 5 [Enter]
Enter the day of the month 1-31: 12 [Enter]

Day of the week is Saturday
```

### Q5	(50 Marks)

 Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with:

```
4   - for Visa cards
5   - for Master Card
37  - for American Express cards
6   - for Discover cards
```

In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine whether a card number is entered correctly or whether a credit card is scanned correctly by a scanner. Credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626):

 (i) Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number

<img src=".\assets\Q5 Card Number.svg" alt="Q5_card_numbers" style="zoom:50%;" />

 (ii) Now add all single-digit numbers from Step (i)

$$
4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
$$
 (iii) Add all digits in the odd places from right to left in the card number. 

$$
6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
$$
 (iv) Sum the results from Step (ii) and Step (iii).

$$
37 + 38 = 75
$$
 (v) If the result from Step (iv) is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.

Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid. Design your program to use the following methods:

```java
// return true if the card number is valid
public static boolean isValid(long number){
    return false;
}
// get the results from step 2
public static int sumOfDoubleEvenPlace(long number){
    return sum;
}
// return this number if it is a single digit, otherwise, return the sum of the two digits
public static int getDigit(int number){
    return digit;
}
// return sum of odd-place digits in number
public static int sumOfOddPlace(long number){
    return sum;
}
// return true if the digit d is a prefix for number
public static boolean prefixMatched(long number, int d){
    return false;
}
// return the number of digits in d
public static int getSize(long d){
    return num;
}
// return the first "k" number of digits from number. if the number of digits
// in number is less than k, return number
public static long getPrefix(long number, int k){
    return num;
}
```

output:

```bash
Enter a credit card number as a long integer: 4388576018410707 [Enter]
4388576018410707 is Valid
```

```bash
Enter a credit card number as a long integer: 4388576018402626 [Enter]
4388576018402626 is Invalid
```

