package basic_type;

//Demo basic type
public class Gen<T> {
	T ob;
	
	public Gen(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
}
