package oo.composicao;

public class Carrinho {
	public static void main(String[] args) {
				
		Compra com1 = new Compra();
		com1.adicionarItem("Notebook", 2500, 2);
		com1.adicionarItem(new Produto("Roteador", 150), 1);
		
		Compra com2 = new Compra();
		com2.adicionarItem("Caneta", 1.5, 50);
		com2.adicionarItem(new Produto("SSD 240GB", 250), 2);
		
		
		Cliente c = new Cliente("Wanderson Nunes");
		c.adicionarCompra(com1);
		c.adicionarCompra(com2);
		
		System.out.println(c.obterValorTotal());
	}

}
