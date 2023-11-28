package br.edu.infnet.appPetShop.model.service;

import br.edu.infnet.appPetShop.model.domain.Solicitante;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Order(10)
public class SolicitanteService {

    private final Map<String, Solicitante> mapa = new HashMap<>();

    public void incluirSolicitante(Solicitante solicitante)
    {
        mapa.put(solicitante.getCpf(), solicitante);
    }

    public List<Solicitante> obterSolicitantes(){

        return mapa.values().stream().toList();
    }
}