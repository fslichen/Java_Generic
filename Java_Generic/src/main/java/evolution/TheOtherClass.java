package evolution;

import evolution.type.TheOtherType;
import evolution.value.AbstractValue;

// TheOtherType should extend from AbstractType.
public class TheOtherClass extends AbstractClass<TheOtherType> {
	public <V extends AbstractValue> V anyMethod(V v) {
		return v.anyMethod();
	}
}
