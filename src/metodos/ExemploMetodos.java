package metodos;

import metodoExterno.ExemploMetodoExterno;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar (2,5); // utilização do método somar. / colocar tipo , nome da variavel = nome metodo (valores)	
		
		System.out.println("Resultado chamando a variavel: " + resultado);
		System.out.println("Resultado chamando somente o metodo " + somar (3,3));
		
		mensagem(); // chamando metodo void 
		saudacao("Bom dia, turma");
		
		ExemploMetodoExterno.info(); // ao chamar um metodo criado em outra classe/pacote, chamar o nome da classe e importar
		
		
	}
	// 
	//Métodos são ações!
	// public pode ser acessado geral, consegue chamar em outros arquivos. Private-acessa somente a mesma classe. Protected - acessa dentro do pacote.
	//static - deixa o metodo independente.  
	// int é o tipo de retorno, pode ser string, float etc. 
	// somar é o nome do metodo - colocar sempre como ação 
	
	public static int somar (int num1, int num2) { // Assinatura do Método com Retorno e Argumentos
		// usado para guardar informação. 
		// todo método com tipo exceto (void), tem que ter o return como palavra reservada
		return num1 + num2; // procedimento /lógica do método
	}
	
	public static void mensagem() { // void para ausencia de valores / não precisa usar return pq não tem o que retornar/ só executa. 
		// não precisa guardar informação
		System.out.println("Esse método não tem retorno(void)");
	}
	
	public static void saudacao (String msg) { // metodo sem retorno mas que pede um parametro 
		System.out.println(msg);
	}
}
