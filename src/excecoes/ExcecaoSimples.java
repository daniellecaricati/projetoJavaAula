package excecoes;

public class ExcecaoSimples extends Exception{
	
		//Atributo
		private static final long serialVersionUID = 1L; //final = trava o atributo , long = aceita mais caracteres, serialversionUID = obrigaçã
		
		public ExcecaoSimples() {}
		
		public ExcecaoSimples(String mensagem) {
			super (mensagem);
		}
	
}
