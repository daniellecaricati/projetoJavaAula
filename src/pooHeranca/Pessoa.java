package pooHeranca; // Herança serve para agrupar Metodos e/ou 

public class Pessoa { // Super Classe ou Classe Mãe 
	
	// 1º - Atributos
	private String nome;
    private int idade;
    private String email;
    
    // 2º -Metodo Construtor
    public Pessoa(String nome, int idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}
    
    // 3º- Método de Acesso 
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
