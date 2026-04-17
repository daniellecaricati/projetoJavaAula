package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		// Variaveis
		float celsius, farenheit;
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Insira a temperatura em Celsius: ");
		celsius = leia.nextFloat(); // 28
		
		// Processamento
		farenheit = celsius * 1.8f + 32;
		
		System.out.println("A temperatura em Farenheit é:" + farenheit);
		
		
	}

}