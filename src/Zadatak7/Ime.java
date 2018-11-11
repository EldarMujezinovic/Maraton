package Zadatak7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ime {

	private String ime;
	private static ArrayList<Ime> imena = new ArrayList<Ime>();

	public Ime (String ime) {
		this.ime = ime;
		imena.add(this);
	}

	public static void load() throws FileNotFoundException {

		File file = new File ("imeni.txt");
		Scanner read = new Scanner(file);

		while (read.hasNextLine()) 
			new Ime(read.next());

		read.close();
	}
	
	public static ArrayList<String> sortImena() {
		
		ArrayList<String> sortiranaImena = new ArrayList<String>();
		
		for (int i = 0; i < imena.size(); i++)
			sortiranaImena.add(imena.get(i).ime);
		
		Collections.sort(sortiranaImena);
				
		return sortiranaImena;
		
		
		
	}

	public static String ispisImena(Ime ime) {
		return ime.ime;
	}
	
}