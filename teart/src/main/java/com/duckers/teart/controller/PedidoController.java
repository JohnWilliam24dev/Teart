package com.duckers.teart.controller;
import com.duckers.teart.entities.Pedido;
import com.duckers.teart.facade.PedidoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoFacade pedidoFacade;

    @Autowired
    public PedidoController(PedidoFacade pedidoFacade) {
        this.pedidoFacade = pedidoFacade;
    }

    @PostMapping
    public ResponseEntity<Void> createPedido(@RequestBody Pedido pedido) {
        pedidoFacade.cadastrar(pedido);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable int id) {
        Pedido pedido = pedidoFacade.buscarPedidoPorId(id);
        if (pedido != null) {
            return ResponseEntity.ok(pedido);
        } else {
            return ResponseEntity.notFound().build(); // retorna um cod HTTP (ex 404)
        }
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> getAllPedidos() {
        List<Pedido> pedidos = pedidoFacade.pedidosList();
        return ResponseEntity.ok(pedidos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePedido(@PathVariable int id, @RequestBody Pedido pedido) {
        pedidoFacade.atualizar(id, pedido);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable int id) {
        pedidoFacade.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
