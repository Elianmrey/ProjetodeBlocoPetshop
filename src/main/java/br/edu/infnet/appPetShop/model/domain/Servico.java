package br.edu.infnet.appPetShop.model.domain;



public class Servico {

    private double valor;
    private String categoria;
    private int avaliacao;
    private String nomeEspecialista;
    private String areaEspecialista;
    private String tipoAtendimento;
    private int codigo;


    public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public int getAvaliacao() {
		return avaliacao;
	}


	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}


	public String getNomeEspecialista() {
		return nomeEspecialista;
	}


	public void setNomeEspecialista(String nomeEspecialista) {
		this.nomeEspecialista = nomeEspecialista;
	}


	public String getAreaEspecialista() {
		return areaEspecialista;
	}


	public void setAreaEspecialista(String areaEspecialista) {
		this.areaEspecialista = areaEspecialista;
	}


	public String getTipoAtendimento() {
		return tipoAtendimento;
	}


	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	@Override
    public String toString()
    {
        return getValor() + ";" + getCategoria() + ";" + getAvaliacao() + ";" + getNomeEspecialista() + ";" + getAreaEspecialista() + ";" + getTipoAtendimento() + ";" + getCodigo();
    }
}