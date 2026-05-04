package lacoCondicional;

import java.util.Scanner;

public class ExemploIF {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // Função para ler a variavel
		int idade; // declaracao de variavel
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt(); // funcao para guardar informação na variavel
		
		if (idade < 18) { // Condição 
			System.out.println("Você não pode dirigir.");
		}
		
		

	}

}
