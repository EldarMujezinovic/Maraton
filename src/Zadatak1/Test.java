package Zadatak1;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		Maratonac.loading();
		System.out.println("Najbrzi maratonac je: ");
		
			System.out.println( Maratonac.ispisUcesnika( Maratonac.sortiranjeUcesnika().get(Maratonac.sortiranjeUcesnika().size() -1)));
	}

}
