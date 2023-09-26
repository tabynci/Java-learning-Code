import java.util.Scanner;
import javax.swing.JOptionPane;

class EvenODD {
    public static void main(String[] args) {
        // initialize

        // int number;
        // int i;
        // Scanner reader = new Scanner(System.in);

        // System.out.println("enter number");
        // number = reader.nextInt();
        // for (i = 1; i <= number; i++) {
        // if (i % 2 == 0) {
        // System.out.print(i + " ");

        // }

        // }

        // for (int j = 1; j <= number; j++) {
        // if (j % 2 != 0) {
        // System.out.print(j + " " + "odd");
        // }

        // }

        // Asking user to print even or odd
        int number;
        int i;
        String str = "";

        Scanner reader = new Scanner(System.in);
        System.out.println("Which number do you print either even or odd ");

        str = reader.nextLine();
        System.out.println(str);
        System.out.println("enter number");
        number = reader.nextInt();

        if (str.equals("even")) {
            for (i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (str.equals("odd")) {

            for (int j = 1; j <= number; j++) {
                if (j % 2 != 0) {
                    System.out.print(j + " ");
                }

            }

        }

    }

}