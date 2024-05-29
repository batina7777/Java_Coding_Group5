package Batina.week1;

public class OddOrEven {
    public static void main(String[] args) {

        String s1 = returnOddOrEven(4);
        System.out.println(s1);

        String s2 = returnOddOrEven(3);
        System.out.println(s2);

    }

    public static String returnOddOrEven(int number){

        if(number % 2 == 0){
            return number + " - Even number";
        }else{
            return number + " - Odd number";
        }


    }


}

/* Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */
