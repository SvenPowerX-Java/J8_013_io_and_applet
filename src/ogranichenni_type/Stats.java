package ogranichenni_type;

//В этой версии класса Stats аргумент T должен быть
//классом Number или наследуемым от него классом
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
}
