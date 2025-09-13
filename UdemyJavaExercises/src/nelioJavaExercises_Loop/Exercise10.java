package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {

			System.out.println(i + " " + (i * i) + " " + (i * i * i));
			
		}

		sc.close();
		
	}

}
