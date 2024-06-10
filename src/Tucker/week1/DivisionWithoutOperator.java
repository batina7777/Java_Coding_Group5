package Tucker.week1;

public class DivisionWithoutOperator {

    public static int division(int num1, int num2){
        int quotient = 0;
        boolean negativeResult = false;

        if(num1 == 0 || num2 == 0 ){
            quotient = 0;
        }

        if(num1 < 0){
            num1 = -num1;
            if(num2 < 0){
                num2 = -num2;
            } else
                negativeResult = true;
            } else if(num2 < 0){
                num2 = - num2;
                negativeResult = true;
            }


        while(num1 >= num2) {
            num1 = num1 - num2;
            quotient++;
        }

        if(negativeResult) {
            quotient = -quotient;
        }

        return quotient;
        }

    public static void main(String[] args) {
        System.out.println(division(1567, 45));
    }


    }

    /*
    Write a method that can divide two numbers without using division operator
     */

