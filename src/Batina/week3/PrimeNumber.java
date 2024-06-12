package Batina.week3;

//Numbers -- PrimeNumber
//Write a method that can check if a number is prime or not
//A number is rime if it is only divisible by one and itself
//Ex:
// 7 -> prime, because only 1 divisible by one, and itself (2,3,5,7,11,13, 17)
// 6 -> not prime, because 6 is divisible by 2 and 3 also (4,6,8,9)
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(8));
        System.out.println(isPrime(11));

    }
    public static boolean isPrime(int n) {

        for( int i = 2; i < n; i++){ // loop starts from number 2 and until the number in int n
            if(n % i == 0){    // I am trying prove its wrong if n number is evenly divisible by 2, 3, 4, 5 etc
                return false;

            }
        }


        return true; // i am assuming its true that its a prime number
    }

}
