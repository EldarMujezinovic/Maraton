package Zadatak3;
import java.util.*;
import java.io.*;
public class Maratonac {
	
	private String imeUcesnika; 
	private int vrijemeUcesnika;
	private static ArrayList<Maratonac> ucesnici = new ArrayList<Maratonac>();
	
	public Maratonac() {
		
	}
	public Maratonac(String imeUcesnika, int vrijemeUcesnika) {
		this.imeUcesnika = imeUcesnika;
		this.vrijemeUcesnika = vrijemeUcesnika;
		ucesnici.add(this);
	}

	public static void loading() throws FileNotFoundException {

		File file = new File ("maratonci.txt");
		Scanner read = new Scanner(file);

		while (read.hasNextLine()) 
			new Maratonac(read.next(), read.nextInt());
		

		read.close();

	}
	public static Maratonac najbrziUcesnik() {

		int maksVrijeme = ucesnici.get(0).vrijemeUcesnika;

		for (int i = 1; i < ucesnici.size(); i++) 
			if (ucesnici.get(i).vrijemeUcesnika > maksVrijeme)
				maksVrijeme = ucesnici.get(i).vrijemeUcesnika;

		for (int i = 0; i < ucesnici.size(); i++) 
			if (ucesnici.get(i).vrijemeUcesnika == maksVrijeme)
				return ucesnici.get(i);

		return null;


	}
	public static ArrayList<Maratonac> sortiranjeUcesnika() {

		ArrayList<Maratonac> sortiraniUcesnici = new ArrayList<Maratonac>();

		int[] vremena = new int[ucesnici.size()];

		for (int i = 0; i < ucesnici.size(); i++) 
			vremena[i] = ucesnici.get(i).vrijemeUcesnika;

		Arrays.sort(vremena);

		for (int i = 0; i < ucesnici.size(); i++) 
			for (int j = 0; j < ucesnici.size(); j++) 
				if (ucesnici.get(j).vrijemeUcesnika == vremena[i])
					sortiraniUcesnici.add(ucesnici.get(j));

		return sortiraniUcesnici;


	}
	public static Maratonac ucesnikPoImenu (String ime) {
		
		for (int i = 0; i < ucesnici.size(); i++) {
			if (ucesnici.get(i).imeUcesnika.equals(ime)) {
				return ucesnici.get(i);
		}else{
			System.out.println("Ucesnik nije pronaden!");
			break;
		}
		}
		return null;
		
	}

	public static String ispisUcesnika (Maratonac ucesnik) {
		return ucesnik.imeUcesnika + " " + ucesnik.vrijemeUcesnika;
	}


	
	

	
}