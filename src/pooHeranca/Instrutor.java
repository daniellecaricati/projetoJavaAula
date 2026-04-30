package pooHeranca;

public class Instrutor extends Pessoa {
	
	// Atributos	
	private String especialidade;

	public Instrutor(String nome, int idade, String email, String especialidade) {
		super(nome, idade, email);
		this.especialidade = especialidade;
	}
	
		public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}