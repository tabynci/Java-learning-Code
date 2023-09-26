class Family {

    // Initialze
    String members;
    String person1;
    String person2;
    int personCount;

    // construct
    public Family(String FamilyName, String person1, String person2, String person3, String person4, int personCount) {
        this.members = FamilyName;
        this.person1 = person1;
        this.person2 = person2;
        this.person1 = person3;
        this.person2 = person4;

        this.personCount = personCount;
    }

    // method1
    public String getFamilyName() {
        return FamilyName;
    }

    // method2
    public String getPerson1() {
        return person1;
    }

    public String getPerson2() {
        return person2;
    }

    public String getPerson3() {
        return person3;
    }

    public String getPerson4() {
        return person4;
    }

    public int getCount() {
        return personCount;
    }

    @Override
    public String toString() {
        return ("this is out family name" + this.familyName + ".\n Hi my name is " + this.getPerson2()
                + "\nFamily head name is" + this.person1 + "\nEldest Son name is" + this.person2
                + "\nYounger one name is");
    }

    public static void main(String[] args) {
        Family Allpeople = new Family("Noor", "Farid", "Tabasum", "Zaki", "Taqi", 4);
        System.out.println(Allpeople.toString());
    }
}