package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		String nome;
		int contador;
        Scanner leia = new Scanner(System.in);
            
        for (contador = 1; contador < 4; contador ++) {
        	System.out.println("Digite o nome:  " + contador + "º nome: ");
        	nome = leia.nextLine();
        	System.out.println("O " + contador + " º nome é " + nome); 
        }
	}        
}
