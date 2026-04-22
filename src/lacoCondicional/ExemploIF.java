package lacoCondicional;

import java.util.Scanner;

public class ExemploIF {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade < 18) {
			System.out.println("Você não pode dirigir.");
		}
		
		

	}

}
