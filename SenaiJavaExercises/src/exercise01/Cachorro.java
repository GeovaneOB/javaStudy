package exercise01;

//Implementando a interface Animal à classe Cachorro:
public class Cachorro implements Animal{

	// Criando metódos:
	@Override
	public String emitirSom() {
		
		return "Au Au";
		
	}

	@Override
	public String comer() {
		
		return "Ração para cachorro.";
		
	}
	
	
	
}
