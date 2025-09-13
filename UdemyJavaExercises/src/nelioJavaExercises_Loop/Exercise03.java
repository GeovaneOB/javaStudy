package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		// Definindo variáveis:
		int tipoDeCombustivel, abastecimentosGasolina = 0,
				abastecimentosAlcool = 0, abastecimentosDiesel = 0;

		do {
			System.out.println("=== MENU POSTO ===");
			System.out.println();
			System.out.println("1. Álcool");
			System.out.println("2. Gasolina");
			System.out.println("3. Diesel");
			System.out.println("4. Sair");
			System.out.println();
			System.out.println("Escolha a opção: ");
			tipoDeCombustivel = sc.nextInt();
			
			switch (tipoDeCombustivel) {
			
			case 1:
				abastecimentosAlcool += 1;
				break;
			
			case 2:
				abastecimentosGasolina += 1;
				break;
				
			case 3:
				abastecimentosDiesel += 1;
				break;
				
			case 4:
				System.out.println("Encerrando!");
				System.out.println();
				System.out.println("RESULTADOS:");
				System.out.println();
				System.out.println("Alcool: " + abastecimentosAlcool);
				System.out.println("Gasolina: " + abastecimentosGasolina);
				System.out.println("Diesel: " + abastecimentosDiesel);
				break;

			}
		} while (tipoDeCombustivel != 4);
		
		sc.close();
		
		
	}

}
