package evolution.type.inference;

import java.util.Collections;
import java.util.List;

public class AnotherClass {
	public static <T> List<String> processStrings(List<String> ts) {
		return ts;
	}
	
 	public static void main(String[] args) {
		List<String> strings = Collections.emptyList();
		strings = Collections.<String>emptyList();// Unnecessary due to target type inference.
		if (strings == null) {
			System.out.println("It's null.");
		} else {
			System.out.println("It's not null.");
		}
		processStrings(Collections.emptyList());// Ok in java 8.
		processStrings(Collections.<String>emptyList());// Ok in both java 7 and 8.
	}
}
