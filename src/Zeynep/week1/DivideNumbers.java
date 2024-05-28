package Zeynep.week1;
//Write a method that can divide two numbers without using division operator
public class DivideNumbers {
    public static void main(String[] args) {

        divideNumbers(26, 5);
    }

    public static void divideNumbers(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Can't divide by zero");
            return;
        }
        int count = 0;

        String result = num1 + " / " + num2 + " is ";

        while (num1 >= num2) {
            count++;
            num1 -= num2;
        }

        System.out.println(result + count + " with remainder " + num1);
    }
}

