package evolution.bounded.example;

import evolution.bounded.example.type.AnotherType;
import evolution.bounded.example.value.AbstractValue;

public class AnotherClass extends AbstractClass<AnotherType> {
	public <V extends AbstractValue> V anyMethod(V v) {
		return v.anyMethod();
	}
}
