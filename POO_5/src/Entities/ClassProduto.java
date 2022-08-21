package Entities;

public class ClassProduto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotalEstoque() {
		double valorTotalEstoque = preco*quantidade;
		return valorTotalEstoque;
	}
	
	public void addProduto(int quant) {    // metodo adiciona produto
		quantidade = quantidade + quant;   // quantidade += quant;
	}
	
	public void removeProduto(int quant) {
		quantidade = quantidade - quant;   // quantidade -= quant;
	}
	public String toString() {
		return
				"O produto "+nome+", de preco R$ "+preco+", possui "+quantidade
				+" unidades, totalizando um valor de R$ "+valorTotalEstoque()+".";
	}

}
