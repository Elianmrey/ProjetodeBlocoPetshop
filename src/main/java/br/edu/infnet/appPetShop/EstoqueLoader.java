package br.edu.infnet.appPetShop;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appPetShop.model.domain.Brinquedo;
import br.edu.infnet.appPetShop.model.domain.ProdUtilitario;
import br.edu.infnet.appPetShop.model.domain.Produto;
import br.edu.infnet.appPetShop.model.service.EstoqueService;

@Component
@Repository
@Order(2)
public class EstoqueLoader implements ApplicationRunner {

	    @Autowired
	      EstoqueService estoqueService;


	    @Override
	    public void run(ApplicationArguments args) throws Exception {

	        final String rota = "files/Estoque.txt";
	        FileReader arquivo = new FileReader(rota);
	        BufferedReader leitordeLinha = new BufferedReader(arquivo);

	        String leitura = leitordeLinha.readLine();
	        String[] dataSet;

	        while (leitura != null) {

	            dataSet = leitura.split(";");
	         
	           
	            switch(dataSet[0])
	            {
	            case "B":
	            	
	            	Produto produtoBrinquedo = getProdutosEstoque(dataSet);
	            	estoqueService.incluirNoEstoque(produtoBrinquedo);
	            	
	            break;
	            case "P":
	            	Produto produtoUtilitario = getProdutosUtilEstoque(dataSet);
	            	estoqueService.incluirNoEstoque(produtoUtilitario);
		            break;
	            }

	            leitura = leitordeLinha.readLine();
	            

	            

	        }
	        for (Produto produto : estoqueService.obterEstoque()) {
	            System.out.println("[Produto em Estoque:] " + produto);
	        }
	    }


	    private static Brinquedo getProdutosEstoque(String[] dataSet) {

	        Brinquedo brinquedo = new Brinquedo();

	        brinquedo.setNome(dataSet[1]);
	        brinquedo.setValor(Double.parseDouble(dataSet[2]));
	        brinquedo.setCategoria(dataSet[3]);
	        brinquedo.setCodigo(Integer.parseInt(dataSet[4]));
	        brinquedo.setTipoBrinquedo(dataSet[5]);
	        brinquedo.setFabricante(dataSet[6]);
	        brinquedo.setAvaliacaoMedia(Integer.parseInt(dataSet[7]));
	        brinquedo.setIdadeRecomendada(Integer.parseInt(dataSet[8]));
	        brinquedo.setReciclavel(Boolean.parseBoolean(dataSet[9]));

	        return brinquedo;
	    }

	    private static ProdUtilitario getProdutosUtilEstoque(String[] dataSet) {

	    	ProdUtilitario produtilitario = new ProdUtilitario();

	    	produtilitario.setNome(dataSet[1]);
	    	produtilitario.setValor(Double.parseDouble(dataSet[2]));
	    	produtilitario.setCategoria(dataSet[3]);
	    	produtilitario.setCodigo(Integer.parseInt(dataSet[4]));
	    	produtilitario.setFabricante(dataSet[5]);
	    	produtilitario.setTipo(dataSet[6]);
	        

	        return produtilitario;
	    }


}
