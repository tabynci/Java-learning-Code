// import java.util.Scanner;

// public class Size {
//     public static void main(String[] args) {

//         int number = 44;
//         String Sizes;

//         switch (number) {
//             case 23:
//                 Sizes = "Small";
//                 break;

//             case 34:
//                 Sizes = "Medium";
//                 break;
//             case 44:
//                 Sizes = "Large";
//                 break;

//             default:
//                 Sizes = "Unknow";
//                 break;
//         }
//         System.out.println("Shirt size is " + Sizes);

//     }
// }

// ALternate method

import java.util.Scanner;

public class Size {
    public static void main(String[] args) {

        String Sizes;

        Scanner readerSize = new Scanner(System.in);

        System.out.println("Please enter size");
        int number = readerSize.nextInt();

        switch (number) {
            case 23:
                Sizes = "Small";
                break;

            case 34:
                Sizes = "Medium";
                break;
            case 44:
                Sizes = "Large";
                break;

            default:
                Sizes = "Unknow";
                break;
        }
        System.out.println("Shirt size is " + Sizes);

    }
}
