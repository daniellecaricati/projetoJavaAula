package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {

		//Queue - Fila = First in, First out 
		//LinkedList = Each element points to next one , used for adding/removing
		//Used together to process things in order, tasks handled one by one
		
		//Queue + nome + tipo = new + LinkedList + tipo
		Queue<Integer> fila = new LinkedList<Integer>();

		System.out.println("========== SISTEMA DE CHAMADA DE SENHAS ==========\n");
		System.out.println(fila);

		// Adiciona senhas de 0 a 10 - 
		System.out.println("[1] Adicionando senhas de 0 a 10 na fila...");
		
		// o for é usado para adicionar os numeros na fila
		for (int i = 0; i <= 10; i++) { 
			fila.add(i); // .add para adicionar os elementos na fila
		}
		
		System.out.println("Fila atual: " + fila);

		System.out.println("\n[2] Chamando a primeira senha (remove): " + fila.remove()); // remove o elemento 
		System.out.println("Fila após a remoção: " + fila);

		// Adiciona o número 11
		System.out.println("\n[3] Adicionando nova senha (11): " + fila.add(11)); //adicionar item a fila 
		System.out.println("Fila atualizada: " + fila);

		// peek = Exibe primeiro elemento sem remover = mostra a proxima senha a ser chamada 
		System.out.println("\n[4] Próxima senha a ser chamada (peek): " + fila.peek()); // peek = mostra a proxima a ser chamada

		// Size = Exibe o tamanho da fila
		System.out.println("\n[5] Quantidade de senhas na fila: " + fila.size()); 

		// Contains = Verifica se a senha 4 está na fila
		System.out.println("\n[6] A senha 4 está na fila? " + fila.contains(4)); 

		// Poll -  Exibe primeiro elemento e Remove - Chamando proxima senha
		System.out.println("\n[7] Chamando e removendo a próxima senha (poll): " + fila.poll()); 
		System.out.println("Fila atual: " + fila);


		System.out.println("\n[8] Senhas restantes na fila (iterando):"); 
		// Iteração sobre os elementos restantes
		// Iterator - remote control to walk through a list - go element by element 
		//Iterator + tipo + nome do iterator = nome da fila. iterator()
		Iterator<Integer> iterator = fila.iterator(); 
		while (iterator.hasNext()) { // HasNext - Is there another element?
			System.out.println("→ Senha: " + iterator.next()); //.next = give me the next element 
		}

		// Clear =Limpa a fila
		System.out.println("\n[9] Limpando todas as senhas da fila...");
		fila.clear();

		//Is Empty - Verifica se a fila está vazia
		System.out.println("[10] A fila está vazia? " + fila.isEmpty());

		System.out.println("\n==================================================");
		System.out.println("Sistema finalizado.");

	}

}
