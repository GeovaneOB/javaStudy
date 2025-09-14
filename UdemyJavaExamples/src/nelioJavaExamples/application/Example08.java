package application;

import java.util.Locale;
import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xa, xb, xc;
		double ya, yb, yc;
		
		System.out.println("Enter the measures of triangule X: ");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Enter the measures of triangule Y: ");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa + xb + xc) / 2.0;
		double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		
		p = (ya + yb + yc) / 2.0;
		double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		
		System.out.println();
		
		System.out.printf("Triangule X area: %.4f%n", areaX);
		System.out.printf("Triangule Y area: %.4f%n", areaY );
		
		System.out.println();
		
		if (areaX > areaY) {
			
			System.out.printf("Larger area: X");
			
		} else {
			
			System.out.printf("Larger area: Y");
			
		}
		
		sc.close();
	}

}
