package Zeynep.week1;
public class EvenAndOddNumbers {


    public static void evenOrOdd(int num){
        boolean isEven = num % 2 == 0;
        if(isEven){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(4);
        evenOrOdd(7);
    }
}
