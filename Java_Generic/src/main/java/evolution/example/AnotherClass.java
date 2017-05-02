package evolution.example;

import evolution.example.type.AnotherType;
import evolution.example.value.AbstractValue;

public class AnotherClass extends AbstractClass<AnotherType> {
	public <V extends AbstractValue> V anyMethod(V v) {
		return v.anyMethod();
	}
}
