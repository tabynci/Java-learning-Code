import java.util.ArrayList;
import java.util.LinkedList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        LinkedList<String> animals = new LinkedList<String>();
        animals.add("tiger");
        animals.add("lion");
        animals.add("lionCubs");
        System.out.println(animals);
    }
}