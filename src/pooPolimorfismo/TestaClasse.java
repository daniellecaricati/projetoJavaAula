package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {
		
		//Criação /Instancimento dos objetos 
		//Pessoa p = new Pessoa("Maria", 18); Classe Abstracta Pessoa não servir para criação de objeto/Instanciamento
		TriAtleta t = new TriAtleta("Eliane", 26, 400);
		
		TriAtleta t2 = new TriAtleta("João", 30, 12);		
		//t.setNome("Queren");
		//System.out.println(t.getNome());
		
		t.visualizar();
		t2.visualizar();
	}

}
