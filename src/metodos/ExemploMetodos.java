package metodos;

import metodoExterno.ExemploMetodoExterno;
//Quando a classe/metodo esta em outro pacote, tem que fazer a importação

public class ExemploMetodos {

	public static void main(String[] args) {
		
		//Method - Reusable block of code that performs  a specific task , created out of the public static void main 
		//tipo + nome variavel = nome metodo + valore ()
		int resultado = somar (2,5); // utilização do método somar	
		
		System.out.println("Resultado chamando a variavel: " + resultado);
		System.out.println("Resultado chamando somente o metodo " + somar (3,3));
		
		mensagem(); // chamando metodo void 
		saudacao("Bom dia, turma"); // chamando metodo saudacao e includindo a msg 
		
		// ao chamar um metodo criado em outra classe/pacote, chamar o nome da classe e importar
		ExemploMetodoExterno.info();
				
	} 
	
	//Métodos são ações!
	// public pode ser acessado geral, consegue chamar em outros arquivos. Private-acessa somente a mesma classe. Protected - acessa dentro do pacote.
	//static - método independente. Pode ser Chamado a qualquer momento. Não pertence a um item especifico.  
	// int é o tipo de retorno, pode ser string, float etc. 
	// somar é o nome do metodo - colocar sempre como ação 
	
	//Criação do Metodo =  Assinatura do Método com Retorno e Argumentos. Usado para guardar informação. 
	public static int somar (int num1, int num2) { 
		// todo método do tipo exceto (void), tem que ter o return como palavra reservada
		return num1 + num2; // procedimento /lógica do método
	}
	
	//Criação do Método sem retorno e sem parametro.
	public static void mensagem() {  
		System.out.println("Esse método não tem retorno(void)");
	}
	
	//Criação do metodo sem retorno mas com parametro 
	public static void saudacao (String msg) {
		System.out.println(msg);
	}
}
