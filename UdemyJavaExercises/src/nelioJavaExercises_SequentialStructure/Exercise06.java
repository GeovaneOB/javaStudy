package nelioJavaExercises_SequentialStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		// Instanciando os utilitários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		double A, B, C;
		double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		// Entradas:
		System.out.println("=== CÁLCULO DE ÁREA ===");
		System.out.println();
		System.out.println("INFORME O VALOR DE A: ");
		A = sc.nextDouble();
		System.out.println("INFORME O VALOR DE B: ");
		B = sc.nextDouble();
		System.out.println("INFORME O VALOR DE C: ");
		C = sc.nextDouble();
		System.out.println();
		
		// Processmentos:
		areaTriangulo = (A * C) / 2;
		areaCirculo = 3.14159 * (C * C);
		areaTrapezio = (A + B) * C / 2;
		areaQuadrado = B * B;
		areaRetangulo = A * B;
		
		// Saída:
		System.out.println("=== EXIBINDO RESULTADOS ===");
		System.out.println();
		System.out.printf("Área do triângulo: %.3f\n", areaTriangulo);
		System.out.printf("Área do circulo: %.3f\n", areaCirculo);
		System.out.printf("Área do trapezio: %.3f\n", areaTrapezio);
		System.out.printf("Área do quadrado: %.3f\n", areaQuadrado);
		System.out.printf("Área do retangulo: %.3f\n", areaRetangulo);

		// Fechando scanner:
 		sc.close();

	}

}
