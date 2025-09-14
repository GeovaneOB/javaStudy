package entities;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Instanciando objetos x e y:
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		// Scanner para cada lado dos triangulos x e y:
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// Processamentos: Calculando valor de p e area do triângulo X:
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p + x.a) * (p - x.b) * (p * x.c));
		
		// Processamentos: Calculando valor de p e area do triângulo Y:
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p + y.a) * (p - y.b) * (p * y.c));
		
		// Saídas
		System.out.printf("Triangle X area: %.4f", areaX);
		System.out.printf("Triangle Y area: %.4f", areaY);
		
		if (areaX > areaY) {
			System.out.printf("Larger triangle: X");
		} else {
			System.out.printf("Larger triangle: Y");
		}
		
		sc.close();

	}

}
