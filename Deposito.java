import java.util.ArrayList;

public class Deposito {
	
	private ArrayList<Produto> listaDeProdutos;
	
	public Deposito()
	{
		listaDeProdutos = new ArrayList<Produto>();
	}
	
	public void adicionarProduto(Produto p)
	{
		listaDeProdutos.add(p);
	}
	
	public void removerProduto(Produto p)
	{
		for(Produto p_:listaDeProdutos)
		{
			if(p.equals(p_))
			{
				
			}
		}
	}
	
	public int quantidadeProdutos()
	{
		//todo
		return 0;
	}
	
	public boolean estadoVazio()
	{
		//todo
		return false;
	}
	
	public Produto getMaiorPreco()
	{
		Produto p = new Produto();
		//
		return p;
	}
	

}
