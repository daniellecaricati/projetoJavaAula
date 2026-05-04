package pooPolimorfismo;


public class TriAtleta extends Pessoa implements Iciclista, INadador, ICorredor{ //extends = herdando caracteristica da classe pessoa
		//Classe TriAtleta esta herdando caracteristicas da classe Pessoa e Adicionando a caracteristica Competições 
		//Implements - Implementar metodos da interface Iciclista

		int competicoes;
		
		//Metodo Construtor
		public TriAtleta(String nome, int idade, int competicoes) {
			super(nome, idade); //super invoca metodo construtor da classe pessoa
			this.competicoes = competicoes;
		}
		
		public TriAtleta(String nome, int idade) {
			super (nome, idade);
		}
		
		// Acesso 
		public int getCompeticoes() {
			return competicoes;
		}
		public void setCompeticoes(int competicoes) {
			this.competicoes = competicoes;
		}
		
		//Poliformismo de Sobrecarga(Sobrecarda de Metodo)
		public void competicoesConcluidas (int numero) {
			System.out.println("Competições Concluidas " + numero);
		}
			
		//Polimorfisco de Sobrescrita (Sobrescrita de Metodo)
		public void visualizar() {
			super.visualizar();
			System.out.println("Competições: " + this.competicoes);
		}
		
		//Metodo Implementados das Interfaces
		public void pedalar() {
			System.out.println("Estou pedalando...");
		}
		
		public String aquecer() {
			return "Estou me aquecendo..";	
		}
		
		@Override
		public void correr() {
			System.out.println("Correndo..");
		}
		
		@Override
		public void nadar(int distancia){
			System.out.println("Vou nadar.." + distancia + "km");
		}
	}