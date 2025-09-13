package nelioJavaExercises_SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double raio, area, pi = 3.14159;
		
		System.out.println("=== CALCULANDO ÁREA DE UM CIRCULO ===");
		System.out.println();
		System.out.println("Informe o valor da área desejado: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.println();
		System.out.printf("RESULTADO: %.4f", area);

		sc.close();
	}

}
