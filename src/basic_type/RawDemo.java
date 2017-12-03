package basic_type;

public class RawDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		Gen<String> strOb = new Gen<String>("Тест обобщений");
		
		Gen raw = new Gen(new Double(98.6));
		double d = (Double) raw.getOb();
		System.out.println("Значение d = " + d);
		
		strOb = raw;
		raw = iOb;
		//Double D = (Double)raw.getOb();
//		d = (double)D;
//		System.out.println("d = " + d);
	}
}
