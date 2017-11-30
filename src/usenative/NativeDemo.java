package usenative;

public class NativeDemo {
	int i;
	
	public static void main(String[] args) {
		NativeDemo ob = new NativeDemo();
		
		ob.i = 10;
		System.out.println("Содержимое переменной ob.i перед вызовом" +
				"платформенно-ориентированого метода = " + ob.i);
		ob.test();
		System.out.println("Содержимое переменной ob.i После вызова " +
				"платфоменно-ориентированого метода = " + ob.i);
	}
	//Платформенно-ориентированный метод
	public native void test();
	
	//загрузить библиотеку DLL, содержащую статический метод
	static {
		System.loadLibrary("NativeDemo");
	}
}
