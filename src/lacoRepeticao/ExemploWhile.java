package lacoRepeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        int numero1, numero2, resultado;
        String continua = ""; 
        // o valor de continua é igual a N? 
        // Sim, é n 
        // ! true = > false 
        

        while (!continua.equalsIgnoreCase("n"))  //Uppercase = maiusculas Lowercase = minuscula // ! not , negação, inverte 
        {  // o que esta dentro do continua é igual a n? o equals faz ignorar maiscula ou minuscula 
            System.out.println("Digite primeiro valor: ");
            numero1 = leia.nextInt();

            System.out.println("Digite segundo valor: ");
            numero2 = leia.nextInt();

            resultado = numero1 + numero2;

            System.out.println("O resultado da soma é: " + resultado);
            
            System.out.println("Deseja continuar? (S/N)");
            continua = leia.next();
            
            }
	}
}
