package Batina.week1;
//Write a method that can divide two numbers without using division operator
public class DivisionWithoutOperator {

    public static void main(String[] args) {

        divide(6, 2);

    }

  public static void divide(int n1, int n2){ // 6, 2 -> 4 -> 2 -> 0
      if(n2 == 0){
          System.err.println("CAN NOT DIVIDE BY ZERO");
        return;
      }

      int count = 0;
      String result = n1 + "/ " + n2 + " is ";

      while(n1 >= n2){
          count++;
          n1 -= n2;    // n1 = n1-n2;
      }
      System.out.println(result + count + " with remainder " + n1);
  }




}
