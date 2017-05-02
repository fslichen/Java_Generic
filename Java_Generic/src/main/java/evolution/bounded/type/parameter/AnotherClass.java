package evolution.bounded.type.parameter;

public class AnotherClass {
	// Given any two numbers under the same type, return their sum in double.
	public <T extends Number> Double add(T number0, T number1) {
		return number0.doubleValue() + number1.doubleValue();
	}
	
	public static void main(String[] args) {
		AnotherClass anotherClass = new AnotherClass();
		anotherClass.add(3.0, 4.0);
		anotherClass.add(new Byte(2 + ""), new Byte(3 + ""));
	}
}
