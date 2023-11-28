package br.edu.infnet.appPetShop.model.domain;


public class ProdUtilitario extends Produto {
	

	    private String fabricante;
	    private String tipo;
	    
		public String getFabricante() {
			return fabricante;
		}
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		@Override
		public String toString()
		{
			return "[Produto Utilitario]"+ super.toString() + fabricante + tipo;
		}

	
}
