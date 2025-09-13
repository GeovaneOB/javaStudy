package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Definindo variáveis:
		double n, numNotas1, numNotas2, numNotas3, mPonderada = 0; // 3 casos de testes
		
		System.out.println("Informe o a quantidade de notas: ");
		n = sc.nextDouble();
		
		for (int i = 0; i < n; i++) {
			
			numNotas1 = sc.nextDouble();
			numNotas2 = sc.nextDouble();
			numNotas3 = sc.nextDouble();
			
			mPonderada = (numNotas1 * 2 + numNotas2 * 3 + numNotas3 * 5) / 10;
			
			System.out.printf("\n\nMédia Ponderada: %.1f", mPonderada);	
		}
		
		sc.close();
	}

}
