package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise09_Corrected {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo variáveis:
		int n;
		
		// Entradas:
		System.out.println("Informe um valor para N: ");
		n = sc.nextInt();
		
		// Loop + Condicional:
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0) { 
				
				System.out.println(i);
				
			}
			
		}
		
		sc.close();
		
	}

}
