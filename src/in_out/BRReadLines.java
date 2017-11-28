package in_out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Чтение символьных строк с консоли средствами класса
 * BuferedReader import java.io.*;
 */
public class BRReadLines {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Введите строки текста.");
		System.out.println("Введите 'стоп' для завершения.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("стоп"));
	}
}
