package my_use_math;

import java.util.Scanner;

public class MyCalculations {
	public static void main(String[] args) {
		final int ALL_PAGE = 1377 ;
		int currentPage = 1;
		float percentage;
		
		Scanner inputNumCurrentPage = new Scanner(System.in);
		
		System.out.println("Введите номер текущей страницы:");
		currentPage = inputNumCurrentPage.nextInt();
		if (currentPage == 0 || currentPage > ALL_PAGE) {
			System.out.println("Неверно указаная страница!");
		}
		percentage = (currentPage * 100 / ALL_PAGE);
		System.out.println("Вы прочитали: " + percentage + "% страниц.");
	}
}
