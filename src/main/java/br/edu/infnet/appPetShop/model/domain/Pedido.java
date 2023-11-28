package br.edu.infnet.appPetShop.model.domain;

import java.util.List;

public class Pedido {

    private List<Produto> listaProduto;
    private List<Servico> listaServico;
    private boolean entrega;
    private double valorTotalPedido;
    private Solicitante solicitante;
    
    

	
	public List<Produto> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(List<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public List<Servico> getListaServico() {
		return listaServico;
	}
	public void setListaServico(List<Servico> listaServico) {
		this.listaServico = listaServico;
	}
	public boolean isEntrega() {
		return entrega;
	}
	public void setEntrega(boolean entrega) {
		this.entrega = entrega;
	}
	public double getValorTotalPedido() {
		return valorTotalPedido;
	}
	public void setValorTotalPedido(double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}
    
}
