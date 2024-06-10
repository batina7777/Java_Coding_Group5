package Tucker.week2;

public class SwapNumbers {

    public static void main(String[] args){
        int num1 = 17;
        int num2 = 4;

        System.out.println("initial num1 = " + num1);
        System.out.println("initial num2 = " + num2);


        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("after num1 = " + num1);
        System.out.println("after num2 = " + num2);



    }
}

// Swap two variable values without using a third variable