package Batina.week1;
/*
Numbers -- Swap Numbers
Swap two variable values without using a third variable

 */
public class SwapTwoNumbers {
    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        a = a + b;  // 4+10 = 14   // a=14
        b = a - 10; // 14-10 = 4   // b=4
        a = a - b;  // 14-4 = 10   // a=10

        System.out.println("a " + a);
        System.out.println("b " + b);

    }
}
