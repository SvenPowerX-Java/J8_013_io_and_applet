package obo_class_instanceof;

public class Gen<T> {
	protected T ob;
	
	public Gen(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		System.out.print("Метод getob() из класса Gen: ");
		return ob;
	}
}
