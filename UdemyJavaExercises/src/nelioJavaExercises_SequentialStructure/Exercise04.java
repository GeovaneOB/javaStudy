package nelioJavaExercises_SequentialStructure;

// Importando utilitários necessários:
import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Instanciando os utilitários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		int credencial;
		int horasTrabalhadas;
		double valorHora;
		double salarioFinal;
		
		//Entradas:
		System.out.printf("=== CÁLCULO SALARIAL ===\n\n");
		System.out.println("Informe a credencial do funcionário: ");
		credencial = sc.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Informe o valor por hora trabalhada: ");
		valorHora = sc.nextDouble();
		
		// Processamento:
		salarioFinal = valorHora * horasTrabalhadas;
		
		// Saída:
		System.out.printf("\n=== EXIBINDO RESULTADOS ===\n\n");
		System.out.println("CREDENCIAL: " + credencial);
		System.out.printf("SALÁRIO: %.2f", salarioFinal);
		
		sc.close();
	}

}
