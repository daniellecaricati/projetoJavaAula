package optional;

import java.util.Optional;

public class ExemploOptional2 {

	public static void main(String[] args) {
		String[] frases = new String[5];

		frases[2] = "Generation Brasil";
		
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("\n Exibir optionalVazio: " + optionalVazio);
		System.out.println("\n optionalVazio está vazio? " + optionalVazio.isEmpty());

		Optional<String> valor_indice_02 = Optional.of(frases[2]);
		System.out.println("\n Exibir valor_indice_02: " + valor_indice_02);
		System.out.println("\n Obter o conteúdo de valor_indice_02: " + valor_indice_02.get());
		System.out.println("\n valor_indice_02 está presente? " + valor_indice_02.isPresent());

	}

}
//Optional com o valor vazio
//Optional<String> optional = Optional.empty(); - Retorna instancia do optional vazia

//Valor diferente nulo
//Optional<String> optional = Optional.of(palavra[5]); Retorna optional com valor fornecido mas nao pode ser nulo

//Existe a probabilidade do valor ser nulo
//Optional<String> optional = Optional.ofNullable(palavra[5]); Se estiver presente retorna optional com valor, senao retorna optional vazio. Usado quando nao tem certeza