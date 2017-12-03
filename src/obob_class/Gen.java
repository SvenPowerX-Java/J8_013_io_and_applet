package obob_class;
//Простая ирархия обобщённых классов
//В подкласс могут быть введены свои параметры типа
public class Gen<T> {
	T ob;
	
	public Gen(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
}
