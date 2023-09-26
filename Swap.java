public class Swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int temp;

        System.out.println("Before swap");
        System.out.println(a);
        System.out.println(b);
        temp = a;

        a = b;
        b = temp;
        System.out.println("After swap");
        System.out.println(a);
        System.out.println(b);
    }
}