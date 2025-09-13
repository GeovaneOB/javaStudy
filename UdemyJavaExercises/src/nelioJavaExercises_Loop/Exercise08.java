package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo variáveis:
		int n, n1 = 0, n2 = 0, n3 = 0;
		
		// Entradas:
		System.out.println("Informe um valor para N: ");
		n = sc.nextInt();
		
		// Loop + condicional:
		for (int i = 1; i < 2; i++) {
			
			n1 = n * (n - 1);
			n2 = (n - 2);
			n3 = (n - 3);

			n = n1 * n2 * n3; 
			
			if (n == 0) { 
				
				n = n + 1;
				System.out.println(n);
				
			} else {

				System.out.println(n);
				
			}
			
			
			sc.close();
			
		}

	}

}
