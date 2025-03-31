package com.duckers.teart.repositories;

import java.util.List;
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
        Servico servicoPersistido = getServicoById(id);
        servicoPersistido.setNome(servicoAtualizado.getNome());
        servicoPersistido.setDescricao(servicoAtualizado.getDescricao());
        servicoPersistido.setValorMinimo(servicoAtualizado.getValorMinimo());
        servicoPersistido.setValorMaximo(servicoAtualizado.getValorMaximo());
        servicoRepository.save(servicoPersistido);
    }

    public void deleteServico(long id) {
        servicoRepository.deleteById(id);
    }
}
