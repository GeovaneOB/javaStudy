package nelioJavaExamples;

import java.util.Locale;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		
		// Instanciando utilittários:
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String s01 = original.toLowerCase(); // Transforma todas as letras em minusculo
		String s02 = original.toUpperCase(); // Transforma todas as letras em maiusculo
		String s03 = original.trim(); // Remove espaços da string
		String s04 = original.substring(2); // Inicia a string na segunda casa do vetor (0, 1 - 2, 3 ...)
		String s05 = original.substring(2, 9); // Inicia a string na segunda casa do vetor e termina na nona
		String s06 = original.replace('a', 'x'); // Substitui todas as letras 'a' por 'x'
		String s07 = original.replace("abc", "xy"); // Substitui todas as substrings 'abc' por 'xy'
		int i = original.indexOf("bc"); // Vetor corre a string e identifica a primeira ocorrência do 'bc'
		int j = original.lastIndexOf("bc"); // Vetor corre a string e identifica a última ocorrência do 'bc'
		
		System.out.println("Original:" + "- " + original + " - ");
		System.out.println();
		System.out.println("toLowerCase:" + " - " + s01 + " - ");
		System.out.println();
		System.out.println("toUpperCase:" + " - " + s02 + " - ");
		System.out.println();
		System.out.println("trim:" + " - " + s03 + " - ");
		System.out.println();
		System.out.println("substring (2):" + " - " + s04 + " - ");
		System.out.println();
		System.out.println("substring (2, 9):" + " - " + s05 + " - ");
		System.out.println();
		System.out.println("replace (a, x):" + " - " + s06 + " - ");
		System.out.println();
		System.out.println("replace (abc, xy):" + " - " + s07 + " - ");
		System.out.println();
		System.out.println("indexof (bc):" + " - " + i + " - ");
		System.out.println();
		System.out.println("lastIndexof (bc):" + " - " + j + " - ");
		
		sc.close();
	}

}
