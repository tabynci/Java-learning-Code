import java.util.Scanner;

// public class Vowel {
//     public static void main(String[] args) {
//         Scanner reader = new Scanner(System.in);
//         System.out.println("please enter a character");
//         char ch = reader.next().charAt(0);
//         // char ch = 'i';

//         if (ch == 'a' | ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//             System.out.println("character is vowel" + ch);
//         } else {
//             System.out.println("consonant");
//         }

//     }
// }

//Another method

public class Vowel {
    public static void main(String[] args) {

        char ch = 'i';
        // char ch = 'i';

        if (ch == 'a' | ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("character is vowel   :  " + ch);
        } else {
            System.out.println("consonant");
        }

    }
}