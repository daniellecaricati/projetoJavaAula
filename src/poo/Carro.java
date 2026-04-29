package poo;

// A classe é o Molde. Instanciamento é Construir um objeto a partir de uma classe.
public class Carro {
	
	// Atributos
	// Começar colocando Atributos da classe Carro: acesso + tipo + nome;
	// Atributos precisam estar privados / Usuario pode atualizar os valores dos atributos mas não pode acessar e modificar o atributo diretamente
	private String marca;
	private int rodas;
	private int portas;
	private String modelo_motor;
	
	// Método Construtor - publico + nome classe
	//Os parametros dentro do () indica que assim que criar um objeto precisara informar o que esta sendo requisitado dentro ().
	public Carro(String marca, int rodas, int portas, String modelo_motor) { 
		this.marca = marca; // This faz referencia a propria classe  ex. Carro.rodas = Parametro rodas
		this.rodas = rodas;
		this.portas = portas;
		this.modelo_motor = modelo_motor; 
		
	}
	
	// Métodos de Acesso/Especiais (Get - Buscar/Set - Atualizar) 
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
		
	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String getModelo_motor() {
		return modelo_motor;
	}

	public void setModelo_motor(String modelo_motor) {
		this.modelo_motor = modelo_motor;
	}

	// Métodos - Ação do objeto
	// apenas public void vincula o metodo locomover a classe do Carro
	public void locomover() {
		System.out.println("Estou me locomovendo...");		
	}
	
	public String parar() { // apenas retorna o texto, não exibe. Chamar o metodo parar e colocar o sysout dentro dos parenteses 
		return "Estou parando";
	}
	

}
