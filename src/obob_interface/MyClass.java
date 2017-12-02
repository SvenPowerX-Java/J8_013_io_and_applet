package obob_interface;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;
	
	public MyClass(T[] o) {
		this.vals = o;
	}
	
	@Override
	public T min() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(v)<0) v = vals[i];
		}
		return v;
	}
	
	@Override
	public T max() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(v) > 0) v = vals[i];
		}
		return v;
	}
}
