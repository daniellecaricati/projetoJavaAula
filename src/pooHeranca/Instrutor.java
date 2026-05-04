package pooHeranca;

public class Instrutor extends Pessoa { //Extends - herda da pessoa
	
	// 1º- Atributos	
	private String especialidade;
	
	// 2º -Metodo Construtor
	public Instrutor(String nome, int idade, String email, String especialidade) {
		super(nome, idade, email);
		this.especialidade = especialidade;
	}
	
	// 3º - Método de Acesso Get/Set
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}