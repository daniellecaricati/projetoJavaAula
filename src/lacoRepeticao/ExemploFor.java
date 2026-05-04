package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		String nome;
		int contador;
        Scanner leia = new Scanner(System.in);
        
        // o For é usado quando souber atencipadamente o numero de repetições a ser executada
        // 3 parametros : contador(inicio), condição (execute ate que), incremento (++ = adiciona +1)
        for (contador = 1; contador < 4; contador ++) { 
        	System.out.println("Digite o " + contador + "º nome: ");
        	nome = leia.nextLine();
        	System.out.println("O " + contador + " º nome é " + nome); 
        }
	}        
}
