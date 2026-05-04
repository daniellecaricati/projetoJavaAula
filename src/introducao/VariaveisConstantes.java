package introducao;

public class VariaveisConstantes {

	public static void main(String[] args) {
		
		// Variaveis= os valores podem mudar / Usada em = usuarios, contadores etc
		int idade = 25;
		String nome = "Danielle";
		float graus = 20.0f;
		boolean resposta; 
		
		//Constantes = final transforma a variavel em imutavel/ usada em PI value, limite maximo, configurações 
		final int QUANTIDADE = 50;
		final String TURMA = "Turma 84";
		final double AREA = 3.1415;
		
		System.out.print(nome); // não pula linha
		System.out.println(QUANTIDADE); 
		System.out.println(AREA);
		System.out.println(TURMA);

	}

}
