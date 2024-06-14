package Tucker.week3;

//Write a method that can check if a number is prime or not

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 17;

        System.out.println("primeTime(5) = " + primeTime(5));
        System.out.println("primeTime(17) = " + primeTime(17));
        System.out.println("primeTime(22) = " + primeTime(22));
        System.out.println("primeTime(10) = " + primeTime(10));
        System.out.println("primeTime(0) = " + primeTime(0));
        System.out.println("primeTime(34) = " + primeTime(34));
        System.out.println("primeTime(64) = " + primeTime(64));
        System.out.println("primeTime(33) = " + primeTime(33));
        System.out.println("primeTime(3) = " + primeTime(3));
        System.out.println("primeTime(100_000_001) = " + primeTime(100_000_001));
        System.out.println("primeTime(47) = " + primeTime(47));


    }

    public static boolean primeTime(int number) {
        boolean isPrime = false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0){
                isPrime = true;
                break;
            }
        }

        if (!isPrime){
            isPrime = true;
        } else {
            isPrime = false;
        }
    return isPrime;
    }

}


