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
		
		// Chamando metódo responsável por calcular a areaX:
		double areaX = x.calcArea();
		
		// Chamando metódo responsável por calcular a areaY:
		double areaY = y.calcArea();	
		
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
