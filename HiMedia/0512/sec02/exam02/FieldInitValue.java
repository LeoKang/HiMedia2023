package sec02.exam02;

public class FieldInitValue {
	byte byteField;
	short shortField;
	int intField;
	long longField;

	public FieldInitValue() {
		System.out.println("constructor...");
	}
	
	public void print() {
		System.out.println("** byteField ** : " + byteField);
	}
}
