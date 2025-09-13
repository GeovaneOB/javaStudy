package exercise01;

//Implementando a interface Animal à classe Pato:
public class Pato implements Animal{
	
	// Criando metódos:
	@Override
	public String emitirSom() {
		
		return "Quá quá";
		
	}

	@Override
	public String comer() {
		
		return "Vegetais.";
		
	}
	
	

}
