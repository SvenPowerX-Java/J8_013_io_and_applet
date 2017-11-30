package import_use;

import static java.lang.Math.*;

public class Hypot {
	public static void main(String[] args) {
		double side1, side2;
		double hypot;
		side1 = 3.0;
		side2 = 4.;
		
		hypot = sqrt(pow(side1,2) + pow(side1,2));
		System.out.println("При заданой длине сторон:");
		System.out.println("side1 = " + side1);
		System.out.println("side2 = " + side2);
		System.out.println("Гипотенуза(hypot) = " + hypot);
	}
}
