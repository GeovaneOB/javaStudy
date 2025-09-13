package nelioJavaExercises_SequentialStructure;

//Importando utilitários necessários:
import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		
		// Instanciando os utilitários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		int codigo;
		int quantidade;
		double valorUnitario;
		double valorFinal;
		
		System.out.printf("=== CÁLCULO DE PRODUTOS ===\n\n");
		
		// Laço para entrada de produtos:
		for (int i = 0; i < 2; i++) {
			System.out.printf("=== PRODUTO %d ===\n\n", i + 1);
			System.out.println("INFORME O CÓDIGO DO PRODUTO: ");
			codigo = sc.nextInt();
			System.out.println("INFORME A QUANTIDADE DO PRODUTO: ");
			quantidade = sc.nextInt();
			System.out.println("INFORME O VALOR UNITÁRIO: ");
			valorUnitario = sc.nextDouble();
			
			valorFinal = valorUnitario * quantidade;
			
			System.out.printf("\n=== EXIBINDO RESULTADOS ===\n\n");
			System.out.println("CÓDIGO: " + codigo);
			System.out.println("QUANTIDADE: " + quantidade);
			System.out.println("VALOR FINAL: " + valorFinal);
			System.out.println();
		}
		
		sc.close();
		
	}

}
