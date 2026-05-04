package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		
				//Declaração das Variaveis	
				float nota1, nota2, media;
				Scanner leia = new Scanner(System.in);
				
				//Entrada de Dados - Pedindo informação ao usuario 
				System.out.println("Digite a primeira nota: ");
				nota1 = leia.nextFloat();
				
				System.out.println("Digite a segunda nota: ");
				nota2 = leia.nextFloat();
				
				//Processamento
				media = (nota1 + nota2) / 2;
				
				// Condição Se , Senao Se (Quando tem uma outra condição a ser executada), Senao (Quando todas as outras não foram executadas)
				if (media >= 6) {
						System.out.println("Parabéns, pessoa participante aprovada!");
			   } else if (media >= 5) {
				   System.out.println("Pessoa participante esta de exame.");
			   }			
				else {
					System.out.println("Infelizmente, a pessoa participante foi reprovada.");
					}
	}
}

	
