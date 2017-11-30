package assert_use;

public class AssertDemo {
	static int val = 3;
	static int getnum() {
		return val--;
	}
	
	public static void main(String[] args) {
		int n;
		for (int i = 0; i < 10; i++) {
			n = getnum();
//			assert n > 0; //не подтвердится, если n == 0
			assert (n = getnum()) > 0;  //Неудачная идея!
			System.out.println("n = " + n);
		}
	}
}
