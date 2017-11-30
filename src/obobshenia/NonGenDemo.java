package obobshenia;

public class NonGenDemo {
	public static void main(String[] args) {
		NonGen iOb;
		iOb = new NonGen(88);
		iOb.showType();
		
		int v = (Integer) iOb.getObject();
		System.out.println("v = " + v);
		System.out.println();
		
		NonGen strOb = new NonGen("Тест без обобщений");
		strOb.showType();
		
		String str = (String) strOb.getObject();
		System.out.println("str = " + str);
		iOb = strOb;
		v = (Integer) iOb.getObject();
		System.out.println("v = " + v);
	}
}
