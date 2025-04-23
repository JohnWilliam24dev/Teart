package com.duckers.teart.facades;

import java.util.List;

import com.duckers.teart.models.ServicoModel;
import com.duckers.teart.applications.ServicoApplication;
import org.springframework.stereotype.Component;

@Component
public class ServicoFacade {
  private ServicoApplication applicationServico;
   
  public ServicoFacade(ServicoApplication applicationServico){
    this.applicationServico = applicationServico;
  }

  public void cadastrar(ServicoModel servico) {
    applicationServico.createServico(servico);
    }

    public void atualizar(ServicoModel servico) {
        applicationServico.updateServico(servico);
    }

    public List<ServicoModel> listaServicos() {
        return applicationServico.getAllServicos();
    }

    public ServicoModel buscarServicoPorId(int id) {
        return applicationServico.getServicoById(id);
    }

    public void excluir(int id) {
        applicationServico.deleteServico(id);
    }
   
  /**/
}
