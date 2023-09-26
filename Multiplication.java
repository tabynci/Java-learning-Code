import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        // initliaze
        int total = 0;

        // created scanner class
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the table");
        int table = reader.nextInt();
        System.out.println("Please enter the length");

        int number = reader.nextInt();

        // for loop
        for (int i = 1; i <= number; i++) {
            total = table * i;
            // System.out.println(total);
            System.out.println(table + "  * " + i + "  =  " + total);
        }
        reader.close();
    }
}