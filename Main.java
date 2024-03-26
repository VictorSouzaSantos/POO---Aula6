package Aula6;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Livro 1", Tipo.ESCOLAR, 60);
		Produto p2 = new Produto("Livro 2", Tipo.ESCOLAR, 70);
		Produto p3 = new Produto("Caneta", Tipo.ESCRITORIO, 20);
		Produto p4 = new Produto("Pen Drive", Tipo.TECNOLOGIA, 90);
		Produto p5 = new Produto("Disquete 3/4", Tipo.TECNOLOGIA, 5);
		
		Carrinho c = new Carrinho(4);
		
		c.inserir(p1, 0);
		c.inserir(p2, 1);
		c.inserir(p3, 2);
		c.inserir(p4, 3);
		c.inserir(p5, 2);
		c.listar();
		c.mostrarValorTotal();
		c.listarEscolar();
		
		System.out.println("Média dos valores dos produtos: " + c.calcularMedia());
		
		c.buscarProduto("Livro 1");

	}

}
