package nelioJavaExamples;

import java.util.Locale;
import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Entradas
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); // Definindo que higher recebe a função max + parâmetros 
		
		showResult(higher); // Exibindo resultados com a função showResult
		
		sc.close(); // Scanner close

	}

	// Função de verificação de maior número
	public static int max (int a, int b, int c) {
		
		int aux; // Variável local que existe apenas nessa função
		
		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}
		
		// Retornando variável auxiliar:
		return aux;
	}
	// Função que exibe o resultado da verificação
	public static void showResult(int aux) {
		
		System.out.println("Higher: " + aux);		
		
	}
	
}
