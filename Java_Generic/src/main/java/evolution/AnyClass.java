package evolution;

import evolution.type.AnyType;
import evolution.value.AbstractValue;

public class AnyClass extends AbstractClass<AnyType> {
	// Once V extends AbstractValue, v can get call the methods of AbstractValue.
	public <V extends AbstractValue> V anyMethod(V v) {
		return v.anyMethod();
	}
}
