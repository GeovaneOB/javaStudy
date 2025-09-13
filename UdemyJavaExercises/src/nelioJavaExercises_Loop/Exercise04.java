package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		int x;
		
		// Entradas:
		System.out.println("INFORME UM NÚMERO PARA X: ");
		x = sc.nextInt();
		
		for (int i = 1; i < x; i++) {
			
			if (i % 2 != 0) {
				System.out.println(i );
			}
		}
		
		sc.close();

	}

}
