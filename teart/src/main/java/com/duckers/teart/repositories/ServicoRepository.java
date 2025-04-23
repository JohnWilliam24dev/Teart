package com.duckers.teart.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.duckers.teart.models.ServicoModel;
import com.duckers.teart.repositories.interfaces.ServicoJPA;

@Repository
public class ServicoRepository {
    private ServicoJPA servicoRepository;
    public ServicoRepository(ServicoJPA servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public void createPedido(ServicoModel servico) {
        servicoRepository.save(servico);
    }

    public ServicoModel getServicoById(long id) {
        return servicoRepository.findById(id).get();
    }

    public List<ServicoModel> getAllServico() {
        return servicoRepository.findAll();
    }

    public void updateServico(ServicoModel servico) {
        this.servicoRepository.save(servico);
    }

    public void deleteServico(long id) {
        servicoRepository.deleteById(id);
    }
}
