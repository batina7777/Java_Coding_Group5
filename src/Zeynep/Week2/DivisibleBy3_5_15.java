package Zeynep.Week2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {

       /* boolean isDivisibleBy3 = (num %3== 0);
        boolean isDivisibleBy5 = (num %5== 0);
        boolean isDivisibleBy15 = isDivisibleBy5 && isDivisibleBy3 ;*/

        System.out.print("Divisible by 3 : ");
        for (int i = 1; i < 100; i++) {

            boolean isDivisibleBy3 = (i % 3 == 0);
            if (isDivisibleBy3) {

                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Divisible by 5 : ");
        for (int i = 1; i < 100; i++) {

            boolean isDivisibleBy5 = (i % 5 == 0);
            if (isDivisibleBy5) {

                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Divisible by 15 : ");
        for (int i = 1; i < 100; i++) {

            boolean isDivisibleBy15 = ((i % 3 == 0) && (i % 5 == 0) );
            if (isDivisibleBy15) {

                System.out.print(i + " ");
            }


        }

    }
}
