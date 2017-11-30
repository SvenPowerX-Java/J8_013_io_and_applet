package this_use;

public class MyClass {
	int a;
	int b;
	
	public MyClass(int i, int j) {
		a = i;
		b = j;
	}
	
	public MyClass(int a) {
		this(a, a);
	}
	
	public MyClass() {
		this(0);
	}
}
