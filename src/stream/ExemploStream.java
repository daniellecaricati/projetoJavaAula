package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream { //Stream faz uma cópia  da Collection original e manipula a copia

	public static void main(String[] args) {
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		//Stream
		List<String> estadosEmMaiusculo = estados.stream()
			.map(x -> x.toUpperCase()) // Operação Intermediaria (Processamento)
			.collect(Collectors.toList()); //Operação Terminal (Finalização)
		System.out.println("Estados em Maiúsculos: " + estadosEmMaiusculo);
		System.out.println("Coleção/Dados Inicial: " + estados);
		
		
		List <String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream()
				.count();// contar a quantidade
		
		System.out.println("Estados em Maiúsculos: " + estadosEmMaiusculo);
		System.out.println("Coleção/Dados Inicial: " + estadosUnicos);
		System.out.println("Coleção/Dados Inicial: " + estados);
		System.out.println("Quantidade de Estados: " + quantidadeDeEstados);
	}

}
