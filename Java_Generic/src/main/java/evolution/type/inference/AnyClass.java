package evolution.type.inference;

import java.util.Arrays;
import java.util.List;

public class AnyClass {
	// Type inference makes it possible to invoke a generic method like an ordinary method. 
	public <T> T anyMethod(T t) {
		System.out.println(t.getClass().getSimpleName());
		return t;
	}
	
	public AnyClass() {
		
	}
	
	public <T> AnyClass(T t) {// Generic Constructor
		System.out.println(t);
	}
	
	public <T> List<T> anotherMethod(List<T> ts) {
		System.out.println(ts);
		return ts;
	}
	
	public <T> Class<T> theOtherMethod(Class<T> clazz) {// You used to do it like this.
		System.out.println(clazz.getSimpleName());
		return clazz;
	}
	
	public <T> void alphaMethod(T t, List<T> ts) {
		System.out.println(t);
		System.out.println(ts);
	}
	 
	public static void main(String[] args) {
		AnyClass anyClass = new AnyClass();
		anyClass.anyMethod(3);
		anyClass.<String>anyMethod("Hello World");
		anyClass.anyMethod("Hello World");
		anyClass.anotherMethod(Arrays.asList("Hello", "World"));
		anyClass.anotherMethod(Arrays.asList(1, 3));
		anyClass.theOtherMethod(String.class);
		anyClass.<Integer>theOtherMethod(Integer.class);// <Integer> is unnecessary.
		anyClass.alphaMethod(3, Arrays.asList(4, 5, 6));
		anyClass = new AnyClass("Hello World");
	}
}
