package Batina.week3;
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53

 */


public class ReverseNegativeNumbers {
    public static void main(String[] args) {
        int num = -109;
        int reversedNumber = reverseNegativeNumber(num);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNegativeNumber(int num) {
       /* boolean isNegative = num < 0;
        if (isNegative) {
            num *= -1;
        }
*/
        int reversed = 0;
        while (num < 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed; //isNegative ? reversed * -1 : reversed;
    }
}
