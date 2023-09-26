import java.util.Scanner;

public class ageAndName {
    public static void main(String[] args) {
        int age = Integer.parseInt(23);
        String name = "taby";

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter name");

        name = reader.nextLine();

        // System.out.println("your name is " + name);

        // switch (name) {
        // case 1:
        // name = "taby";
        // break;
        // case 2:
        // name = "tara";
        // break;
        // default:
        // name = "Unknown Name";
        // break;
        // }
        // System.out.println("Your age is " + age);
    }
}