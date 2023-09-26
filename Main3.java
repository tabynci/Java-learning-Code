import java.util.HashSet;
import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        // Hashset used to store unqiue items in the lsit

        HashSet<String> Cars = new HashSet<String>();
        Cars.add("BMW");
        Cars.add("BMW");
        Cars.add("FORD");
        Cars.add("BMW");
        Cars.add("FORD");

        // printing a unique string from list
        // used for loop
        for (String i : Cars) {
            System.out.println(i);
        }

        // System.out.println(Cars);
        LinkedList<String> Animals = new LinkedList<String>();
        Animals.add("Tiger");
        Animals.add("Lion");
        Animals.add("Monkey");
        Animals.add("Giraffee");

        for (int i = 0; i < Animals.size(); i++) {
            System.out.println("New" + Animals.get(i));
        }

        // used For loop to display all the animals
        for (String i : Animals) {
            System.out.println(i);
        }
    }
}