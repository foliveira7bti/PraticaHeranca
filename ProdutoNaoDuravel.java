import java.util.Date;

/*
 * Classe para produto não duravel.
 * Atributo genero pode receber: alimentício,
limpeza, vestuário, higiene pessoal 
 */

public class ProdutoNaoDuravel extends Produto{
	
	Date dataValidade;
	String genero;
	
	public ProdutoNaoDuravel(Date dataValidade, String genero) 
	{
		super();
		this.dataValidade = dataValidade;
		this.genero = genero;
	}
	
	public ProdutoNaoDuravel(String nome, double preco, String marca, String descricao, Date dataFabricacao, Date dataValidade, String genero) 
	{
		super(nome, preco, marca, descricao, dataFabricacao);
		this.dataValidade = dataValidade;
		this.genero = genero;
	}
	
	

	/*
	 * Getters and Setters
	 */

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
