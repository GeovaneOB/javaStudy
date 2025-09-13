package nelioJavaExercises_ConditionalStructure;

// Importando classes utilitárias:
import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
			
		// Definindo variáveis:
		int numeroInformado;
		
		// Entradas:
		System.out.println("=== NEGATIVO OU NÃO NEGATIVO ===");
		System.out.println();
		System.out.println("INFORME UM NÚMERO: ");
		numeroInformado = sc.nextInt();
		
		System.out.println();
		System.out.println("=== SAÍDA ===");
		System.out.println();
		
		// Estrutura condicional:
		if (numeroInformado < 0  || numeroInformado == -0) {
			System.out.println("NEGATIVO");
		} else if (numeroInformado == 0) {
			System.out.println("NULO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
		
	}

}
