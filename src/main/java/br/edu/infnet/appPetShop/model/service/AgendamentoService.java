package br.edu.infnet.appPetShop.model.service;

import br.edu.infnet.appPetShop.model.domain.Agendamento;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appPetShop.model.domain.Agendamento;
@Service

public class AgendamentoService {


    private final Map<LocalDateTime, Agendamento> mapa = new HashMap<>();

    public void incluirAgendamento(Agendamento agendamento)
    {
        mapa.put(agendamento.getDataHora(), agendamento);
    }

    public List<Agendamento> obterAgendamentos(){

        return mapa.values().stream().toList();
    }
}
