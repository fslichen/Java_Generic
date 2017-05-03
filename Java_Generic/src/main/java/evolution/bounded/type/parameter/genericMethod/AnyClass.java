package evolution.bounded.type.parameter.genericMethod;

public class AnyClass {
	// Given any two numbers under the same type, return their sum in double.
	public <T extends Number> Double add(T number0, T number1) {
		return number0.doubleValue() + number1.doubleValue();
	}
	
	public static void main(String[] args) {
		AnyClass anotherClass = new AnyClass();
		anotherClass.add(3.0, 4.0);
		anotherClass.add(new Byte(2 + ""), new Byte(3 + ""));
	}
}
