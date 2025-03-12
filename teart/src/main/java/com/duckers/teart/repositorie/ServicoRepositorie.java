package com.duckers.teart.repositorie;
import com.duckers.teart.entities.Servico;
import java.util.ArrayList;
import java.util.List;

public class ServicoRepositorie {
    List<Servico> servicos = new ArrayList<>();

    public Servico getServicoById(int id) {
        return servicos.stream().filter(servico -> servico.getId() == id).findFirst().orElse(null);
    }

    public void add(Servico servico) {
        servicos.add(servico);
    }

    public void remove(int id) {
        Servico servico = getServicoById(id);
        if (!servico.equals(null))
            servicos.remove(servico);
    }

    public void update(int id, Servico servicoUpdate){
        Servico servico  = getServicoById(id);
        servico.setDescricao(servicoUpdate.getDescricao());
        servico.setValoMinimo(servicoUpdate.getValoMinimo());
        servico.setValorMaximo(servicoUpdate.getValorMaximo());
    }

    public List<Servico> getServicosList() {
        return servicos;
    }
}