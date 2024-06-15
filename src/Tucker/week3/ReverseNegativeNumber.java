package Tucker.week3;

/*
Write a return method that can reverse digits of
a negative number and
return it as int
input: -35
output: -53
 */

public class ReverseNegativeNumber {

    public static void main(String[] args){

        System.out.println("negNumReverse(-53) = " + negNumReverse(-53));
        System.out.println("negNumReverse(75) = " + negNumReverse(75));
        System.out.println("negNumReverse(-28926) = " + negNumReverse(-28926));
        System.out.println("negNumReverse(32876) = " + negNumReverse(32876));


    }

    public static int negNumReverse(int num){
        // Determine if the number is negative
        boolean isNegative = num < 0;

        // Convert the number to a string and remove the negative sign if present
        String numStr = Integer.toString(Math.abs(num));

        // Reverse the string
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        // Convert the reversed string back to an integer
        int reversedNumber = Integer.parseInt(reversedStr);

        // restore the negative sign if the original number was negative
        return isNegative ? -reversedNumber : reversedNumber;


    }

}
