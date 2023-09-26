import java.util.Scanner;

class NumberBreak {
    public static void main(String[] args) {

        // declare variables

        int number = 10;
        // Scanner reader = new Scanner(System.in);
        // System.out.println("Please enter number");
        // int number = reader.nextInt();

        // for loop to display number
        for (int i = 0; i <= number; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
