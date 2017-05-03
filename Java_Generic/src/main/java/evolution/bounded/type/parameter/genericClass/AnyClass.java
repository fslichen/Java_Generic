package evolution.bounded.type.parameter.genericClass;

public class AnyClass<T extends Number>{
	private T number;

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		AnyClass<Double> doubleClass = new AnyClass<>();
		doubleClass.setNumber(3.0);
		AnyClass<Integer> intClass = new AnyClass<>();
		intClass.setNumber(4);
	}
}
