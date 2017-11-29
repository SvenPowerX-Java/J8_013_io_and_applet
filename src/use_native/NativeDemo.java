package use_native;

public class NativeDemo {
	int i;
	
	public static void main(String[] args) {
		NativeDemo ob = new NativeDemo();
		
		ob.i = 10;
		System.out.println("До ob.i = " + ob.i);
		ob.test();
		System.out.println("После ob.i = " + ob.i);
	}
	
	public native void test();
	static {
		System.loadLibrary("NativeDemo");
	}
}
