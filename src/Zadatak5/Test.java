package Zadatak5;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args)throws FileNotFoundException {
		
		Maratonac.loading();
		System.out.println("Maratonci sa vremenom ispod 300: ");
		Maratonac.manjiOd300();
	}

}
