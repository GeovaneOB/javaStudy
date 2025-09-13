package nelioJavaExercises_SequentialStructure;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int valor1;
		int valor2;
		int soma;
		
		System.out.printf("=== EXERCISE 01 ===\n\n");
		System.out.println("Informe o 1° número: ");
		valor1 = sc.nextInt();
		System.out.println();
		System.out.println("Informe o 2° número: ");
		valor2 = sc.nextInt();
		System.out.println();
		
		soma = valor1 + valor2;
		
		System.out.printf("RESULTADO: %d", soma);
		
		sc.close();
	}

}
