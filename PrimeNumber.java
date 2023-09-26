import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        // initialize

        int count = 0;
        Scanner reader = new Scanner(System.in);
        // System.out.println("please enter number");
        // int number = reader.nextInt();
        int n = 2;
        int m = 0;
        int flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + "is not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(i + " not Prime number");
                    flag = 1;
                    break;
                }

            }
        }

        // while (i <= number) {
        // if (number % i == 0) {
        // System.out.println("SYs" + i);

        // count++;
        // }
        // i++;
        // }
        // System.out.println(i);

    }
}