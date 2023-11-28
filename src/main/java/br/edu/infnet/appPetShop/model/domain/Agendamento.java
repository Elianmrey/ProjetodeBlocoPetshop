package br.edu.infnet.appPetShop.model.domain;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;

import java.time.LocalDateTime;



public class Agendamento {

    private Servico servico;
    private Solicitante solicitante;
    private LocalDateTime dataHora;

    public Agendamento() {}
    
    public Agendamento(Servico servico, Solicitante solicitante,LocalDateTime dataHora)
    {
    	this.servico = servico;
    	this.solicitante = solicitante;
    	this.dataHora = dataHora;
    }
    
    
    public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}



	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}



	public LocalDateTime getDataHora() {
		return dataHora;
	}



	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}



	@Override
    public String toString()
    {
        return servico.toString() + "; " + solicitante.toString() + "; " + dataHora.format(ISO_LOCAL_DATE_TIME) + ". ";
    }
}