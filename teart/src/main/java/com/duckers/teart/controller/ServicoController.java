package com.duckers.teart.controller;
import com.duckers.teart.entities.Servico;
import com.duckers.teart.facade.ServicoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {
    private final ServicoFacade servicoFacade;

    @Autowired
    public ServicoController(ServicoFacade servicoFacade) {
        this.servicoFacade = servicoFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createServico(@RequestBody Servico servico) {
        servicoFacade.cadastrar(servico);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> getServicoById(@PathVariable int id) {
        Servico servico = servicoFacade.buscarServicoPorId(id);
        if (servico != null) {
            return ResponseEntity.ok(servico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Servico>> getAllServicos() {
        List<Servico> servicos = servicoFacade.listaServicos();
        return ResponseEntity.ok(servicos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateServico(@PathVariable int id, @RequestBody Servico servico) {
        servicoFacade.atualizar(id, servico);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServico(@PathVariable int id) {
        servicoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}