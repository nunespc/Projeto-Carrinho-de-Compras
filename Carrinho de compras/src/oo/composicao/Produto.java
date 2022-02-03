package oo.composicao;

public class Produto {
	
	final String nome;
	final double preco;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString() {
		return nome;
	}
}
