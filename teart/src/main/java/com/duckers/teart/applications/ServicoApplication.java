package com.duckers.teart.applications;
import java.util.List;

import com.duckers.teart.models.ServicoModel;
import com.duckers.teart.repositories.ServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicoApplication {
    private ServicoRepository servicoRepository;

    public ServicoApplication(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public void createServico(ServicoModel servico) {
        servicoRepository.createPedido(servico);
    }

    public ServicoModel getServicoById(int id) {
        return servicoRepository.getServicoById(id);
    }

    public List<ServicoModel> getAllServicos() {
        return servicoRepository.getAllServico();
    }

    public void updateServico(ServicoModel servico) {
        servicoRepository.updateServico(servico);
    }

    public void deleteServico(int id) {
        servicoRepository.deleteServico(id);
    }
}
