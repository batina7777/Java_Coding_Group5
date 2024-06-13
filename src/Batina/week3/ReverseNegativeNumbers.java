package Batina.week3;
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53

 */


public class ReverseNegativeNumbers {
    public static void main(String[] args) {
        int output = reverseNegative(-100);

        System.out.println(output);

    }

    static int reverseNegative(int num) {

        String numString = String.valueOf(num);
        String result = "-";
        int digitNum = -1;

        for (char eachChar : numString.toCharArray()) {
            digitNum++;
        }

        for (int i = digitNum; i > 0; i--) {
            result += numString.charAt(i);
        }

        return Integer.parseInt(result);

    }


    }
