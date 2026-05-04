package pooPolimorfismo;
//Classe Abstrata é o molde do molde - Generica - Representa todos dentro de um grupo - Serve pra ser base de construção de outras classes -Filhas
//Classe Abstrata só serve para ser herdada para suas filhas. Não pode criar objeto a partir dela. Abstract impede o instanciamento 
public abstract class Pessoa { 
		//Atributos
		private String nome;
	    private int idade;
	    //Construtor
		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
	    //Acesso
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		public void visualizar() {
			System.out.println("Dados da Pessoa Usuária:");
			System.out.println("****************************************************************");
			System.out.println("Nome: " + this.nome);
			System.out.println("Idade: " + this.idade);
		}
		public String aquecer() {
			// TODO Auto-generated method stub
			return null;
		}
	}

