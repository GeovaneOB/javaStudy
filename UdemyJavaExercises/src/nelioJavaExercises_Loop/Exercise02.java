package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		// Definindo variáveis:
		double x, y;
		
		// Input de dados:
		System.out.println("=== PLANO CARTESIANO ===");
		System.out.println("INFORME OS VALORES PARA X E Y: ");
		System.out.println();
		x = sc.nextDouble();
		System.out.println();
		y = sc.nextDouble();
		System.out.println();
		
		while (x != 0.0 || y != 0.0) {
			
			if (x > 0.0 && y > 0.0) {
				System.out.println("=== SAÍDA ===");
				System.out.printf("Primeiro\n\n");
			} else if (x < 0.0 && y > 0.0) {
				System.out.println("=== SAÍDA ===");
				System.out.printf("Segundo\n\n");
			} else if (x < 0.0 && y < 0.0) {
				System.out.println("=== SAÍDA ===");
				System.out.printf("Terceiro\n\n");
			} else if (x > 0.0 && y < 0.0) {
				System.out.println("=== SAÍDA ===");
				System.out.printf("Quarto\n\n");
			} else {
				break;
			}
			
			System.out.println("INFORME OS VALORES PARA X E Y: ");
			System.out.println();
			x = sc.nextDouble();
			System.out.println();
			y = sc.nextDouble();
			System.out.println();
			
		} 
		
		sc.close();

	}

}
