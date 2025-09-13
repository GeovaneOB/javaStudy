package exercise01;

public class Main {

	public static void main(String[] args) {
		
		// Instanciando objetos:
		Gato gato = new Gato ();
		Cachorro cachorro = new Cachorro ();
		Galo galo = new Galo ();
		Pato pato = new Pato ();
		
		// Exibindo resultados através dos principais metódos da interface:
		System.out.println("=== Exibindo resultados ===");
		
		System.out.printf("\nGATO: \n\n");
		System.out.println(gato.emitirSom());
		System.out.println(gato.comer());
		
		System.out.printf("\nCACHORRO: \n\n");
		System.out.println(cachorro.emitirSom());
		System.out.println(cachorro.comer());
		
		System.out.printf("\nGALO: \n\n");
		System.out.println(galo.emitirSom());
		System.out.println(galo.comer());
		
		System.out.printf("\nPATO: \n\n");
		System.out.println(pato.emitirSom());
		System.out.println(pato.comer());
	}

}
