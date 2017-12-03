package obo_class_instanceof.bridge_method;

import obo_class_instanceof.Gen;

public class Gen2 extends Gen<String> {
	Gen2(String o) {
		super(o);
	}
	
	@Override
	public String getOb() {
		System.out.println("Вызван метод String getob(): ");
		return ob ;
	}
}
