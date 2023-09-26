import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {

        // In hashMap we are used to store keys and values
        HashMap<String, String> FamilyMembers = new HashMap<String, String>();

        FamilyMembers.put("Husband Name", "Farid");
        FamilyMembers.put("WifeName", "Taby");
        FamilyMembers.put("DaughtersName", "Arfa Kulsum");
        FamilyMembers.put("GrandfatherName", "AmeerJan");
        System.out.println(FamilyMembers);
    }
}