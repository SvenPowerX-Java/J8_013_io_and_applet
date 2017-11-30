package obobshenia;

public class SimpGen {
	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj =
				new TwoGen<Integer, String>(88, "Обобщение");
		
		tgObj.showTypes();
		
		int v = tgObj.getOb1();
		System.out.println("v = " + v);
		
		String str = tgObj.getOb2();
		System.out.println("str = " + str);
	}
}
