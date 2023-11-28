package br.edu.infnet.appPetShop.model.domain;



public class Endereco {

    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    

    public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	@Override
    public String toString()
    {
        return "Rua: "+getLogradouro() + ", Número: " + getNumero() + " ," + getCidade() + " - " + getEstado() + ". CEP: " + getCep() + ". ";
    }
}