package br.edu.infnet.appPetShop.model.domain;


import java.util.List;


public class Solicitante {

    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
    private String tipoPet;
    private Pedido pedido;


    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTipoPet() {
		return tipoPet;
	}


	public void setTipoPet(String tipoPet) {
		this.tipoPet = tipoPet;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}





	@Override
    public String toString()
    {
        return "Nome: " + getNome() + "; CPF: " + getCpf() + "; E-mail: " + getEmail() + "; Endereço: " + getEndereco() + "; Tipo de Pet: " + getTipoPet() + "; Agendamentos Confirmados: " + getPedido()  + "; Produtos Adquiridos: ";
    }
}
