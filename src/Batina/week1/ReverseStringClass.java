package Batina.week1;

public class ReverseStringClass {
    public static void main(String[] args) {

        String name = "Batina";
        String reversed = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        System.out.println(reversed);

        System.out.println("---------------------------------------");

        String name2 = "hello";
        StringBuilder reversed2 = new StringBuilder(name2).reverse();
        String result = reversed2.toString();
        System.out.println(result); // "olleh"


    }
}
