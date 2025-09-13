package nelioJavaExercises_ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		int numeroInformado;
		
		// Entradas:
		System.out.println("=== PAR OU ÍMPAR ===");
		System.out.println();
		System.out.println("INFORME UM NÚMERO: ");
		numeroInformado = sc.nextInt();
		
		System.out.println();
		System.out.println("=== SAÍDA ===");
		System.out.println();
		
		// Estrutura condicional:
		if (numeroInformado % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
		
	}
	
}
