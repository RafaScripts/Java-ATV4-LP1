package software;

import produto.produto;

public class software extends produto{
	protected double versao;
	
	
	public software(String descricao, double peco, int qtdestoque, double versao){
		super(descricao, peco, qtdestoque);
		this.versao = versao;
	}

	public void imprimir() {
		System.out.println("Loja do Barreto");
		System.out.println("==================");
		System.out.println("Especializado em vendas");
		System.out.println("==================");
		System.out.println("descri��o: " + descricao);
		System.out.println("pre�o: " + peco);
		System.out.println("quantidade no Estoque: " + qtdestoque);
		System.out.println("==================");
		System.out.println("Sistema vers�o: " + versao);
	}
}
