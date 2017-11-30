package obobshenia;

public class GenDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb;
		String str = "Welcome to Java world";
		System.out.println(str);
		
		iOb = new Gen<Integer>(88);
		
		iOb.showType();
		
		int v = iOb.getOb();
		System.out.println("v = " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Тест обобщений");
		
		strOb.showType();
		
		String str1 = strOb.getOb();
		System.out.println("str = " + str1);
	}
}
