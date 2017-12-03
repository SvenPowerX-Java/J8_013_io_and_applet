package obo_class_instanceof.obob_array;

public class Gen<T extends Number> {
	T ob;
	
	T vals[];
	
	Gen(T o, T[] nums) {
		ob = o;
		vals = nums;
	}
}
