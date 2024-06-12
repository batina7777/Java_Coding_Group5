package Zeynep.Week2;
/*
/*
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest
and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders
 */


public class PrintConsecutiveNumbers {
    public static void main(String[] args) {
        int n = 30;


        printConsecutiveNumbers(n);

    }

    public static void printConsecutiveNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            String result = "";
            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }
           // System.out.println(result.isEmpty() ? i : result);
            if (result.isEmpty()){
                System.out.println(i);
            }else {
                System.out.println(result);
            }

        }
    }
}
