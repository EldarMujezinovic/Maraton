package Zadatak3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Maratonac.loading();
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Unesite ime maratonca: ");

		System.out.println(Maratonac.ispisUcesnika(Maratonac.ucesnikPoImenu(input.next())));
		
		input.close();
		
	}

}
