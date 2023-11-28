package br.edu.infnet.appPetShop.model.domain;




public class Brinquedo extends Produto {

    private String tipoBrinquedo;
    private String fabricante;
    private int avaliacaoMedia;
    private int idadeRecomendada;
    private boolean reciclavel;
    private String reciclavelFormat = reciclavel ? "Sim" : "Não";

    
    
    public String getTipoBrinquedo() {
		return tipoBrinquedo;
	}



	public void setTipoBrinquedo(String tipoBrinquedo) {
		this.tipoBrinquedo = tipoBrinquedo;
	}



	public String getFabricante() {
		return fabricante;
	}



	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}



	public int getAvaliacaoMedia() {
		return avaliacaoMedia;
	}



	public void setAvaliacaoMedia(int avaliacaoMedia) {
		this.avaliacaoMedia = avaliacaoMedia;
	}



	public int getIdadeRecomendada() {
		return idadeRecomendada;
	}



	public void setIdadeRecomendada(int idadeRecomendada) {
		this.idadeRecomendada = idadeRecomendada;
	}



	public boolean isReciclavel() {
		return reciclavel;
	}



	public void setReciclavel(boolean reciclavel) {
		this.reciclavel = reciclavel;
	}



	public String getReciclavelFormat() {
		return reciclavelFormat;
	}



	public void setReciclavelFormat(String reciclavelFormat) {
		this.reciclavelFormat = reciclavelFormat;
	}



	@Override
    public String toString()
    {
        return "[Brinquedo]" + super.toString() +";"+ tipoBrinquedo +";"+ fabricante +";"+ avaliacaoMedia +";"+ idadeRecomendada +";"+ reciclavelFormat;
    }

}