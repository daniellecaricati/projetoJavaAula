package excecoes;

public class Exemplo3 {

	public static void main(String[] args)throws ExcecaoSimples { //tem que escrever o throws Excecao Simples porque foi uma excecao que eu construi
		String nomes[] = { "João", "Maria", "Pedro", "Manuela" };

		try {
			for (int i = 0; i < nomes.length; i++) {
				System.out.println(nomes[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("\nExceção: " + e);
			System.out.println("\nPosição Inválida");
		}
		
		throw new ExcecaoSimples("Exceção Simples!");

	}

}
