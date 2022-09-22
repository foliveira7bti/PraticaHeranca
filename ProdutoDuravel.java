import java.util.Date;

public class ProdutoDuravel extends Produto{
	
	int durabilidade;
	

	public ProdutoDuravel(int durabilidade) 
	{
		super();
		this.durabilidade = durabilidade;
	}
	
	public ProdutoDuravel(String nome, double preco, String marca, String descricao, Date dataFabricacao, int durabilidade) 
	{
		super(nome, preco, marca, descricao, dataFabricacao);
		this.durabilidade = durabilidade;
	}



	/*
	 * Getters and Setters
	 */
	
	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
	
}
