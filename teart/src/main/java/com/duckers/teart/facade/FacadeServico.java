package com.duckers.teart.facade;
import java.util.List;
import com.duckers.teart.entities.Servico;
import com.duckers.teart.application.ServicoApplication;

public class FacadeServico {
  private ServicoApplication applicationServico;
   
  public FacadeServico(ServicoApplication applicationServico){
    this.applicationServico = applicationServico;
  }

  public void cadastrar(Servico servico) {
    applicationServico.createServico(servico);
    }

    public void atualizar(int id, Servico servico) {
        applicationServico.updateServico(id, servico);
    }

    public List<Servico> listaServicos() {
        return applicationServico.getAllServicos();
    }

    public Servico buscarServicoPorId(int id) {
        return applicationServico.getServicoById(id);
    }

    public void excluir(int id) {
        applicationServico.deleteServico(id);
    }
   
  /**/
}
