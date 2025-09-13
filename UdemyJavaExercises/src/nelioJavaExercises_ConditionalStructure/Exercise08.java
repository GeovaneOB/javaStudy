package nelioJavaExercises_ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		// Definindo variáveis:
		double salario, imposto;
		
		// Entradas:
		System.out.println("=== IMPOSTOS ===");
		System.out.println();
		System.out.println("INFORME A SUA RENDA: ");
		salario = sc.nextDouble();
		System.out.println();
		System.out.println("INFORME O IMPOSTO: ");
		imposto = sc.nextDouble();
		System.out.println();
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		} 
		
		if (imposto == 0.0) {
			System.out.println("Isento!");
		} else {
			System.out.printf("R$ %.2f", imposto);
		}
		
		sc.close();

	}

}
