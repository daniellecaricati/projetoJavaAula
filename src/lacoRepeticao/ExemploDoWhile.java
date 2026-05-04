package lacoRepeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		int numero, resultado, contador = 1;
        Scanner leia = new Scanner(System.in);

        // DO faz a condição ser executada ao menos uma vez
        do {
	        System.out.println("\nDigite um número inteiro: ");
	        numero = leia.nextInt();
	        resultado = numero * 5;
	        System.out.println("\nO resultado da multiplicação é: " + resultado);
        } 
        while (contador <= 0);
	}

}
