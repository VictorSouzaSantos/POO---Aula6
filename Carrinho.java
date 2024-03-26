package Aula6;

public class Carrinho {
	
	private Produto[] produtos;
	
	public Carrinho(int tamanho) {
		produtos = new Produto[tamanho];
	}
	
	public void inserir(Produto p, int i) {
		if(i < 0 || i >= produtos.length) {
			System.out.println("Erro, fora de indice");
			return;
		}
		
	if(produtos[i] != null) {
		System.out.println("Erro, há indice já alocado");
	}
		
	if(p == null) {
		System.out.println("Produto com erro");
		return;
	}
	
	produtos[i] = p;
		
	}
	
	public void remover(int i) {
		if(i < 0 || i > produtos.length) {
			System.out.println("Erro");
			return;
		}
	produtos[i] = null;
	
	}
	
	public void listarEscolar() {
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i]!= null && produtos[i].isEscolar()) {
				System.out.println("Valor do produto " + i + ": " + produtos[i].valor());
			}
		}
		
	}
	
	public void listar() {
		for(int i = 0; i < produtos.length; i++) {
			produtos[i].mostrar();
		}
	}
	
	public void mostrarValorTotal() {
		double soma = 0;
		for(int i = 0; i < produtos.length; i++) {
			soma = soma + produtos[i].valor();
		}
		System.out.println("Total: R$ " + soma);
	}
	
	public double calcularMedia() {
		double soma = 0;
		int qntd = 0;
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] != null) {
				soma = soma + produtos[i].valor();
				qntd++;
			}
		}
		if(qntd == 0) {
			return 0;
		}else {
			return soma / qntd;
		}
	}
	
	public void buscarProduto(String nome) {
	    boolean encontrado = false;
	    for (Produto produto : produtos) {
	        if (produto != null && produto.nome().equalsIgnoreCase(nome)) {
	            produto.mostrar();
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("Produto não encontrado");
	    }
	}
}

