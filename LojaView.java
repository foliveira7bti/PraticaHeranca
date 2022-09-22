import java.util.Date;

public class LojaView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Criando três objetos do tipo durável (Carro, Livro e Celular)
		 */
		
		
		ProdutoDuravel pd1 = new ProdutoDuravel("Uno Mille", 25000, "Fiat","Carro de cor branca, Ano 2015", new Date(2015,07,25), 15);
		ProdutoDuravel pd2 = new ProdutoDuravel("Harry Potter e o Calice de Fogo", 120, "Editora Terra","Livro Capa Dura, segunda edição", new Date(2000,07,8), 50);
		ProdutoDuravel pd3 = new ProdutoDuravel("Galaxy S35", 3000, "Samsung","Celular branco, 4.8Ghz, 8gb RAM", new Date(2022,02,21), 5);
		
		
		/*
		 * Criando três objetos do tipo não durável (Chocolate, Toalha e Sabonete)
		 */
		
		ProdutoNaoDuravel pNd1 = new ProdutoNaoDuravel("Chocolate Garoto", 3, "Garoto","Chocolate ao leite", new Date(2022,02,21), new Date(2022,06,30), "Alimentício");
		ProdutoNaoDuravel pNd2 = new ProdutoNaoDuravel("Toalha", 10, "Avon","Toalha Azul", new Date(2022,02,21), new Date(2022,06,30), "Limpeza");
		ProdutoNaoDuravel pNd3 = new ProdutoNaoDuravel("Camisa Regata", 20, "Adiddas","Camisa regata verde", new Date(2022,02,21), new Date(2022,06,30), "Vestuário");		
		
		

	}

}
