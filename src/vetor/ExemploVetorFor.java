package vetor;

public class ExemploVetorFor {

	public static void main(String[] args) {
		
		// Vetor declarado pelo desenvolvedor
		
		String vetorCachorros [] = {"Boxer", "Pastor A", "Pinscher", "Husky", "Corgi"};
		
		// contador, teste, adiciona 1 em 1 
		for(int numero = 0; numero < 5; numero++) {
			
		// (numero+1) serve para mostrar a mensagem iniciando em 1. 
		 System.out.println((numero + 1) + "º elemento: " + vetorCachorros[numero]);	     
		}
	}
}
