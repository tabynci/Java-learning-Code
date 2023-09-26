import java.util.Scanner;

class NameReverse {
    public static void main(String[] args) {
        String name = "";
        String reverseName = "";
        String Sentence = " I LOVE YOU";

        Scanner reader = new Scanner(System.in);
        System.out.println("please enter your name");
        name = reader.nextLine();
        System.out.println("your name is " + name);
        reverseName = new StringBuffer(name).reverse().toString();
        System.out.println(reverseName);
        String SentenceReverse = new StringBuffer(Sentence).reverse().toString();
        System.out.println(SentenceReverse);

        // Concatenate to strings
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        String msg = sb.toString();
        System.out.println(msg);

    }
}