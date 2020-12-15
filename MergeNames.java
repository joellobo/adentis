import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> names = new HashSet<String>();
        
        for (int i = 0; i < names1.length; i++) {
           names.add(names1[i]);    
        }
        for (int i = 0; i < names2.length; i++) {
            names.add(names2[i]);
        }
        return (String[]) names.toArray(new String[names.size()]);
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
