package obo_class_instanceof.obob_out_type_and_obob;

public class MyClassDemo {
	public static void main(String[] args) {
		MyClass<Integer, String> mcOb = new MyClass<Integer, String>(98, "Строка");
		MyClass<Integer, String> mcOb2 = new MyClass<>(98, "Строка");
		
		if (mcOb.isSame(new MyClass<>(1, "test"))) System.out.println("Same");
		else System.out.println("NotSame");
	}
}
