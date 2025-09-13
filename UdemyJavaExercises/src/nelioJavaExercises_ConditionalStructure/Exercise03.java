package nelioJavaExercises_ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		int A, B;
		
		// Entradas:
		System.out.println("=== MULTIPLO OU NÃO MULTIPLO ===");
		System.out.println();
		System.out.println("INFORME UM NÚMERO: ");
		A = sc.nextInt();
		System.out.println("INFORME OUTRO NÚMERO: ");
		B = sc.nextInt();
		
		System.out.println();
		System.out.println("=== SAÍDA ===");
		System.out.println();
		
		// Estrutura condicional:
		if (A % B == 0) {
			System.out.println("MULTÍPLOS");
		} else {
			System.out.println("NÃO MUTIPLOS");
		}
		
		sc.close();
		

	}

}
