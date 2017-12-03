package obo_class_instanceof.obob_array;

public class GenArrays {
	public static void main(String[] args) {
		Integer n[] = {1, 2, 3, 4, 5};
		
		Gen<Integer> iOb = new Gen<Integer>(50, n);
		Gen<?> gen[] = new Gen<?>[10];
	}
}
