package Batina.week1;

public class Finra {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            boolean by5 = i % 5 == 0;
            boolean by3 = i % 3 == 0;

            if(by5 && by3){
                System.out.println("FINRA");
            }else if(by3){
                System.out.println("FIN");
            }else if(by5){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }


        }

    }

}

/*
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
