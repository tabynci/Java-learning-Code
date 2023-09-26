import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("please enter number");
        int number = reader.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even Number" + number);
        } else {
            System.out.println("odd");
        }

    }
}