package excecoes;

import java.util.Scanner;

public class Exemplo2 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade;
		
		try { // try catch controla o fluxo
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();

		validarIdade(idade);
		System.out.println("Rodou até aqui..");
		
		}catch(ArithmeticException e) {
			System.err.println("Exceção: "+ e.getMessage()); // get.Nessage faz trazer só a mensagem.
		}
	}
	
	public static void validarIdade(int idade) {

		if (idade < 18)
			//throw new + tipo de exceção (mensagem) //Throw faz sistema parar e mostrar a exceção. 
			throw new ArithmeticException("A Pessoa não pode dirigir!!"); //throw new lança todas as exceção,e eu coloco onde quiser para ser lançada
		else
			System.out.println("A Pessoa pode dirigir!!");

	}
	
}
