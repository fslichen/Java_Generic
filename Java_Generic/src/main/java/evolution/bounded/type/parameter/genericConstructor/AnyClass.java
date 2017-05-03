package evolution.bounded.type.parameter.genericConstructor;

public class AnyClass<T extends Number> {
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public AnyClass(T t) {// Constructor for generic type is allowed. 
		this.t = t;
	}
}
