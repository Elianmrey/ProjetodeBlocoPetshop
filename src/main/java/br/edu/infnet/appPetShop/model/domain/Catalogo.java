package br.edu.infnet.appPetShop.model.domain;

import java.util.List;

public class Catalogo {

    private List<Produto> produtosLista;
    private List<Servico> servicosLista;

    private boolean estado = false;

    private String categoria = estado == true? "Produto" : "Servico";

    private final Catalogo instanciaCatalogo = new Catalogo();

    public Catalogo GetCatalogo()
    {
        return instanciaCatalogo;
    }
    public List<Produto> getProdutosLista()
    {return this.produtosLista;}
    
    public void setProdutosLista(List<Produto> produto)
    {
    	this.produtosLista = produto;
    }
    public List<Servico> getServicosLista()
    {return this.servicosLista;}
    
    public void setServicosLista(List<Servico> servico)
    {
    	this.servicosLista = servico;
    }
    
}
