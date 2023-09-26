import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        // initialize
        int i = 1;
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();

        System.out.println("please enter mumber");
        // for (int i = number; i<number/2; i++){

        // }

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println("SYs" + i);
            }
        }
        System.out.println(i);

    }
}