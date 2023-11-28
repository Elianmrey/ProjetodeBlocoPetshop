package br.edu.infnet.appPetShop;


import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appPetShop.model.domain.Endereco;
import br.edu.infnet.appPetShop.model.domain.Solicitante;
import br.edu.infnet.appPetShop.model.service.SolicitanteService;



@Component
@Repository
public class SolicitanteLoader implements ApplicationRunner {

    @Autowired
    SolicitanteService service;

    @Override
    @Order(1)
    public void run(ApplicationArguments args) throws Exception  {
      final String rota = "files/Solicitantes.txt";
        FileReader arquivo;
        arquivo = new FileReader(rota);
        BufferedReader leitordeLinha = new BufferedReader(arquivo);

        String leitura = leitordeLinha.readLine();
        String[] dataSet;

        while ( leitura != null)
        {

            dataSet = leitura.split(";");


            Solicitante cliente = GetSolicitante(dataSet);

            service.incluirSolicitante(cliente);

            leitura = leitordeLinha.readLine();
        }
        for(Solicitante solicitante: service.obterSolicitantes() )
        {
            System.out.println("[Solicitante:] " +  solicitante);
        }
    }


    private static Solicitante GetSolicitante(String[] dataSet) {
        Solicitante cliente = new Solicitante();
        cliente.setNome(dataSet[0]);
        cliente.setCpf(dataSet[1]);
        cliente.setEmail(dataSet[2]);

        Endereco endereco = new Endereco();
        endereco.setLogradouro(dataSet[3]);
        endereco.setCidade(dataSet[4]);
        endereco.setEstado(dataSet[5]);
        endereco.setCep(dataSet[6]);
        endereco.setNumero(dataSet[7]);

        cliente.setEndereco(endereco);
        cliente.setTipoPet(dataSet[8]);
        
        cliente.setPedido(null);     //Alguns relacionamentos ainda não implementados
        
        return cliente;
    }


}