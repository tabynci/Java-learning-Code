// public class Car {
//     public static void main(String[] args) {
//         String[] Car = { "BMW", "Tesla", "Ford" };
//         for (int i = 1; i < Car.length; i++) {
//             System.out.println(Car[i]);
//         }

//     }
// }

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        String[] Name = { "Tabasum", "Frid" };
        // for (int i = 0; i < cars.length; i++) {
        // System.out.println(cars[i]);
        // }

        // System.out.println(Name[1]);
        // System.out.println(cars.length);

        for (String i : Name) {
            System.out.println(i);
        }
    }
}
