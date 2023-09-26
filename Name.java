public class Name {
    // declare Variables
    private int Age;
    private String FirstName;
    private String SecondName;

    // Constructor
    public Name() {
        FirstName = "";
        SecondName = "";
        Age = 0;
    }

    // method
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setSecondName(String SecondName) {
        this.SecondName = SecondName;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

}