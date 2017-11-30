package import_use;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Hypot {
	public static void main(String[] args) {
		double side1, side2;
		double hypot;
		side1 = 3.0;
		side2 = 4.;
		
		hypot = sqrt(pow(side1,2) + pow(side1,2));
		out.println("При заданой длине сторон:");
		out.println("side1 = " + side1);
		out.println("side2 = " + side2);
		out.println("Гипотенуза(hypot) = " + hypot);
	}
}
