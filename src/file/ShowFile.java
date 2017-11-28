package file;

import java.io.*;

/*
	Отображение содержимого текстового файла.
	Чтобы воспользоватся этой программой, укажит
	имя файла, который требуется посмотреть.
	Например, чтобы посмотреть файл test.txt,
	введите в командной строке следующую команду:
	
	java ShowFile test.txt
	
	В этом варианте программы код, открывающий и получающий
	доступ к файлу, заключён в один блок оператора try.
	файл закрывается в блоке оператора finally
 */
public class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		
		//проверим что имя файла указано
		if (args.length != 1) {
			System.out.println("Использование: ShowFile имя_файла");
			return;
		}
		try {
			fin = new FileInputStream(args[0]);
			do {
				i = fin.read();
				if (i != -1) System.out.print((char) i);
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Ошибка ввода-вывода: " + e);
		}finally {
			//закрыть файл в любом случае
			try {
				if(fin !=null)fin.close();
			} catch (IOException e) {
				System.out.println("Ошибка закрытия файла");
			}
		}
		
	}
}
