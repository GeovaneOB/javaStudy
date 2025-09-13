package nelioJavaExamples;

// Importando a classe locale.
import java.util.Locale;

public class Example03 {

	public static void main(String[] args) {
		
		// Configurando a classe locale para padrão US.
		Locale.setDefault(Locale.US);	
		
		// Definindo variável do tipo double.
		double x = 10.35784;
		String nome = "Maria";
		double renda = 15000;
		int idade = 32;
		
		// Exibindo-a sem formatação.
		System.out.println(x);
		
		// Exibindo-a com formatação de duas casas decimais.
		System.out.printf("%.2f%n", x);
		
		// Exibindo-a com formatação de quatro casas decimais.
		System.out.printf("%.4f%n", x);
		
		// Exibindo-a com concatenação.
		System.out.println("RESULTADO = " + x + " METROS");

		// Exibindo-a com concatenação formatada do printf.
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		// Exibindo-a com concatenação formatada do printf.
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
