package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Servico;
import com.duckers.teart.repositories.ServicoRepository;
import org.springframework.stereotype.Service;

@Service
public class ServicoApplication {
    private ServicoRepository servicoRepositorie;

    public ServicoApplication(ServicoRepository servicoRepositorie) {
        this.servicoRepositorie = servicoRepositorie;
    }

    public void createServico(Servico servico) {
        servicoRepositorie.createPedido(servico);
    }

    public Servico getServicoById(int id) {
        return servicoRepositorie.getServicoById(id);
    }

    public List<Servico> getAllServicos() {
        return servicoRepositorie.getAllServico();
    }

    public void updateServico(int id, Servico servico) {
        servicoRepositorie.updateServico(id, servico);
    }

    public void deleteServico(int id) {
        servicoRepositorie.deleteServico(id);
    }
}
