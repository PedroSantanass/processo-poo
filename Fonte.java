
public class Fonte {
	int codigoProduto,estoque; 
	String descricao;
	double precoCusto, precoEstoque;
	
	void cadastrarFonte(int codigoProduto, String descricao, double precoCusto) {
		this.codigoProduto = codigoProduto;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
	}
	
	void produtoProduzido(int quantidadeProduzido) {
			estoque = estoque + quantidadeProduzido;
	}
	
	void produtoEscoado(int quantidadeEscoado) {
		estoque = estoque - quantidadeEscoado;
	}
	
	int consultarEstoque() {
		return estoque;
	}
	
	double consultarPrecoEstoque() {
		precoEstoque = precoCusto*estoque;
		return precoEstoque;
	}

}
