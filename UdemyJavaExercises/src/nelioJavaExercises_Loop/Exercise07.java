package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo variáveis:
		double n, x, y;
		
		// Entradas:
		System.out.println("Informe a quantidade de inputs: ");
		n = sc.nextInt();
		
		System.out.println();
		
		// Loop para exibir, calcular e analisar probabilidades com condicionais:
		for (int i = 0; i < n; i++) {
			
			System.out.println("Infome valor para x: ");
			x = sc.nextInt();
			
			System.out.println("Infome valor para y: ");
			y = sc.nextInt();
			
			if (y != 0) {
				
				double divisao = x / y;
				System.out.println();
				System.out.println("=== RESULTADOS ===");
				System.out.println(divisao);
				System.out.println();
				
			} else {
				
				System.out.println("=== RESULTADOS ===");
				System.out.println("Divisão impossível!");
				System.out.println();
				
			}
		}
		

		sc.close();
		
	}

}
