package Zadatak6;
import java.util.*;
import java.io.*;

public class BrojLinija  {
		public static void brojLinija() throws FileNotFoundException {
		File file = new File("astronau.txt");
		Scanner read = new Scanner(file);
		int brojLinija = 0;
		while(read.hasNext()) {
			brojLinija++;
			read.nextLine();
		}
		
		System.out.println("Broj linija u fajlu je: " + brojLinija);
		}
}
