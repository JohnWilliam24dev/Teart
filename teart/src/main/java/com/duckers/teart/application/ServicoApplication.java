package com.duckers.teart.application;
import java.util.List;
import com.duckers.teart.entities.Servico;
import com.duckers.teart.repositories.origin.ServicoRepositorie;
import org.springframework.stereotype.Service;

@Service
public class ServicoApplication {
    private ServicoRepositorie servicoRepositorie;

    public ServicoApplication(ServicoRepositorie servicoRepositorie) {
        this.servicoRepositorie = servicoRepositorie;
    }

    public void createServico(Servico servico) {
        servicoRepositorie.add(servico);
    }

    public Servico getServicoById(int id) {
        return servicoRepositorie.getServicoById(id);
    }

    public List<Servico> getAllServicos() {
        return servicoRepositorie.getServicosList();
    }

    public void updateServico(int id, Servico servico) {
        servicoRepositorie.update(id, servico);
    }

    public void deleteServico(int id) {
        servicoRepositorie.remove(id);
    }
}
