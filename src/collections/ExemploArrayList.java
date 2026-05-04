package collections;

import java.util.ArrayList; // biblioteca para usar o arraylist 

public class ExemploArrayList {

	public static void main(String[] args) {
				
		// Chamar ArrayList função + tipo + nome = new (sempre) + funcao + tipo ()
		ArrayList<Double> notas = new ArrayList<Double>();
		
		//Adicionando valores a lista  
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		// Exibição dos valores no arraylist 
		System.out.println("\nNotas Cadastradas: " + notas);
		
		//Indice - mostra posição de um valor na lista 
		// * Caso existam 2 notas iguais será exibida a posição da primeira nota encontrada.
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5.0));

		// Mostra se um valor existe na lista
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));

		// get - Mostra o valor que esta em uma posição
		System.out.println("\nNa posição 1 da lista, a nota é: " + notas.get(1));

		//Set = Altera a nota 5.0 para 6.0 e mostra que a alteração foi efetuada. IndexOf ()= indice tal ()
		notas.set(notas.indexOf(5d), 6.0d);
		System.out.println("\nA nota 5 foi alterada para 6: " + notas);
		
		
		//Remove = Apaga a nota 4.0 e mostra que a exclusão foi efetuada.
		//Observe que apenas a primeira nota 4.0 foi apagada.
		notas.remove(notas.indexOf(4.0d));
		System.out.println("\nA nota 4 foi apagada: " + notas);

		// isEmpty = Verifica se a lista está vazia
		System.out.println("\nA lista está vazia? " + notas.isEmpty());

		// Size = Exibe o tamanho da lista (numero de elementos)
		System.out.println("\nO tamanho da lista é: " + notas.size());

		// Clear = Limpa a lista 
		notas.clear();
		System.out.println("\nA lista está vazia: " + notas);
	}

}
