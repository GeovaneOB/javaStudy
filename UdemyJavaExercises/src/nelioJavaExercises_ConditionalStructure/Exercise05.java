package nelioJavaExercises_ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		int codigoProduto, quantidadeProduto;
		double valorFinal;
		
		// Menu:
		System.out.printf("\t  === PDV ===\n\n");
		System.out.printf("--------------------------------\n");
		System.out.println("| CÓDIGO | DESCRIÇÃO |  VALOR  |");
		System.out.println("|    1   |  HOT DOG  | R$ 4,00 |");
		System.out.println("|    2   |  X-SALADA | R$ 4,50 |");
		System.out.println("|    3   |  X-BACON  | R$ 5,00 |");
		System.out.println("|    4   |  TORRADA  | R$ 2,00 |");
		System.out.println("|    5   |   REFRI   | R$ 1,50 |");
		System.out.printf("--------------------------------\n");
		
		// Entradas:
		System.out.println();
		System.out.println("CÓDIGO DO PRODUTO: ");
		codigoProduto = sc.nextInt();
		System.out.println("QUANTIDADE DO PRODUTO: ");
		quantidadeProduto = sc.nextInt();
		
		System.out.println();
		System.out.println("=== SAIDAS ===");
		
		// Estruturas condicionais:
		if (codigoProduto == 1) {
			valorFinal = quantidadeProduto * 4.00;
			System.out.println("TOTAL: " + valorFinal);
		} else if (codigoProduto == 2) {
			valorFinal = quantidadeProduto * 4.50;
			System.out.println("TOTAL: " + valorFinal);
		} else if (codigoProduto == 3) {
			valorFinal = quantidadeProduto * 5.00;
			System.out.println("TOTAL: " + valorFinal);
		} else if (codigoProduto == 4) {
			valorFinal = quantidadeProduto * 2.00;
			System.out.println("TOTAL: " + valorFinal);
		} else if (codigoProduto == 5) {
			valorFinal = quantidadeProduto * 1.50;
			System.out.println("TOTAL: " + valorFinal);
		}
		
		// Fechando scanner:
		sc.close();
		
	}
	
}
