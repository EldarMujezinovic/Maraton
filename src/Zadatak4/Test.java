package Zadatak4;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException{
		
		Maratonac.loading();
		System.out.println("Prosjecno vrijeme ucesnika: ");
		
		System.out.println(Maratonac.prosjecnoVrijeme());
	}

}
