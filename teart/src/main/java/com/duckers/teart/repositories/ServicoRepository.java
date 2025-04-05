package com.duckers.teart.repositories;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import com.duckers.teart.entities.Servico;
import com.duckers.teart.repositories.interfaces.ServicoJPA;

@Repository
public class ServicoRepository {
    private ServicoJPA servicoRepository;
    public ServicoRepository(ServicoJPA servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public void createPedido(Servico servico) {
        servicoRepository.save(servico);
    }

    public Servico getServicoById(long id) {
        return servicoRepository.findById(id).get();
    }

    public List<Servico> getAllServico() {
        return servicoRepository.findAll();
    }

    public void updateServico(long id, Servico servicoAtualizado) {
        Servico servicoPersistido = this.servicoRepository.findById(id).get();
        BeanUtils.copyProperties(servicoAtualizado, servicoPersistido, "id");
        this.servicoRepository.save(servicoPersistido);
    }

    public void deleteServico(long id) {
        servicoRepository.deleteById(id);
    }
}
