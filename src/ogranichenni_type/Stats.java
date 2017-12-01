package ogranichenni_type;

//Классоздать Stats - Пример безуспешной попытки создать
//обобщённый класс для вычисления среднего значения
//массива чисел заданного типа
//
//Этоот клас содержит ошибку
public class Stats<T> {
	T[] nums; //nums -  это массив значений типа T
	
	public Stats(T[] nums) {
		this.nums = nums;
	}
	double average(){
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
//			sum += nums[i].doubleValue();   //Ошибка!!!
			return sum / nums.length;
		}
	}
}
