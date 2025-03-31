package com.duckers.teart.applications;
import java.util.List;
import com.duckers.teart.entities.Servico;
import com.duckers.teart.repositories.ServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicoApplication {
    private ServicoRepository servicoRepository;

    public ServicoApplication(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public void createServico(Servico servico) {
        servicoRepository.createPedido(servico);
    }

    public Servico getServicoById(int id) {
        return servicoRepository.getServicoById(id);
    }

    public List<Servico> getAllServicos() {
        return servicoRepository.getAllServico();
    }

    public void updateServico(int id, Servico servico) {
        servicoRepository.updateServico(id, servico);
    }

    public void deleteServico(int id) {
        servicoRepository.deleteServico(id);
    }
}
