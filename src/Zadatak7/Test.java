package Zadatak7;

import java.io.IOException;
import java.net.MalformedURLException;

public class Test {

	public static void main(String[] args) throws MalformedURLException, IOException {
		Ime.load();
		for(int i = 0; i < Ime.sortImena().size(); i++) {
			System.out.println(Ime.sortImena().get(i));
		}
	}

}
