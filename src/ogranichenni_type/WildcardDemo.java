package ogranichenni_type;

public class WildcardDemo {
	public static void main(String[] args) {
		Integer inums[] = {1, 2, 3, 4, 5};
		Stats<Integer> iob = new Stats<Integer>(inums);
		double v = iob.average();
		System.out.println("Среднее значение iob v = " + v);
		
		Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5,};
		Stats<Double> dob = new Stats<Double>(dnums);
		double w = dob.average();
		System.out.println("Среднее значение dob w = " + w);
		
		Float fnum[] = {1.F, 2.F, 3.F, 4.F, 5.F};
		Stats<Float> fob = new Stats<Float>(fnum);
		double x = fob.average();
		System.out.println("Среднее значение x = " + x);
		
		//Выяснить, какие массивы имеют одинаковые средние значения
		System.out.println("Cредние значения iob и dob");
		if (iob.sameAvg(dob)) System.out.println("равны");
		else System.out.println("Отдтчаются");
		
		System.out.println("Средние iob и fob ");
		if (iob.sameAvg(fob)) System.out.println("Одинаковы");
		else System.out.println("Отличаются");
	}
}
