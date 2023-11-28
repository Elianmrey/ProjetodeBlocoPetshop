package br.edu.infnet.appPetShop.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import br.edu.infnet.appPetShop.model.domain.Brinquedo;
@Service
@Order(5)
public class BrinquedoService {

    private final Map<Integer, Brinquedo> mapa = new HashMap<>();

    public void incluirBrinquedo(Brinquedo brinquedo)
    {
        mapa.put(brinquedo.getCodigo(), brinquedo);
    }

    public List<Brinquedo> obterBrinquedos(){

        return mapa.values().stream().toList();
    }
}
