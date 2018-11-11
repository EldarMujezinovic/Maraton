package Zadatak2;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {

		Maratonac.loading();
		System.out.println("Sortirani spisak maratonaca je: ");
		for(int i = 0; i < Maratonac.sortiranjeUcesnika().size(); i++)
			System.out.println(Maratonac.ispisUcesnika(Maratonac.sortiranjeUcesnika().get(i)));
		
		
	}
}
