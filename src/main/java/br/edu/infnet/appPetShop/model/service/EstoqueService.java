package br.edu.infnet.appPetShop.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appPetShop.model.domain.Produto;
@Service
public class EstoqueService {

    private final Map<Integer, Produto> mapa = new HashMap<>();

    public void incluirNoEstoque(Produto produto)
    {
        mapa.put(produto.getCodigo(), produto);
    }

    public List<Produto> obterEstoque(){

        return mapa.values().stream().toList();
    }
}
