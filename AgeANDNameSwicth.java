import java.util.Scanner;

public class AgeANDNameSwicth {
    public static void main(String[] args) {
        int age;
        String name;
        Scanner reader = new scanner(System.in);

        System.out.println("Please enter name");

        name = reader.nextLine();
        System.out.println("Enter age");
        age = reader.nextInt();

        System.out.println("your name is " + name);
        System.out.println("Your age is " + age);
    }
}