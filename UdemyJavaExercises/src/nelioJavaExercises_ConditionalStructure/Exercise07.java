package nelioJavaExercises_ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		// Definindo variáveis:
		double x, y;
		
		// Entradas:
		System.out.println("=== PLANO CARTESIANO ===");
		System.out.println();
		System.out.println("INFORME UM NÚMERO PARA X: ");
		x = sc.nextDouble();
		System.out.println();
		System.out.println("INFORME UM NÚMERO PARA Y: ");
		y = sc.nextDouble();
		System.out.println();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}  else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}  else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}
		
		sc.close();
		
	}
}
