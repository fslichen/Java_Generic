package evolution.bounded.type.parameter.genericConstructor;

public class SubAnyClass extends AnyClass<Integer> {
	public SubAnyClass(Integer t) {
		super(t);
	}
	
	public static void main(String[] args) {
		SubAnyClass subTheOtherClass = new SubAnyClass(3);
		subTheOtherClass.getT();
	}
}
