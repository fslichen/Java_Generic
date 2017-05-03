package evolution.bounded.type.parameter.comparable;

import java.util.Arrays;

public class AnyClass {
	public <T extends Comparable<T>> T[] sort(T[] ts) {
		for (int i = 0; i < ts.length - 1; i++) {
			int minJ = i;
			T min = ts[i];
			for (int j = i + 1; j < ts.length; j++) {
				if (min.compareTo(ts[j]) > 0) {
					min = ts[j];
					minJ = j;
				}
			}
			T temp = ts[i];
			ts[i] = min;
			ts[minJ] = temp;
		}
		return ts;
	}
	
	public static void main(String[] args) {
		Float[] numbers = {3f, 7f, 2f, 4f, 5f};
		numbers = new AnyClass().sort(numbers);
		System.out.println(Arrays.asList(numbers));
	}
}
