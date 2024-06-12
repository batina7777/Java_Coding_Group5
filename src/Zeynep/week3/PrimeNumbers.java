package Zeynep.week3;
/*
 Numbers -- PrimeNumber
Write a method that can check if a number is prime or not

 */
public class PrimeNumbers {
    public static void main(String[] args) {


        System.out.println(isPrime(18));
        System.out.println(isPrime(19));
        System.out.println(isPrime(63));
        System.out.println(isPrime(71));
    }
    public static boolean isPrime(int num) {
        if (num < 2){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;

            }

        }
        return true;
    }


}
