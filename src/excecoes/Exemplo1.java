package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
	static Scanner ler = new Scanner(System.in);
		
	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		
		try { //try - para resolução de exceções - Exceções comportamentos inesperado
			
			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();

			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();

			divide(dividendo, divisor);	
			
			
		} catch(InputMismatchException e) {//Incluir no () qual tipo de exceção o sistema vai lidar + nome 
			System.err.println("\nExceção: "+ e); // err deixa cor em destaque
			System.out.println("\nDigite valores numéricos!");
			
		} catch (ArithmeticException e) {
			System.err.println("\nExceção: "+ e);
			System.out.println("\nDigite numeros inteiros e positivos!");
			
		}finally { //Finally é opcional e sempre será executado
			System.out.println("\nFinally = Sempre serei executado");
		}
				
	}
		

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));

	}

}
