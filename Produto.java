import java.util.Date;
import java.util.Objects;

public class Produto {
	
	String nome;
	double preco;
	String marca;
	String descricao;
	Date dataFabricacao;
	
	public Produto()
	{
		//Construtor Vazio
	}
	
	public Produto(String nome, double preco, String marca, String descricao, Date dataFabricacao) 
	{
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
	}

	/*
	 * Getters and Setters
	 */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataFabricacao, descricao, marca, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(dataFabricacao, other.dataFabricacao) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(marca, other.marca) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
	
	
	
	
	

}
