package lacoCondicional;

import java.util.Scanner;

public class exemploIfElse {

	public static void main(String[] args) {
		
		//Variaveis	
		float nota1, nota2, media; // float para tipo decimal 
		Scanner leia = new Scanner(System.in);
		
		//Entrada de Dados
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		//Processamento
		media = (nota1 + nota2) / 2;
		
		// Condição Se/ Senao
		if (media >= 6) { 
				System.out.println("Parabéns, pessoa participante aprovada!");
	   }else {
			System.out.println("Infelizmente, a pessoa participante foi reprovada.");
			
	}
  }
}
