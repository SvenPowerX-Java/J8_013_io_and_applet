package obob_class;
//Подкласс,производный от класса Gen, где
//определяется второй параметр типа V
public class Gen2<T, V> extends Gen<T> {
	V ob2;
	
	public Gen2(T ob, V ob2) {
		super(ob);
		this.ob2 = ob2;
	}
	
	V getOb2(){
		return ob2;
	}
	
}
