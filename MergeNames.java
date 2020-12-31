import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class MergeNames {

	public static String[] uniqueNames(String[] names1, String[] names2) {
		Set<String> names = new HashSet<String>();

		names.addAll(Arrays.asList(names1));
		names.addAll(Arrays.asList(names2));
		
		return (String[]) names.toArray(new String[names.size()]);
	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
		System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma,
																						// Olivia, Sophia
	}
}
