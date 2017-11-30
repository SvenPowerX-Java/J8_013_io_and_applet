package obobshenia;

public class NonGen {
	Object object;
	
	public NonGen(Object object) {
		this.object = object;
	}
	
	public Object getObject() {
		return object;
	}
	
	void showType() {
		System.out.println("Type this Object" + object.getClass().getName());
	}
}
