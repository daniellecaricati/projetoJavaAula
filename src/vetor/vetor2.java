package vetor;

import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {
		// Vetor declarado pelo usuario
		
		// tipo + nome do vetor [] = new (sempre) + tipo + tamanho
		int vetorNumeros[] = new int [3];
		Scanner leia = new Scanner (System.in);
		
		// Adicionar itens no vetor 
		// For para pedir a informação ao usuario. 
		for (int indice = 0; indice < 3; indice++) {
			System.out.println("Digite um numero: ");
			vetorNumeros[indice] = leia.nextInt(); //para guardar informações na casa do vetor  = leia.nextInt()
			//guardar informação, variavel = leia.nextInt()
		}
		
		// For para mostrar os itens do vetor. 
		for (int indice = 0; indice < 3; indice++) {
		System.out.println((indice+ 1) + "º elemento: " + vetorNumeros[indice]);
		}
		System.out.println("Tamanho do Vetor: " + vetorNumeros.length); // length mostra a quantidade de icones do vetor	
	}
}
