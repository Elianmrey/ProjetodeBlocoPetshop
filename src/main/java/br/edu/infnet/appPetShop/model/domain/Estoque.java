package br.edu.infnet.appPetShop.model.domain;

import java.time.LocalDate;
import java.util.List;

public class Estoque {

    private List<Produto> produtosEmEstoque;
    private double valorUnitario;
    private double valorTotalEstoque;
    private LocalDate validade;
    
    
	public List<Produto> getProdutosEmEstoque() {
		return produtosEmEstoque;
	}
	public void setProdutosEmEstoque(List<Produto> produtosEmEstoque) {
		this.produtosEmEstoque = produtosEmEstoque;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getValorTotalEstoque() {
		return valorTotalEstoque;
	}
	public void setValorTotalEstoque(double valorTotalEstoque) {
		this.valorTotalEstoque = valorTotalEstoque;
	}
	public LocalDate getValidade() {
		return validade;
	}
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}


    
    
}