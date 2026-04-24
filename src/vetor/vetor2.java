package vetor;

import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {
		// Vetor declarado pelo usuario
		// new int indica o numero de casa que o vetor terá. O usuario ira colocar as informações. 
		
		// tipo // nome vetor  //new obrigatorio // tipo // numero casas
		int vetorNumeros[] = new int [3];
		Scanner leia = new Scanner (System.in);
		
		// Adicionar itens no vetor 
		// For para pedir a informação ao usuario. 
		for (int indice = 0; indice < 3; indice++) {
			System.out.println("Digite um numero: ");
			vetorNumeros[indice] = leia.nextInt(); //numero = leia.nextInt()
			//guardar informação, variavel = leia.nextInt()
		}
		
		// For para mostrar os itens do vetor. 
		for (int indice = 0; indice < 3; indice++) {
		System.out.println((indice+ 1) + "º elemento: " + vetorNumeros[indice]);
		}
		System.out.println("Tamanho do Vertor: " + vetorNumeros.length); // length mostra a quantidade de icones do vetor	
	}
}
