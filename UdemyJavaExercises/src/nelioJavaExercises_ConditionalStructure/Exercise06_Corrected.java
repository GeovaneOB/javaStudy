package nelioJavaExercises_ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06_Corrected {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		// Definindo variáveis:
		double valor;
		
		// Entradas:
		System.out.println("=== INTERVALOS ===");
		System.out.println();
		System.out.println("INFORME UM NÚMERO: ");
		valor = sc.nextDouble();
		
		System.out.println();
		System.out.println("=== SAÍDA ===");
		System.out.println();
		
		// Estrutura condicional:
		if (valor < 0.0 || valor > 100) {
			System.out.println("FORA DE INTERVALO!");
		} else if (valor <= 25) {
			System.out.println("INTERVALO: [0, 25]");
		} else if (valor <= 50) {
			System.out.println("INTERVALO: [25, 50]");
		} else if (valor <= 75) {
			System.out.println("INTERVALO: [50, 75]");
		} else {
			System.out.println("INTERVALO: [50, 100]");
		}
		
		sc.close();
		
	}

}
