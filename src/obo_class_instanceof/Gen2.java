package obo_class_instanceof;

public class Gen2<T> extends Gen<T> {
	public Gen2(T ob) {
		super(ob);
	}
	
	@Override
	public T getOb() {
		System.out.print("Метод getob() из класса Gen2: ");
		return ob;
	}
}
