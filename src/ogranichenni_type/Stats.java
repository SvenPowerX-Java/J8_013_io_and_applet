package ogranichenni_type;

//Применение метасимвола
public class Stats<T extends Number> {
	T[] nums; //nums -  это массив значений типа T
	
	public Stats(T[] nums) {
		this.nums = nums;
	}
	double average(){
		double sum = 0.0;
		
		for (T num : nums) {
			sum += num.doubleValue();   //Ошибка!!!
		}
		return sum / nums.length;
	}
	
	boolean sameAvg(Stats<?> ob) {
		if (average() == ob.average()) {
			return true;
		}
		return false;
	}
}
