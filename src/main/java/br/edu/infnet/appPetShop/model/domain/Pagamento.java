package br.edu.infnet.appPetShop.model.domain;

import java.time.LocalDate;

public class Pagamento {

    private int cartaoCredito;
    private LocalDate dataVencimento;
    private int cvcCodigoSeguranca;
    
    
	public int getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(int cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public int getCvcCodigoSeguranca() {
		return cvcCodigoSeguranca;
	}
	public void setCvcCodigoSeguranca(int cvcCodigoSeguranca) {
		this.cvcCodigoSeguranca = cvcCodigoSeguranca;
	}

    
    
}

