package Tucker.week1;

public class OddOrEven {

    public static void main(String[] args) {

        int num = 27;

        System.out.println(oddEven(num));

    }

    public static String oddEven(int num) {
        String response = "invalid input";
        if (num % 2 == 1) {
            response = "odd";
        } else if (num % 2 == 0) {
            response = "even";
        }
        return response;
    }

}
