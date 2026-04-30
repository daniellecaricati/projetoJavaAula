package poo;

public class TestaCarro {

	public static void main(String[] args) {
		
		// Instanciamento = Instanciar um objeto / 
		//c1 é o nome para o objeto criado para utilizar a classe Carro
		Carro c1 = new Carro("Kombi", 4, 4,"Modelo XYZ");
		Carro c2 = new Carro("Toyota", 2, 4 , "Supra");
		
		//c1.marca = "Kombi";
		//c1.portas = 4;
		
		// Set-Usado Para inserir os valores/ Atualizar
		c1.setMarca("Kombi");  
		//c1.setPortas(4);
		
		// chamada do método locomover
		c1.locomover();
		
		// Impressao dos métodos criados
		System.out.println("Marca: " + c1.getMarca()); // Get -para buscar o valor/ exibir
		System.out.println("Qtd. Portas: " + c1.getPortas());
		System.out.println("Modelo: " + c1.getModelo_motor());
		System.out.print(c1.parar());
		
		System.out.println("\n");
		
		System.out.println("Marca: " + c2.getMarca()); // Get -para buscar o valor/ exibir
		System.out.println("Qtd. Portas: " + c2.getPortas());
		System.out.println("Modelo: " + c2.getModelo_motor());
				
	}

}
