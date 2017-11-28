package file_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Копирование файлов.
 * Чтобы воспользоватся этой пронраммой,
 * укажите имена исходного и целевого файлов.
 * Например, чтобы скопировать файл first.txt в файл second.txt
 * введите в командной строке:
 * java CopyFile first.txt second.txt
 */
public class CopyFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		if (args.length != 2) {
			System.out.println("Использование: CopyFile откуда куда?");
		}
		
		try {
			fin = new FileInputStream(args[0]);
			fout = new FileOutputStream(args[1]);
			
			do {
				i = fin.read();
				if (i != -1) fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Ошибка ввода-вывода" + e);
		}finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException e2) {
				System.out.println("Ошибка закрытия файла ввода");
			}
			try {
				if (fout != null) fin.close();
			} catch (IOException e2) {
				System.out.println("Ошибка закрытия файла вывода");
			}
		}
	}
}
