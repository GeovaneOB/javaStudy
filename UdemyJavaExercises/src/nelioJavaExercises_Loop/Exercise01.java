package nelioJavaExercises_Loop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		// Definindo variáveis:
		int senhaInformada, senhaDefault = 2002;
		
		// Entradas:
		System.out.println("=== VALIDAÇÃO DE SENHA ===");
		System.out.println();
		System.out.println("INFORME A SENHA: ");
		senhaInformada = sc.nextInt();
		
		while (senhaInformada != senhaDefault) {
			
			System.out.println("Senha inválida! Tente novamente!");
			System.out.println();
			System.out.println("INFORME A SENHA: ");
			senhaInformada = sc.nextInt();
			
			if (senhaInformada == senhaDefault) {
				
				System.out.println("Acesso Permitido!");
				
			}
			
		} 
		
		sc.close();

	}

}
