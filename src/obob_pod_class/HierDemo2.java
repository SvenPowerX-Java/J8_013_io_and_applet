package obob_pod_class;

public class HierDemo2 {
	public static void main(String[] args) {
		
		Gen<String> w = new Gen<String>("Добро пожаловать", 47);
		System.out.print(w.getOb() + " ");
		System.out.println(w.getNum());
	}
}
