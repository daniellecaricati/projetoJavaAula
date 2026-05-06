package optional;

import java.util.Optional;

public class ExemploOptional { //Optional = Usado apenas para Exceções de NULL

	public static void main(String[] args) {
		
		String[] palavras = new String[10]; //Array de 10 casas onde o usuario vai colocar os valores
		
		//String vetore [] = {"Maca", "Laranja", "Banana"}; Array previamente definido por mim
		
		palavras[5] = "Turma"; // Inseriu o item turma na casa 5 do array palavras - Isso faz o if abaixo resultar em verdadeiro. 
		
		//Optional - Box de encapsulamento - Usado para prevenir exceção de NULO 
		//Optional<tipo>nome = Optional.metododooptional(nome do array[nº da casa]);
		Optional<String>checkNulo = Optional.ofNullable(palavras[5]);
		
		//Estrutura padrao do Optional - vai procurar 
		if(checkNulo.isPresent()) { 
			String palavra = palavras[5].toLowerCase(); //pegar o item da casa 5 e deixar em letra minuscula
			System.out.println(palavra);
		}else {
			System.out.println("A palavra é nula!");
		}

	}

}
