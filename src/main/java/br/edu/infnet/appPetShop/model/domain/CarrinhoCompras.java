package br.edu.infnet.appPetShop.model.domain;

import java.util.List;

public class CarrinhoCompras {


	    private Pagamento pagamento;
	    private String cuponDeconto;
	    private Solicitante solicitante;
	    private List<Produto> listCompraProdutos;
	    private List<Agendamento> listAgendamentoServicos;
	    
	    
		public Pagamento getPagamento() {
			return pagamento;
		}
		public void setPagamento(Pagamento pagamento) {
			this.pagamento = pagamento;
		}
		public String getCuponDeconto() {
			return cuponDeconto;
		}
		public void setCuponDeconto(String cuponDeconto) {
			this.cuponDeconto = cuponDeconto;
		}
		public Solicitante getSolicitante() {
			return solicitante;
		}
		public void setSolicitante(Solicitante solicitante) {
			this.solicitante = solicitante;
		}
		public List<Produto> getListCompraProdutos() {
			return listCompraProdutos;
		}
		public void setListCompraProdutos(List<Produto> listCompraProdutos) {
			this.listCompraProdutos = listCompraProdutos;
		}
		public List<Agendamento> getListAgendamentoServicos() {
			return listAgendamentoServicos;
		}
		public void setListAgendamentoServicos(List<Agendamento> listAgendamentoServicos) {
			this.listAgendamentoServicos = listAgendamentoServicos;
		}
	    

	

}
