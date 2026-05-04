package lacoRepeticao;

import java.util.Scanner;

public class ExemploWhile2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
        int numero1, numero2, resultado, continua = 1 ;
        
       // Keep looping while continua is different of zero  
        while (continua != 0) { 
        	    
        System.out.println("Digite primeiro valor: ");
        numero1 = leia.nextInt();

        System.out.println("Digite segundo valor: ");
        numero2 = leia.nextInt();

        resultado = numero1 + numero2;

        System.out.println("O resultado da soma é: " + resultado);
        
        System.out.println("Deseja continuar? Digite um numero diferente de 0");
        continua = leia.nextInt();
        }
	}

}
