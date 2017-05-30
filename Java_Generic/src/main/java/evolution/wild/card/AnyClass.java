package evolution.wild.card;

import java.util.Arrays;
import java.util.List;

public class AnyClass {
	public double anyMethod(List<? extends Number> numbers) {// Type inference is applied.
		double sum = 0;
		for (Number number : numbers) {
			sum += number.doubleValue();
			System.out.println(number);
		}
		return sum;
	}
	
	public void anotherMethod(List<?> objects) {// List<?> is the super class of List<String>, List<Double>, List<Object>...
		for (Object object : objects) {
			System.out.println(object);
		}
	}
	
	public void theOtherMethod(Class<?> clazz) {// Class<?> is very widely used because methods invoked do not depend on T.
		System.out.println(clazz.getName());
	}
	
	public void alphaMethod(List<? super Double> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
	
	public void betaMethod(List<?> numbers) {// List<?> is the super class of both List<Double> and List<Integer>.
		for (Object number : numbers) {
			System.out.println(number);
		}
	}
	
	public void gammaMethod(List<? extends Number> numbers) {// List<? extends Number> is the super class of both List<Double> and List<Integer>.
		for (Object number : numbers) {
			System.out.println(number);
		}
	}
	
	public void deltaMethod(List<? super Number> numbers) {
		List<? super Double> superNumbers = numbers;// List<? super Double> is the super class of List<? super Number>.
	}
	
	void fooMethod(List<?> list) {// To avoid the helper method.
		 fooHelper(list);
    }
	
	private <T> void fooHelper(List<T> list) {
		list.set(0, list.get(0));
    }
	
	public static void main(String[] args) {
		AnyClass anyClass = new AnyClass();
		double sum = anyClass.anyMethod(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(sum);
		anyClass.anotherMethod(Arrays.asList("Hello", "World"));
		anyClass.anotherMethod(Arrays.asList(1, 2, 3, 4));
		anyClass.theOtherMethod(String.class);
		anyClass.alphaMethod(Arrays.asList(3, 4, 2));
		List<Double> doubles = Arrays.asList(3.0, 4.0);
		List<Integer> integers = Arrays.asList(3, 4);
		anyClass.betaMethod(doubles);
		anyClass.betaMethod(integers);
		anyClass.gammaMethod(doubles);
		anyClass.gammaMethod(integers);
		anyClass.fooMethod(Arrays.asList(3, 4, 5));
	}
}
