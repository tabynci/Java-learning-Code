public class SwitchSize {
    public static void main(String[] args) {

        int number = 44;
        String Size;

        switch (number) {
            case 23:
                Size = "Small";
                break;

            case 34:
                Size = "Medium";
                break;
            case 44:
                Size = "Large";
                break;

            default:
                Size = "Unknow";
                break;
        }
        System.out.println("Size" + Size);

    }
}
