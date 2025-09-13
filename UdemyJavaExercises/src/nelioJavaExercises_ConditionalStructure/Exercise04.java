package nelioJavaExercises_ConditionalStructure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Definindo variáveis:
		int horaInicial, horaFinal, duracaoJogo;
		
		// Entradas:
		System.out.println("=== DURAÇÃO DE UM JOGO ===");
		System.out.println();
		System.out.println("INFORME A HORA INICIAL: ");
		horaInicial = sc.nextInt();
		System.out.println("INFORME A HORA FINAL: ");
		horaFinal = sc.nextInt();
		
		// Estrutura condicional:
		if (horaInicial < horaFinal) {
			duracaoJogo = horaFinal - horaInicial;
		} else {
			duracaoJogo = 24 - horaInicial - horaFinal;
		}
		
		// Saída:
		System.out.println();
		System.out.println("=== SAÍDA ===");
		System.out.println();
		System.out.println("A duração do jogo foi " + duracaoJogo + " HORA(S)");
		
		sc.close();
	}

}
