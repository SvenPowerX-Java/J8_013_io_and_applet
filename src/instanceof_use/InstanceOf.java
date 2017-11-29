package instanceof_use;

public class InstanceOf {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		if (a instanceof A) {System.out.println("а является экземпляром А");}
		if (b instanceof B) {System.out.println("а является экземпляром А");}
		if (c instanceof C) {System.out.println("а является экземпляром А");}
		if (d instanceof D) {System.out.println("а является экземпляром А");}
		
		A ob = d;
		if (ob instanceof D) System.out.println("ob yes type D");
		
		ob = c;
		if (ob instanceof C) System.out.println("ob yes type C");
		
		ob = d;
		if (ob instanceof D) System.out.println("ob yes type D");
		
		ob = d;
		if (ob instanceof D) System.out.println("ob yes type D");
	}
}
