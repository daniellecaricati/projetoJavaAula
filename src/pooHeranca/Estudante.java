package pooHeranca;
// Herança herda tudo da classe mae - Serve para não precisar repetir codigo
//Classe Estudante: Filha ou Derivada de Pessoa , Extends :Herdar Caracteriticas , Pessoa: Classe mae
public class Estudante extends Pessoa{ 
	
	// 1º - Atributos da classe Estudante 
	
    private String matricula;
    private String curso;
    
 //2º  Metodo Construtor - vincula os atributos da classe e passa os parametros no instanciamento do objeto. 
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		
		super(nome, idade, email); // super - Método Construtor da Classe Mae 
		this.matricula = matricula;
		this.curso = curso;
		//this.nome = identificacao;  public Estudante (String identificacao)
		// this = classe, nome = atributo, identificacao = parametro. Quando usuario digitar a informaçção, esta sera guardada no atributo vinculado.
	}
	
	// 3º- Metodo De Acesso
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
