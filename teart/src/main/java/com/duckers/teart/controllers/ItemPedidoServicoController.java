package com.duckers.teart.controllers;
import com.duckers.teart.entities.ItemPedidoServico;
import com.duckers.teart.facades.ItemPedidoServicoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item-pedido-servico")
public class ItemPedidoServicoController {
    private final ItemPedidoServicoFacade itemPedidoServicoFacade;

    @Autowired
    public ItemPedidoServicoController(ItemPedidoServicoFacade itemPedidoServicoFacade) {
        this.itemPedidoServicoFacade = itemPedidoServicoFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createItemPedidoServico(@RequestBody ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoFacade.cadastrar(itemPedidoServico);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedidoServico> getItemPedidoServicoById(@PathVariable long id) {
        ItemPedidoServico itemPedidoServico = itemPedidoServicoFacade.buscarItemPedidoServicoPorId(id);
        if (itemPedidoServico != null) {
            return ResponseEntity.ok(itemPedidoServico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ItemPedidoServico>> getAllItemPedidosServico() {
        List<ItemPedidoServico> itemPedidoServicos = itemPedidoServicoFacade.itemPedidosServicoList();
        return ResponseEntity.ok(itemPedidoServicos);
    }

    @PutMapping("")
    public ResponseEntity<Void> updateItemPedidoServico( @RequestBody ItemPedidoServico itemPedidoServico) {
        itemPedidoServicoFacade.atualizar(itemPedidoServico);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItemPedidoServico(@PathVariable long id) {
        itemPedidoServicoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
