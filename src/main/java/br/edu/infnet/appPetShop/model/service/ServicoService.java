package br.edu.infnet.appPetShop.model.service;

import br.edu.infnet.appPetShop.model.domain.Servico;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class ServicoService {

    private final Map<Integer, Servico> mapa = new HashMap<>();

    public void incluirServico(Servico servico)
    {
        mapa.put(servico.getCodigo(), servico);
    }

    public List<Servico> obterServicos(){

        return mapa.values().stream().toList();
    }
}
