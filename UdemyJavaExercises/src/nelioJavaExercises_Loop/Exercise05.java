package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		int N, X, soma1 = 0, soma2 = 0;
		
		// Entradas:
		System.out.println("Informe a quantidade de inputs desejada: ");
		N = sc.nextInt();
		System.out.println("Informe os números: ");
		
		for (int i = 0; i < N; i++) {
			
			X = sc.nextInt();
			
			if (X >= 10 && X <= 20) {
				
				soma1 += 1;
				
			} else {
				
				soma2 += 1;
				
			}
		}
		
		System.out.println(soma1 + " in");
		System.out.println(soma2 + " out");


		sc.close();			
	}

}
