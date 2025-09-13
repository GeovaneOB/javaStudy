package nelioJavaExamples;

import java.util.Locale;
import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String s = "potato apple lemon";
		String [] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
 
		sc.close();
		
	}

}
