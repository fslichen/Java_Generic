package evolution;

import evolution.type.AnotherType;
import evolution.value.AbstractValue;

public class AnotherClass extends AbstractClass<AnotherType> {
	public <V extends AbstractValue> V anyMethod(V v) {
		return v.anyMethod();
	}
}
