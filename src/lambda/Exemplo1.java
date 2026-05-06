package lambda;

import java.util.Arrays;
import java.util.List;

public class Exemplo1 {

	public static void main(String[] args) {
		
		//Collection Lista
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// Exibir os itens da Lista com Expressão Lambda
		
		System.out.println("Exibir os itens\n");	
		numeros.forEach(n -> System.out.println(n)); // forEach é método vinculado as collections
		
		// Exibir os itens da Lista sem Expressão Lambda
		//for(Integer n : numeros) {//for (percorre) + tipo + nome : nome do array
		//	System.out.println(n);
		//}
		
		System.out.println("\nExibir os itens somados com eles mesmos\n");
		numeros.forEach(n -> System.out.println(n + n));
		
		// Exibir os itens da Lista dobrados sem Expressão Lambda
		//for(Integer n : numeros) {
		//	System.out.println(n + n); // soma do elemento atual com ele mesmo 
		//}
		
		System.out.println("\nExibir os itens pares da lista\n");
		numeros.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
		
		// Exibir apenas os elementos pares da Lista sem Expressão Lambda
		//for(Integer n : numeros) { //for + tipo + nome : nome do array
			//if(n%2 == 0) //formula pra numero par
			//System.out.println(n); 
		//}		
	}

}
