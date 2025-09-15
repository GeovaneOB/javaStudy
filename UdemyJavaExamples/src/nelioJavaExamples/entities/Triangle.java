package entities;

// Definindo classe:
public class Triangle {

	// Atributos da classe:
	public double a;
	public double b;
	public double c;

	public double calcArea() { 	// Metódo responsável por calcular área:
		
		double p = (a + b + c) / 2.0;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		return area;
	}
	
}



