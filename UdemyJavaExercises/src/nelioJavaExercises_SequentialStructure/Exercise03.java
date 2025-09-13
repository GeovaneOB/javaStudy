package nelioJavaExercises_SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.printf("=== CALCULANDO DIFERENÇA ===\n\n");
			
		System.out.printf("Informe o valor de A: ");
		A = sc.nextInt();
		System.out.println();
		System.out.printf("Informe o valor de B: ");
		B = sc.nextInt();
		System.out.println();
		System.out.printf("Informe o valor de C: ");
		C = sc.nextInt();
		System.out.println();
		System.out.printf("Informe o valor de D: ");
		D = sc.nextInt();
		System.out.println();
		
		diferenca = (A * B - C * D);
		
		System.out.printf("DIFERENÇA: %d", diferenca);
		
		sc.close();
		
	}

}
