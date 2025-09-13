package exercise01;

//Implementando a interface Animal à classe Gato:
public class Gato implements Animal{
	
	// Criando metódos:
	@Override
	public String emitirSom() {
		
		return "Miau";
		
	}

	@Override
	public String comer() {
		
		return "Ração para gato";
		
	}
	
	
	
}
