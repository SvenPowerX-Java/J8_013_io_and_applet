package obo_class_instanceof.obob_out_type_and_obob;

public class MyClass<T, V> {
	T ob1;
	V ob2;
	
	public MyClass(T ob1, V ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	boolean isSame(MyClass<T, V> o) {
		if (ob1 == o.ob1 && ob2 == o.ob2) return true;
		else return false;
	}
}
