
// class whileloopNumber {
//     public static void main(String[] args) {

//         // declare variables

//         int number = 10;
//         int i = 1;
//         int j= 5;
//         int k = 15;
//         // for loop from 1 to 10
//         Scanner reader = new Scanner(System.in);
//         while (i <= number) {
//             System.out.println(i);
//             i++;
//         }

//     }
// }

import java.util.Scanner;

class whileloopNumber {
    public static void main(String[] args) {

        // declare variables

        int sum = 0;

        // for loop from 1 to 10
        Scanner reader = new Scanner(System.in);
        // take integer from user
        System.out.println("Please enter a number");
        int number = reader.nextInt();
        while (number >= 0) {
            sum += number;
            System.out.println("ENter a number");
            number = reader.nextInt();

        }
        System.out.println("Sum =" + sum);
        reader.close();
    }
}
